## DESAFIO-POO

---

##  Sobre o Projeto

Este é um projeto acadêmico desenvolvido para aplicar os principais conceitos de **Programação Orientada a Objetos em Java**, tais como:

* ✅ Classes e Objetos
* ✅ Encapsulamento
* ✅ Herança
* ✅ Polimorfismo
* ✅ Interfaces
* ✅ Associação entre classes
* ✅ Organização em pacotes

O sistema simula um ambiente acadêmico contendo entidades como alunos, professores, cursos e endereços.

---

##  Estrutura do Projeto

```text
sgp-poo/
├── src/
│   ├── entidades/
│   │   ├── Pessoa.java
│   │   ├── Aluno.java
│   │   ├── Professor.java
│   │   ├── Curso.java
│   │   ├── Endereco.java
│   │   └── Autenticavel.java
│   └── App.java
├── bin/
├── lib/
├── .gitignore
└── README.md
```

---

##  Diagrama Conceitual

```text
Pessoa
 ├── Aluno
 └── Professor

Pessoa --> Endereco
Aluno --> Curso
Aluno/Professor --> Autenticavel
```

---

##  Classes do Sistema

###  Pessoa

Classe base contendo informações comuns:

* Nome
* E-mail
* Endereço

### Aluno

Herda de `Pessoa` e adiciona:

* Matrícula

### Professor

Herda de `Pessoa` e adiciona:

* Especialidade
* Salário

### Curso

Representa um curso acadêmico.

### Endereco

Armazena dados de localização.

### Autenticavel

Interface responsável pelo processo de autenticação.

---

## Como Executar

### 1️⃣ Clonar o repositório

```bash
git clone https://github.com/daviflx/desafio-tecnico-poo.git
cd desafio
```

### 2️⃣ Compilar o projeto

```bash
javac -d bin src/App.java src/entidades/*.java
```

### 3️⃣ Executar

```bash
java -cp bin App
```

---

##  Executando no VS Code

1. Abra o projeto no **Visual Studio Code**.
2. Instale a extensão **Extension Pack for Java**.
3. Abra o arquivo `App.java`.
4. Clique em **Run ▶️** acima do método `main`.

---

##  Exemplo de Uso

```java
Aluno aluno = new Aluno();
aluno.setNome("Davi Félix");
aluno.setMatricula("2025001");

System.out.println("Nome: " + aluno.getNome());
System.out.println("Matrícula: " + aluno.getMatricula());
```

---

##  Objetivos do Projeto

* Consolidar conhecimentos em Java.
* Praticar Programação Orientada a Objetos.
* Desenvolver organização e boas práticas de código.
* Preparar base para projetos maiores com Java e Spring Boot.

---

## Tecnologias Utilizadas

*  Java
*  Visual Studio Code
*  Git e GitHub

---

## Conceitos Aplicados

| Conceito       | Aplicação                                     |
| -------------- | --------------------------------------------- |
| Encapsulamento | Uso de atributos privados e métodos `get/set` |
| Herança        | `Aluno` e `Professor` herdam de `Pessoa`      |
| Polimorfismo   | Referências do tipo `Pessoa`                  |
| Interface      | `Autenticavel`                                |
| Associação     | Relacionamentos entre classes                 |

---

## 👨‍💻 Autor

**Davi Félix Cavalcanti Santos**

* GitHub: [https://github.com/daviflx](https://github.com/daviflx)
* LinkedIn: [www.linkedin.com/in/davi-felix-cavalcanti-santos-776299379](http://www.linkedin.com/in/davi-felix-cavalcanti-santos-776299379)

---

## Contribuição

Se este projeto foi útil para seus estudos, considere deixar uma ⭐ no repositório.
