package com.example.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data //Getters e Setters
@Entity(name = "tb_user") //Gera uma tabela com o nome indicado
public class UserModel {
    
    @Id
    @GeneratedValue(generator = "UUID") 
    private UUID id;
    
    @Column(unique = true) //Username vai ser uma coluna com valor único, nao repete
    private String username;
    private String name;
    private String password;

    @CreationTimestamp 
    private LocalDateTime createdAt;
}
