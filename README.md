# Biblioteca Digital

Aplicação de console desenvolvida em Java como parte da minha trajetória na
faculdade. O projeto demonstra a evolução dos meus conhecimentos de programação
por meio do gerenciamento de um acervo de livros.

## Funcionalidades

- Adicionar e remover livros pelo ISBN, evitando duplicatas.
- Pesquisar livros por trecho do título ou pelo nome do autor.
- Listar livros em ordem crescente de ano de publicação.
- Controlar empréstimos e devoluções, impedindo operações inválidas.

## Tecnologias e conceitos

- Java (8 ou superior)
- Classes, encapsulamento e métodos
- `HashSet` e `ArrayList`
- Ordenação com `Comparator`
- Sobrescrita de `equals`, `hashCode` e `toString`

## Estrutura

- `Livro.java`: representa um livro e seus dados.
- `Biblioteca.java`: gerencia o acervo, as pesquisas e os empréstimos.
- `Main.java`: demonstra as funcionalidades com dados de exemplo.

## Como executar

Com o JDK instalado, abra um terminal na pasta do projeto e execute:

```text
javac Livro.java Biblioteca.java Main.java
java Main
```

O programa imprime no console exemplos de remoção, pesquisa, ordenação,
empréstimo e devolução.

## Limitações

Este é um projeto acadêmico e parte do meu aprendizado em Java. Os dados são
mantidos apenas durante a execução: não há interface gráfica, banco de dados
ou persistência entre execuções.
