# 📝 Papo de Dev

Bem-vindo ao meu Papo de DEV! Este projeto foi desenvolvido utilizando o framework Spring para criar um blog onde posso compartilhar minhas ideias, experiências e conhecimentos.

## 📖 Sobre o Projeto

Este blog foi criado com o objetivo de fornecer um espaço para publicar artigos e conteúdo sobre diversos tópicos. A aplicação permite a criação, edição e exclusão de posts, além de possibilitar a interação dos leitores por meio de comentários.

## ✨ Funcionalidades

- **📝 Publicação de Artigos:** Criação, edição e exclusão de posts.
- **💬 Comentários:** Sistema de comentários para os leitores interagirem com os posts.
- **🔍 Pesquisa:** Funcionalidade de pesquisa para encontrar posts por título ou conteúdo.
- **👤 Autenticação e Autorização:** Sistema de login para autores e leitores.

## 🛠️ Tecnologias Utilizadas

## 🛠️ Tecnologias Utilizadas
  <a href="https://skillicons.dev">
    <img src="https://skillicons.dev/icons?i=java,spring,mysql" />
  </a>

- **Spring Boot:** Framework principal para o desenvolvimento da aplicação.
- **Spring Data JPA:** Persistência de dados.
- **Thymeleaf:** Template engine para renderização de páginas HTML.
- **Spring Security:** Gerenciamento de autenticação e autorização.
- **H2 Database:** Banco de dados em memória para testes e desenvolvimento.
- **MySQL:** Banco de dados relacional em produção.

## 🚀 Como Executar

Para executar o projeto localmente, siga os passos abaixo:

1. Clone o repositório:
    ```bash
    git clone https://github.com/Michel9406/Blog-Pessoal
    cd seu-repositorio
    ```

2. Configure o banco de dados no arquivo `application.properties`:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/seu_banco_de_dados
    spring.datasource.username=seu_usuario
    spring.datasource.password=sua_senha
    ```

3. Execute a aplicação:
    ```bash
    ./mvnw spring-boot:run
    ```

4. Acesse a aplicação no seu navegador:
    ```
    http://localhost:8080
    ```

## 📁 Estrutura do Projeto
/
├── src/<br>
│ ├── main/<br>
│ │ ├── java/<br>
│ │ │ └── com/<br>
│ │ │ └── seu-usuario/<br>
│ │ │ └── blog/<br>
│ │ ├── resources/<br>
│ │ │ ├── templates/<br>
│ │ │ ├── application.properties<br>
│ │ │ └── static/<br>
│ └── test/<br>
│ └── java/<br>
│ └── com/<br>
│ └── seu-usuario/<br>
│ └── blog/<br>
├── mvnw<br>
├── mvnw.cmd<br>
├── pom.xml<br>
└── README.md<br>



---

Obrigado por visitar meu blog! 😊
