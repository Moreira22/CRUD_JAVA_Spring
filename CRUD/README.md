# README - Projeto CRUD de Produtos utilizando Spring e MySQL

Este é um projeto de exemplo que demonstra como criar um aplicativo CRUD (Create, Read, Update, Delete) simples para gerenciar produtos utilizando o framework Spring e o banco de dados MySQL.

## Tecnologias Utilizadas

- **Spring Boot**: Facilita a configuração e o desenvolvimento de aplicativos Spring.
- **Spring Data JPA**: Simplifica o acesso e a manipulação de dados usando a JPA (Java Persistence API).
- **Spring Web**: Oferece suporte para desenvolvimento de aplicativos web usando o Spring.
- **MySQL**: Banco de dados relacional para armazenamento persistente de dados.
- **Maven**: Ferramenta de automação de compilação e gerenciamento de dependências.

## Configuração do Ambiente de Desenvolvimento

Certifique-se de ter o **Java Development Kit (JDK)** instalado em sua máquina. Este projeto foi desenvolvido usando Java 8.

Clone o repositório em sua máquina local:

```
git clone https://github.com/seu-usuario/seu-projeto.git
```

Certifique-se de ter o Maven instalado. Navegue até o diretório raiz do projeto e execute o seguinte comando para compilar o projeto e baixar as dependências:

```
mvn clean install
```

## Configuração do Banco de Dados MySQL

O projeto está configurado para utilizar um banco de dados MySQL. As configurações do banco de dados podem ser encontradas no arquivo `application.properties`.

```
spring.datasource.url=jdbc:mysql://localhost:3306/nome_do_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
```

Certifique-se de criar o banco de dados no MySQL com o nome especificado na URL e de fornecer as credenciais corretas.

## Executando a Aplicação

Após a instalação das dependências e a configuração do banco de dados, você pode executar a aplicação usando o seguinte comando:

```
mvn spring-boot:run
```

Isso iniciará o servidor Spring Boot. Você poderá acessar o aplicativo em [http://localhost:8080](http://localhost:8080).

## Endpoints da API

O aplicativo expõe os seguintes endpoints para operações CRUD de produtos:

- `GET /api/produtos`: Retorna todos os produtos.
- `GET /api/produtos/{id}`: Retorna um produto específico com o ID fornecido.
- `POST /api/produtos`: Cria um novo produto.
- `PUT /api/produtos/{id}`: Atualiza um produto existente com o ID fornecido.
- `DELETE /api/produtos/{id}`: Exclui um produto existente com o ID fornecido.

Os dados são retornados no formato JSON.

## Contribuindo

Sinta-se à vontade para contribuir com melhorias ou correções para este projeto. Basta abrir uma issue ou enviar um pull request.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
