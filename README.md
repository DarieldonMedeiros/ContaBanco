# 🏦 ContaBanco - Desafio DIO Java Básico

## 📋 Descrição do Projeto

Este projeto foi desenvolvido como parte do curso **DIO - Trilha Java Básico** ministrado por **Gleyson Sampaio**. O objetivo é exercitar os conceitos fundamentais de sintaxe Java, incluindo declaração de variáveis, entrada de dados via terminal, concatenação de strings e estrutura básica de um programa Java.

## 🎯 Objetivos do Desafio

- Criar um sistema de cadastro de conta bancária via terminal
- Aplicar conceitos de declaração de variáveis em Java
- Implementar entrada de dados usando a classe `Scanner`
- Demonstrar concatenação de strings com o método `concat()`
- Criar uma experiência interativa para o usuário

## 🚀 Funcionalidades

O programa permite ao usuário:

1. **Inserir dados da conta bancária** via terminal
2. **Receber mensagens orientativas** para cada campo
3. **Visualizar confirmação** dos dados inseridos
4. **Simular criação de conta** em um banco

## 📊 Estrutura de Dados

| Atributo         | Tipo     | Exemplo       | Descrição                  |
| ---------------- | -------- | ------------- | -------------------------- |
| **Numero**       | `int`    | 1021          | Número da conta bancária   |
| **Agencia**      | `String` | 067-8         | Código da agência bancária |
| **Nome Cliente** | `String` | MARIO ANDRADE | Nome completo do titular   |
| **Saldo**        | `double` | 237.48        | Saldo inicial da conta     |

## 🛠️ Tecnologias Utilizadas

- **Java** - Linguagem de programação principal
- **Scanner** - Classe para entrada de dados via terminal
- **Locale** - Configuração regional para formatação de números

## 📁 Estrutura do Projeto

```
ContaBanco/
├── src/
│   └── ContaTerminal.java    # Classe principal do programa
├── .idea/                     # Configurações do IntelliJ IDEA
├── out/                      # Arquivos compilados
├── ContaBanco.iml           # Configuração do módulo IntelliJ
├── .gitignore               # Arquivos ignorados pelo Git
└── README.md                # Este arquivo
```

## 🚀 Como Executar

### Pré-requisitos

- Java JDK 8 ou superior instalado
- IDE Java (IntelliJ IDEA, Eclipse, VS Code) ou terminal

### Execução via Terminal

1. **Navegue até a pasta do projeto:**

   ```bash
   cd ContaBanco
   ```

2. **Compile o código:**

   ```bash
   javac src/ContaTerminal.java
   ```

3. **Execute o programa:**
   ```bash
   java -cp src ContaTerminal
   ```

### Execução via IDE

1. Abra o projeto no IntelliJ IDEA
2. Localize a classe `ContaTerminal.java`
3. Execute o método `main`

## 💻 Como Usar

1. **Execute o programa**
2. **Digite a agência** quando solicitado (ex: 067-8)
3. **Digite o número da conta** quando solicitado (ex: 1021)
4. **Digite seu nome** quando solicitado (ex: MARIO ANDRADE)
5. **Digite o saldo inicial** quando solicitado (ex: 237,48)
6. **Visualize a confirmação** da criação da conta

## 📝 Exemplo de Execução

```
Por favor, digite qual é a sua agência:
067-8
Por favor, digite o número da Conta:
1021
Por favor, digite o seu nome:
MARIO ANDRADE
Por favor, informe qual será o saldo inicial que será depositado na sua conta:
237,48

Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo R$237.48 já está disponível para saque!
```

## 🔧 Características Técnicas

### Classe Principal: `ContaTerminal`

- **Método main**: Ponto de entrada do programa
- **Scanner**: Captura entrada do usuário via terminal
- **Locale**: Configurado para português brasileiro (pt-BR)
- **Tratamento de dados**: Conversão de tipos e formatação
- **Concatenação**: Uso do método `concat()` para strings

### Funcionalidades Implementadas

- ✅ Entrada de dados via terminal
- ✅ Validação e conversão de tipos
- ✅ Formatação de números decimais
- ✅ Concatenação de strings
- ✅ Mensagens orientativas para o usuário
- ✅ Saída formatada com todos os dados inseridos

## 📚 Conceitos Aplicados

- **Variáveis e tipos de dados** em Java
- **Entrada e saída** via terminal
- **Classe Scanner** para captura de dados
- **Método concat()** para strings
- **Estrutura básica** de um programa Java
- **Tratamento de entrada** do usuário

## 👨‍💻 Autor

**Darieldon Medeiros** - Aluno da DIO

## 🎓 Instituição

**DIO - Digital Innovation One**

- **Curso**: Trilha Java Básico
- **Módulo**: Sintaxe Java
- **Tipo**: Desafio Prático

## 📄 Licença

Este projeto foi desenvolvido como parte do curso da DIO e está disponível para fins educacionais.

---

_Desenvolvido com ❤️ para o curso de Java Básico da DIO_
