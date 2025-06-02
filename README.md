# EchoID – API para Cadastro de Usuários do EchoHands

[![Build Status](https://img.shields.io/badge/build-passing-brightgreen)](https://github.com/seuusuario/EchoID/actions)
[![OpenAPI](https://img.shields.io/badge/OpenAPI-Swagger-blue)](http://localhost:8080/swagger-ui.html)
[![License: MIT](https://img.shields.io/badge/license-MIT-green)](LICENSE)

## 🚀 Descrição

O **EchoID** é uma API RESTful desenvolvida para gerenciar o cadastro de usuários do projeto **EchoHands** — sistema de sinalização por gestos para comunicação em situações de emergência.

Essa API permite criar, consultar, atualizar e deletar usuários, além de enviar um email de boas-vindas automaticamente no momento do cadastro.

## 🧰  Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA (com banco H2 ou outro de sua preferência)
- SendGrid (envio de email)
- Swagger (OpenAPI 3)
- Maven


## 📦 Funcionalidades

- CRUD completo para usuários (nome, email, telefone, endereço)
- Envio de email de boas-vindas via SendGrid ao criar usuário
- Documentação Swagger para testar endpoints

## 📋 Requisitos

- Java 17 ou superior
- Maven
- Conta SendGrid com API Key configurada e remetente verificado

## 🛠️ Documentação Swagger
A API utiliza Swagger para documentação e testes interativos.
- Acesse: `http://localhost:8080/swagger-ui/index.html`
- Visualize todos os endpoints
- Teste diretamente da interface web

## 🏗️ Estrutura do Projeto

O projeto está dividido em três camadas principais para facilitar a organização e manutenção do código:

- [domain/ ](./src/main/java/com/echohands/api/EchoID/domain) 
  Contém as entidades do sistema, cada uma em sua própria pasta com a classe principal e seus DTOs correspondentes para entrada e saída de dados.

- [controller/](./src/main/java/com/echohands/api/EchoID/controller) 
  Responsável por expor os endpoints REST, recebendo as requisições dos clientes e encaminhando para os serviços apropriados.

- [service/](./src/main/java/com/echohands/api/EchoID/service)  
  Contém a lógica de negócio, processando as regras do sistema, validações e interações com o banco de dados via repositórios.

Essa organização ajuda a manter o código limpo, modular e de fácil escalabilidade.


## ✨ Créditos

Desenvolvido por:
- ⚡ João Pedro Borsato Cruz – RM550294
- 💫 Maria Fernanda Vieira de Camargo – RM97956
- 🚀 Pedro Lucas de Andrade Nunes – RM550366

## 🚩 Referências

- 📚 [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- 📚 [SendGrid API)](https://www.twilio.com/docs/sendgrid)
- 📚 [Swagger OpenAPI](https://swagger.io/specification/)
- 📚 [Springdoc OpenAPI (Swagger) para Spring Boot](https://springdoc.org/)  

