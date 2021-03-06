<p align="center">
  <a href="#projeto">Projeto</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#tecnologias">Tecnologias</a>&nbsp;&nbsp;&nbsp;|
  &nbsp;&nbsp;
    <a href="#executar">Executar</a>&nbsp;&nbsp;&nbsp;|
  &nbsp;&nbsp;
  <a href="#licença">Licença</a>
</p>

<p align="center">
  <img alt="License" src="https://img.shields.io/static/v1?label=license&message=MIT&color=49AA26&labelColor=000000">
</p>

<p align="center">
 
  <img alt="diagrama" src="https://user-images.githubusercontent.com/8337562/161342012-19c7011b-6261-489f-b450-7b9e5f50d7c2.png" width="20%">
</p>

<p align="center">
    <a href="https://twitter.com/axndmathias" target="_blank">
    <img align="center" src="https://img.shields.io/badge/-axndmathias-05122A?style=flat&logo=twitter" alt="twitter"/>  
    </a>
    <a href="https://www.instagram.com/axnd/" target="_blank">
    <img align="center" src="https://img.shields.io/badge/-axnd-05122A?style=flat&logo=instagram" alt="instagram"/>
    </a>
    <a href="https://ch.linkedin.com/in/axndmathias" target="_blank">
    <img align="center" src="https://img.shields.io/badge/-axndmathias-05122A?style=flat&logo=linkedin" alt="linkedin"/>
    </a>
    </a>
</p>

## Projeto

Desafio [DevSuperior](https://devsuperior.com.br "Site da DevSuperior") para entregar (trabalho final do capítulo 1).

Projeto configurado com um ambiente de testes e acessando o banco de dados H2, utilizando Maven como gerenciador de dependências, e Java 11 como linguagem.

Entrega de um projeto Spring Boot 2.4.4 com CRUD completo de web services REST para acessar um recurso de clientes, contendo as cinco operações básicas:
- Busca paginada de recursos
- Busca de recurso por id
- Inserir novo recurso
- Atualizar recurso
- Deletar recurso



## Tecnologias

Esse projeto foi desenvolvido com as seguintes tecnologias:
- Java 11
- Spring boot
- Maven
- H2 Database
- Spring Data Jpa
- Postman

## Como executar o projeto

#### Pré-requisitos
Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:

- IDE para desenvolvimento JAVA como Spring Tool Suite 4, IntelliJ IDEA ou Visual Studio Code
- Gerenciador de dependências Maven
- Postman para testar os verbos HTTP

#### Back end

```bash
# clonar repositório
git clone https://github.com/axndmathias/dsclientes-api.git
# Importe o projeto na sua IDE
# Aguarde a sincronização das dependências do Maven
# Execute a aplicação 
a porta:8080 abra o Postman e execute os verbos HTTP na url <http://localhost:8080/clients>
# Faça os testes no banco de dados H2 na url <http://localhost:8080/h2-console>
```

## Licença

Esse projeto está sob a licença MIT. Veja o arquivo [LICENSE](.github/LICENSE.md) para mais detalhes.

<br>
<p align="center">Feito com ♥ by axndmathias</p>
