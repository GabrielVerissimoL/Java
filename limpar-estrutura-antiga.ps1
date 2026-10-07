# Script de limpeza — reorganizacao do repositorio Java
# Execute com botao direito > "Executar com PowerShell"

$base = "G:\Meu Drive\CODIGOS\Java"

Write-Host "==> Movendo projeto Maven (corrigindo typo)..." -ForegroundColor Cyan
$mavenSrc = "$base\Maven\maven-rpoject"
$mavenDst = "$base\05-maven\maven-project"
New-Item -ItemType Directory -Path $mavenDst -Force | Out-Null
Copy-Item -Path "$mavenSrc\*" -Destination $mavenDst -Recurse -Force
Write-Host "    OK: maven-rpoject -> 05-maven/maven-project" -ForegroundColor Green

Write-Host "==> Removendo pastas antigas..." -ForegroundColor Cyan
Remove-Item -Recurse -Force "$base\Classe"               -ErrorAction SilentlyContinue
Remove-Item -Recurse -Force "$base\EstruturasDeControle" -ErrorAction SilentlyContinue
Remove-Item -Recurse -Force "$base\Exercicios"           -ErrorAction SilentlyContinue
Remove-Item -Recurse -Force "$base\Maven"                -ErrorAction SilentlyContinue
Remove-Item -Recurse -Force "$base\out"                  -ErrorAction SilentlyContinue
Remove-Item -Recurse -Force "$base\.idea"                -ErrorAction SilentlyContinue
Write-Host "    OK: pastas antigas removidas" -ForegroundColor Green

Write-Host "==> Removendo arquivos soltos da raiz..." -ForegroundColor Cyan
Remove-Item -Force "$base\Main.java"         -ErrorAction SilentlyContinue
Remove-Item -Force "$base\Main.class"        -ErrorAction SilentlyContinue
Remove-Item -Force "$base\Conta.java"        -ErrorAction SilentlyContinue
Remove-Item -Force "$base\Conta.class"       -ErrorAction SilentlyContinue
Remove-Item -Force "$base\Operadores1.java"  -ErrorAction SilentlyContinue
Remove-Item -Force "$base\Operadores1.class" -ErrorAction SilentlyContinue
Remove-Item -Force "$base\scanf.java"        -ErrorAction SilentlyContinue
Remove-Item -Force "$base\scanf.class"       -ErrorAction SilentlyContinue
Remove-Item -Force "$base\CODIGOS.iml"       -ErrorAction SilentlyContinue
Write-Host "    OK: arquivos soltos removidos" -ForegroundColor Green

Write-Host ""
Write-Host "Reorganizacao concluida! Estrutura final:" -ForegroundColor Yellow
Get-ChildItem -Path $base | Select-Object Name, LastWriteTime | Format-Table -AutoSize

Read-Host "Pressione Enter para fechar"
