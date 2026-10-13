# Book Search Java

**Português (Brasil)** | [English (United States)](#english-united-states)

---

# Português (Brasil)

## Sobre o projeto

O **Book Search Java** é um projeto desenvolvido com o objetivo de praticar conceitos fundamentais da linguagem Java por meio do consumo de uma API pública.

A aplicação permite pesquisar livros utilizando a [Open Library Search API](https://openlibrary.org/dev/docs/api/search), obter informações sobre as obras e organizar os resultados utilizando recursos da linguagem Java.

O projeto tem finalidade educacional e busca consolidar conhecimentos sobre requisições HTTP, processamento de JSON, programação orientada a objetos e Streams.

## Funcionalidades

- Pesquisar livros por título ou termo de busca.
- Consultar informações disponíveis sobre os livros.
- Exibir títulos, autores e ano da primeira publicação.
- Ordenar os resultados alfabeticamente.
- Converter respostas JSON em objetos Java.
- Tratar respostas HTTP e possíveis erros durante as requisições.

## Tecnologias utilizadas

- **Java** — linguagem de programação.
- **HttpClient** — realização de requisições HTTP.
- **Gson** — conversão de respostas JSON em objetos Java.
- **Open Library API** — fonte dos dados bibliográficos.
- **Java Streams** — filtragem, ordenação e processamento dos resultados.

## Como funciona

A aplicação realiza uma requisição HTTP GET à Open Library API, enviando o termo informado pelo usuário.

A resposta recebida em JSON é convertida em objetos Java utilizando a biblioteca Gson. Em seguida, os dados são organizados e exibidos no console.

O fluxo principal da aplicação é:

1. Informar o termo de pesquisa.
2. Codificar o termo para uso na URL.
3. Enviar a requisição à API.
4. Converter a resposta JSON em objetos Java.
5. Organizar os resultados com Streams.
6. Exibir as informações dos livros no console.

## Estrutura do projeto

```text
BookSearchJava/
├── src/
│   ├── Main.java
│   ├── Book.java
│   ├── OpenLibraryService.java
│   └── OpenLibraryResponse.java
├── lib/
│   └── gson.jar
└── README.md
```

A estrutura pode variar conforme a configuração do projeto na IDE.

## Requisitos

- JDK 11 ou superior.
- IntelliJ IDEA ou outra IDE compatível com Java.
- Biblioteca Gson adicionada às dependências do projeto.
- Conexão com a internet.

## Configuração e execução

1. Clone o repositório:

   ```bash
   git clone <URL_DO_REPOSITORIO>
   ```

2. Abra o projeto na sua IDE.

3. Configure o JDK 11 ou superior.

4. Adicione a biblioteca Gson às dependências do projeto, caso ainda não esteja configurada.

5. Execute a classe `Main.java`.

6. Consulte os resultados apresentados no console.

A aplicação utiliza a Open Library API, que não exige uma chave de API para a pesquisa utilizada neste projeto. O acesso depende da disponibilidade do serviço e está sujeito às políticas de uso da plataforma.

## Exemplo de saída

```text
Livros encontrados: 10

Título: Beginning Java
Autores: [Nome do autor]
Ano: 2010
-------------------------
```

Os títulos, autores, anos e a quantidade de resultados variam conforme a resposta da API. O exemplo acima é ilustrativo.

## Conceitos praticados

- Requisições HTTP com `HttpClient`.
- Manipulação de URLs com `URLEncoder`.
- Processamento de JSON com Gson.
- Classes, objetos, encapsulamento e métodos.
- Listas e coleções em Java.
- Streams, filtros, ordenação e operações terminais.
- Tratamento de exceções.

## Objetivo educacional

Este projeto faz parte do meu processo de aprendizado em Java e tem como objetivo transformar conhecimentos teóricos em uma aplicação prática, servindo como base para projetos futuros que envolvam integração com APIs e processamento de dados.

## API utilizada

- [Open Library Search API](https://openlibrary.org/dev/docs/api/search)

---

# English (United States)

## About the project

**Book Search Java** is a project developed to practice fundamental Java programming concepts by consuming a public API.

The application allows users to search for books using the [Open Library Search API](https://openlibrary.org/dev/docs/api/search), retrieve available bibliographic information, and organize the results using Java features.

This is an educational project designed to strengthen knowledge of HTTP requests, JSON processing, object-oriented programming, and Streams.

## Features

- Search for books by title or search term.
- Retrieve available book information.
- Display titles, authors, and first publication years.
- Sort results alphabetically.
- Convert JSON responses into Java objects.
- Handle HTTP responses and potential request errors.

## Technologies

- **Java** — programming language.
- **HttpClient** — HTTP request handling.
- **Gson** — JSON-to-Java object conversion.
- **Open Library API** — bibliographic data source.
- **Java Streams** — filtering, sorting, and processing search results.

## How it works

The application sends an HTTP GET request to the Open Library API using the search term provided by the user.

The JSON response is converted into Java objects using Gson. The resulting data is then processed and displayed in the console.

The main workflow is:

1. Enter a search term.
2. Encode the term for use in a URL.
3. Send a request to the API.
4. Convert the JSON response into Java objects.
5. Process and sort the results using Streams.
6. Display book information in the console.

## Project structure

```text
BookSearchJava/
├── src/
│   ├── Main.java
│   ├── Book.java
│   ├── OpenLibraryService.java
│   └── OpenLibraryResponse.java
├── lib/
│   └── gson.jar
└── README.md
```

The structure may vary depending on the IDE and project configuration.

## Requirements

- JDK 11 or later.
- IntelliJ IDEA or another Java-compatible IDE.
- Gson added to the project's dependencies.
- An internet connection.

## Setup and execution

1. Clone the repository:

   ```bash
   git clone <REPOSITORY_URL>
   ```

2. Open the project in your IDE.

3. Configure JDK 11 or later.

4. Add the Gson library to the project dependencies if it is not already configured.

5. Run `Main.java`.

6. Check the results displayed in the console.

The application uses the Open Library API, which does not require an API key for the search endpoint used in this project. Access depends on service availability and is subject to the platform's usage policies.

## Example output

```text
Books found: 10

Title: Beginning Java
Authors: [Author name]
Year: 2010
-------------------------
```

Titles, authors, publication years, and result counts vary depending on the API response. The example above is illustrative.

## Concepts practiced

- HTTP requests with `HttpClient`.
- URL encoding with `URLEncoder`.
- JSON processing with Gson.
- Classes, objects, encapsulation, and methods.
- Java lists and collections.
- Streams, filtering, sorting, and terminal operations.
- Exception handling.

## Learning objectives

This project is part of my Java learning journey. Its goal is to turn theoretical knowledge into a practical application and provide a foundation for future projects involving API integration and data processing.

## API used

- [Open Library Search API](https://openlibrary.org/dev/docs/api/search)
