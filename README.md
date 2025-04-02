# 📘 Lista de Exercícios - Programação Orientada a Objetos (POO) no Android Studio

## 📌 Sobre o Projeto
Este projeto contém uma lista de exercícios de **Programação Orientada a Objetos (POO)** resolvidos no **Android Studio** utilizando a linguagem **Java**. O objetivo é aplicar conceitos de classes abstratas, interfaces, herança e estrutura de dados em um ambiente mobile.

## 🚀 Tecnologias Utilizadas
- **Android Studio** - Ambiente de desenvolvimento (IDE)
- **Java** - Linguagem de programação principal
- **XML** - Para a criação dos layouts das Activities
- **POO (Programação Orientada a Objetos)** - Aplicado nos exercícios

## 📂 Estrutura do Projeto
O projeto segue uma estrutura organizada, separando os arquivos por funcionalidades:

```plaintext
/app/src/main/java/com/example/app/
│
├── model/                   # Modelos e classes de dados
│   ├── veiculos/            # Classes para gerenciamento de veículos
│   ├── dispositivos/        # Classes para gerenciamento de dispositivos eletrônicos
│   ├── contatos/            # Estruturas de dados para gerenciamento de contatos
│   ├── financas/            # Classes para controle financeiro
│   ├── investimentos/       # Classes para controle de investimentos
│
├── ui/                      # Activities para exibição dos dados
│   ├── MainActivity.java    # Tela principal do aplicativo
│   ├── VeiculosActivity.java
│   ├── DispositivosActivity.java
│   ├── ContatosActivity.java
│   ├── FinancasActivity.java
│   ├── InvestimentosActivity.java
│
├── res/layout/              # Arquivos XML de layout
│   ├── activity_main.xml
│   ├── activity_veiculos.xml
│   ├── activity_dispositivos.xml
│   ├── activity_contatos.xml
│   ├── activity_financas.xml
│   ├── activity_investimentos.xml
```

## 📖 Exercícios Resolvidos

### 1️⃣ Gerenciamento de Veículos
**Objetivo:** Criar classes abstratas para modelar diferentes tipos de veículos, incluindo carros e motos.
- 📌 Utilizou **classe abstrata** para definir características comuns
- 🚗 Implementou a classe `Carro` com atributo `quantidadeDePortas`
- 🏍️ Implementou a classe `Moto` com atributo `ehEletrica`

### 2️⃣ Gerenciamento de Dispositivos Eletrônicos
**Objetivo:** Criar uma hierarquia de classes para modelar computadores e smartphones.
- 📌 Criou uma **classe abstrata** `DispositivoEletronico`
- 🖥️ Implementou `Computador` e 📱 `Smartphone` como subclasses
- 🔄 Usou **herança** para reaproveitar atributos comuns

### 3️⃣ Gerenciamento de Contatos
**Objetivo:** Criar uma estrutura de dados para armazenar contatos pessoais e profissionais.
- 📌 Criou a **interface** `IContato`
- 👨 Implementou `ContatoPessoal`
- 💼 Implementou `ContatoProfissional`
- 🗂️ Utilizou **ArrayList** para armazenar os contatos

### 4️⃣ Gerenciamento de Finanças Pessoais
**Objetivo:** Criar uma estrutura de dados para acompanhar receitas, despesas e calcular saldo.
- 📌 Criou a **interface** `ITransacao`
- ➕ Implementou `Receita`
- ➖ Implementou `Despesa`
- 💰 Criou `GerenciadorFinanceiro` para controlar saldo

### 5️⃣ Gerenciamento de Investimentos
**Objetivo:** Criar uma estrutura para acompanhar diferentes investimentos e calcular retorno.
- 📌 Criou a **interface** `IInvestimento`
- 📈 Implementou `Acao`
- 🏠 Implementou `FundoImobiliario`
- 📊 Criou `GerenciadorInvestimentos` para calcular retorno total

## 🏗️ Como Executar o Projeto
1. Clone este repositório:
   ```sh
   git clone https://github.com/seu-usuario/seu-repositorio.git
   ```
2. Abra o **Android Studio** e importe o projeto.
3. Construa e execute a aplicação no **emulador** ou **dispositivo físico**.

## 📌 Conclusão
Este projeto reforçou conceitos de **POO em Java** no desenvolvimento de **aplicações Android**. Foi aplicada uma abordagem modular e reutilizável, garantindo um código bem estruturado. 🚀

---
📌 **Autor:** Luiz Eduardo Americo Calixto 

