<div align=center>

# POO - Desafio

## Modelagem e Diagramação de um Componente iPhone

</div>

>Este repositório, concebido com propósitos didáticos, representa um desafio de modelagem e diagramação, utilizando UML, para um componente iPhone, abrangendo suas funcionalidades como reprodutor musical, aparelho telefônico e navegador na internet, criado em colaboração entre a Digital Innovation One e a Claro, como parte do Bootcamp Coding The Future Claro - Java com Spring Boot

## Objetivo

>Aprender e aplicar os fundamentos de Programação Orientada a Objetos (POO) e Linguagem de Modelagem Unificada (UML), os quais incluem:

- Conceito de POO;
- Classes e pacotes;
- Visibilidade dos recursos;
- PIlares do POO;
- Interface.

## Ferramentas

[![GitHub](https://img.shields.io/badge/GitHub-000?style=for-the-badge&logo=github&logoColor=30A3DC)](https://docs.github.com/)
[![Git](https://img.shields.io/badge/Git-000?style=for-the-badge&logo=git&logoColor=E94D5F)](https://git-scm.com/doc) 
![Java](https://img.shields.io/badge/java-000.svg?style=for-the-badge&logo=openjdk&logoColor=red)

## Diagrama UML

> O diagrama UML foi criado utilizando a sintaxe [Mermaid](https://www.mermaidchart.com/), uma alternativa open-source e que é compatível com arquivos Markdown.

```mermaid
classDiagram
    SistemaOperacional --|> Iphone
    Iphone --|> AparelhoTelefonico
    Iphone --|> NavegadorInternet
    Iphone --|> ReprodutorMusical
    class ReprodutorMusical{
      +tocar()
      +pausar()
      +selecionarMusica(musica: String)
    }
    class AparelhoTelefonico{
      +ligar(numero: String)
      +atender()
      +iniciarCorreioVoz()
    }
    class NavegadorInternet{
      +exibirPagina(url: String)
      +adicionarNovaAba()
      +atualizarPagina()
    }
```



