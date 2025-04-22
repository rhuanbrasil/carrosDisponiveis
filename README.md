
Atividade carrosDisponiveis 

## Descrição

Este projeto é uma aplicação em Java que simula uma concessionária de carros usados. O programa permite ao usuário visualizar uma lista de carros predefinidos, calcular descontos com base no ano do carro (12% para carros até 2000, 7% para carros após 2000), e acompanhar o total de carros com ano até 2000 e o total geral de carros processados. O projeto foi desenvolvido como parte de uma atividade prática para aprendizado de conceitos de **Programação Orientada a Objetos (POO)** em Java, incluindo encapsulamento, composição e entrada/saída.

## Funcionalidades

- **Listagem de Carros**: Exibe uma lista de 5 carros predefinidos com modelo, ano e valor.
- **Cálculo de Descontos**:
  - Carros até o ano 2000 recebem 12% de desconto.
  - Carros após 2000 recebem 7% de desconto.
  - Exibe o modelo, percentual de desconto, valor do desconto, e valor final a pagar.
- **Contadores**:
  - Total de carros com ano até 2000.
  - Total geral de carros processados.
- **Interação com o Usuário**:
  - Permite ao usuário escolher um carro da lista e calcular o desconto.
  - Oferece a opção de calcular o desconto para outro carro até que o usuário decida parar

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal.
- **JDK**: Versão 8 ou superior (compatível com qualquer versão que suporte `ArrayList` e `Scanner`).
- **IDE**: Desenvolvido no NetBeans 25, mas pode ser executado em qualquer IDE ou diretamente via terminal.

## Estrutura do Projeto

O projeto está organizado no pacote `projeto.comandosIniciais` e contém as seguintes classes:

- **`Carro.java`**:
  - Representa um carro com os atributos `modelo`, `ano` e `valor`.
  - Contém getters para acessar os atributos e um método `toString()` sobrescrito para formatar a exibição do carro.
- **`Concessionaria.java`**:
  - Classe principal que gerencia a lógica do programa.
  - Contém uma lista de carros predefinidos (`ArrayList<Carros>`), métodos para listar carros, calcular descontos, e interagir com o usuário.
  - Inclui o método `main` para iniciar o programa.

### Estrutura de Arquivos

```
projeto/
└── comandosIniciais/
    ├── Carros.java
    ├── Concessionaria.java
    ├── main.java
└── README.md
```

## Como Executar

### Pré-requisitos

- **Java JDK** instalado (versão 8 ou superior).
- Um ambiente para compilar e executar Java (ex.: terminal, NetBeans, IntelliJ IDEA, VS Code).

### Passos para Executar

1. **Clone o Repositório** (se estiver no GitHub):
   ```bash
   git clone <(https://github.com/rhuanbrasil/carrosDisponiveis)>
   cd <carrosDisponiveis>
   ```

2. **Compile os Arquivos**:
   Certifique-se de que você está no diretório que contém o pacote `projeto/comandosIniciais`. Compile os arquivos Java:
   ```bash
   javac projeto/comandosIniciais/*.java
   ```

3. **Execute o Programa**:
   Execute a classe `Concessionaria`, que contém o método `main`:
   ```bash
   java projeto.comandosIniciais.Concessionaria
   ```

4. **Interaja com o Programa**:
   - O programa exibirá a lista de carros disponíveis.
   - Digite o número do carro (de 1 a 5) para calcular o desconto.
   - Veja o desconto aplicado, o valor final, e escolha se quer calcular o desconto para outro carro (digite "S" para sim, "N" para não).

### Exemplo de Saída

```
Modelos disponíveis:
1. Fusca (1975) - R$ 15000.00
2. Gol G3 (2005) - R$ 25000.00
3. Civic 1998 (1998) - R$ 20000.00
4. HB20 2015 (2015) - R$ 40000.00
5. Opala 1980 (1980) - R$ 30000.00
Escolha um nÃºmero dos carros acima: 1

Modelo: Fusca
Desconto: 12%
Valor de desconto: R$ 1800.00
Valor a pagar: R$ 13200.00

Deseja continuar (Sim ou Nao)?  Nao

Total de carros com ano até 2000: 1
Total geral de carros: 1
```
