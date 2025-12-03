# 🐷 Projeto - Peppa Lanches

Trabalho desenvolvido para a disciplina de Gestão e Qualidade de Software, utilizando Java, Maven e Cucumber com cenários escritos em Gherkin. O projeto segue regras de negócio definidas no enunciado e aplica testes automatizados para validar o comportamento do sistema.

## 👥 Integrantes

* *Neisson Júnio Ferreira de Andrada* – RA: 42420479
* *Felipe Gravel Muniz* – RA: 42421401
* *Ana Luiza do Carmo Gonçalves* – RA: 42523109

---

## 📄 Descrição Geral do Projeto

Este projeto foi desenvolvido inteiramente em equipe utilizando Codespaces no GitHub, garantindo colaboração simultânea e organizada entre todos os integrantes.

Durante o processo, aplicamos boas práticas de *versionamento com Git e GitHub (Pull Requests e branches):

* Cada integrante contribuiu no desenvolvimento e revisão do código.
* Utilizamos uma branch específica de revisão (feature/revisao) para que cada membro pudesse validar o projeto antes do merge final.
* Implementamos testes baseados nas regras de negócio fornecidas, garantindo que a aplicação esteja validada e funcional.

## 🧪 Testes Automatizados (BDD)

Os testes foram desenvolvidos utilizando Cucumber para Java, com cenários escritos em Gherkin. O Maven foi utilizado para gerenciamento de dependências e execução dos testes.

O objetivo dos testes foi garantir que todas as regras de negócio fossem validadas automaticamente, seguindo a metodologia BDD (Behavior-Driven Development).

### Estrutura de Testes

A organização dos arquivos de teste segue a seguinte estrutura:

* src/test/java/steps – Implementação dos Steps de teste (regras de negócio).
* src/test/java/runner – Runner responsável pela execução dos testes.
* src/test/resources/features – Cenários de negócio em Gherkin.
* pom.xml – Gerenciamento de dependências.

## 🛠 Tecnologias Utilizadas

* *Java*
* *Maven*
* *Cucumber*
* *Gherkin*
* *JUnit*
* *Codespaces (GitHub)*
* *Git e GitHub* (Pull Requests, branches e revisão)

## ▶ Como Executar o Projeto (Testes)

Para configurar e rodar os testes da aplicação, utilize os seguintes comandos no terminal:

1.  *Instalar dependências:*
    bash
    mvn install
    
2.  *Rodar os testes automatizados:*
    bash
    mvn test
