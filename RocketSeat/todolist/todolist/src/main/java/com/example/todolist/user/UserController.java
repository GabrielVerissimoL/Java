package com.example.todolist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import at.favre.lib.crypto.bcrypt.BCrypt;

@RestController
@RequestMapping("/users")   //Define a rota padrão dessa classe, o que chegar nessa rota vem para ca  
public class UserController {

    @Autowired 
    private IUserRepository userRepository; //Spring lê essa interface e cria toda a lógica de acesso ao banco de dados automaticamente


    @PostMapping("/")
    public ResponseEntity create(@RequestBody UserModel userModel) {
        
        //Erro na criação (Usuário já existe)
        if (this.userRepository.findByUsername(userModel.getUsername()) != null) {

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuário já existe"); 
        }

        //Gerando o hash da senha e colocando em uma variável
        var PasswordHash = BCrypt.withDefaults()
        .hashToString(12, userModel.getPassword().toCharArray());

        //Utilizando método set para realmente utilizar o hash como senha
        userModel.setPassword(PasswordHash);

        var userCreated = this.userRepository.save(userModel);

        //Sucesso
        return ResponseEntity.status(HttpStatus.CREATED).body(userCreated);
    }
}