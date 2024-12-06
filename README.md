# UserRegistryProject

## Descrição

Este projeto foi desenvolvido para demonstrar a aplicação de dois padrões de design: **Singleton** e **Decorator**.  
O sistema é modular e flexível, permitindo registro de usuários e personalização dinâmica de relatórios.  

O projeto foi implementado em **Java**, devido à sua ampla adoção em sistemas corporativos, robustez e suporte nativo para orientação a objetos, o que facilita a implementação de design patterns.

---

## Integrantes do Grupo

- **Kayke de Souza - @kxyke** 

---

## Motivação para a Linguagem

Optamos por **Java** como linguagem de programação pelos seguintes motivos:
1. **Suporte a Padrões de Projeto:** Java oferece bibliotecas e estruturas robustas para implementar os padrões de projeto utilizados.
2. **Portabilidade:** Código Java pode ser executado em qualquer plataforma com a JVM (Java Virtual Machine).
3. **Modularidade e Organização:** A estrutura de pacotes facilita a separação de responsabilidades e modularidade.

---

## Funcionalidades do Sistema

- **Registro de Usuários (Singleton):** Garante que apenas uma instância do registro seja criada durante a execução.
- **Relatórios Personalizáveis (Decorator):** Permite adicionar funcionalidades dinâmicas, como cabeçalhos, bordas e formatações de cor, aos relatórios.

---

## Estrutura do Projeto

```plaintext
UserRegistryProject
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── registry    // Padrão Singleton
│   │   │   │   └── UserRegistry.java
│   │   │   ├── reports     // Padrão Decorator
│   │   │   │   ├── BasicReport.java
│   │   │   │   ├── BorderDecorator.java
│   │   │   │   ├── ColorDecorator.java
│   │   │   │   ├── HeaderDecorator.java
│   │   │   │   └── Report.java
│   │   │   └── Main.java   // Classe principal
│   ├── test
│   │   └── java
│   │       └── tests       // Classes de teste
│   │           ├── SingletonTest.java
│   │           └── DecoratorTest.java
├── README.md               // Documentação do projeto

---

## Como Executar

### Menu Inicial

Ao executar o sistema, o menu inicial será exibido com a seguinte mensagem:

```plaintext
Bem-vindo ao Sistema de Registro de Usuários e Relatórios!  
Desenvolvido por: Kayke de Souza
