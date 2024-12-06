# UserRegistryProject

## Descrição

Este projeto foi desenvolvido para demonstrar a aplicação de dois padrões de design: **Singleton** e **Decorator**.  
O sistema é modular e flexível, permitindo registro de usuários e personalização dinâmica de relatórios.  

O projeto foi implementado em **Java**, devido à sua ampla adoção em sistemas corporativos, robustez e suporte nativo para orientação a objetos, o que facilita a implementação de design patterns.

---

## Informações do Projeto

| **Item**                   | **Descrição**                                                                                         |
|----------------------------|-----------------------------------------------------------------------------------------------------|
| **Linguagem**              | Java                                                                                               |
| **Padrões de Design**      | Singleton (registro de usuários), Decorator (formatação de relatórios)                             |
| **IDE recomendada**        | Visual Studio Code, IntelliJ IDEA ou Eclipse                                                      |
| **Autores**                | @kxyke

| **Finalidade**             | Demonstrar conceitos de modularidade e flexibilidade com padrões de design em sistemas simples             |

---

## Estrutura do Projeto

| **Pasta/Arquivo**        | **Descrição**                                                                                      |
|--------------------------|--------------------------------------------------------------------------------------------------|
| `src/main/java/registry` | Implementação do padrão Singleton para registro de usuários                                      |
| `src/main/java/reports`  | Implementação do padrão Decorator para formatação de relatórios                                  |
| `src/main/java/Main.java`| Classe principal do sistema                                                                      |
| `README.md`              | Documentação do projeto                                                                          |
| `bin/`                   | Pasta onde os arquivos compilados serão gerados                                                 |

---

## Pré-requisitos

| **Requisito**             | **Detalhes**                                                                                       |
|---------------------------|---------------------------------------------------------------------------------------------------|
| **Java Development Kit**  | Versão 8 ou superior. Baixe em [oracle.com](https://www.oracle.com/java/technologies/javase-downloads.html). |
| **Git**                   | Baixe e instale em [git-scm.com](https://git-scm.com/).                                           |
| **Editor de Código**      | Recomenda-se Visual Studio Code, IntelliJ IDEA ou Eclipse.                                        |

---

## Instalação e Configuração

| **Passo**                  | **Instrução**                                                                                   |
|----------------------------|-------------------------------------------------------------------------------------------------|
| **Clonar Repositório**     | 1. Abra o terminal<br>2. Execute: `git clone <URL_DO_REPOSITORIO>`<br>3. Acesse a pasta: `cd UserRegistryProject` |
| **Compilar o Projeto**     | 1. Certifique-se de estar na pasta raiz do projeto<br>2. Execute: `javac -d bin src/main/java/**/*.java src/test/java/**/*.java` |
| **Executar a Aplicação**   | 1. Na pasta raiz, execute: `java -cp bin Main`                                                  |
| **Testar Funcionalidades** | 1. Testar Singleton: `java -cp bin tests.SingletonTest`<br>2. Testar Decorator: `java -cp bin tests.DecoratorTest` |

---

## Como Executar

### Menu Inicial

Ao executar o sistema, o menu inicial será exibido com a seguinte mensagem:

```plaintext
Bem-vindo ao Sistema de Registro de Usuários e Relatórios!  
Desenvolvido por: Kayke de Souza  
