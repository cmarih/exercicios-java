# Exercícios básicos de JAVA

[EXERCÍCIO I](https://github.com/cmarih/exercicios-java/blob/master/src/desafioConversao.java) 

Recebe o input do dados pelo usuário e formato de String e depois é convertido para número
para que seja possível realizar o calculo da media.
~~~~JAVA
    String salarioOne = salario.next().replace(",", ".");
~~~~

O replace(a, b), foi utilizado para o dado númerico recebido
utilizando ',' ou '.' fosse aceitável para a realização do 
calculo da media.

[EXERCÍCIO II](https://github.com/cmarih/exercicios-java/blob/master/src/desafioAritmetico.java)

Escrevendo em código, a formula aritmética abaixo. 
Utiliza-se o Math.pow para calcular a potência.

~~~~
(([6*(3+2)]²/3*2 - ((1-5)*(2-7)/2)²)³/10³
~~~~

[EXERCÍCIO III](https://github.com/cmarih/exercicios-java/blob/master/src/desafioLogicos.java)

Um simples codigo para reforçar o conhecimento adquirido em operadores
lógicos.

~~~~JAVA
        boolean comprouTV50 = trabalhoQuinta && trabalhoSexta;
        boolean comprouTV32 = trabalhoQuinta ^ trabalhoSexta;
        boolean comprouSorvete = trabalhoQuinta || trabalhoSexta;
~~~~

[EXERCÍCIO IV](https://github.com/cmarih/exercicios-java/commit/4343677554d6d0c644ea067bad4e4dfce05b7cda)

Um simples codigo para reforçar o conhecimento adquirido em operador condicional ternário.

~~~~JAVA
        condicao ? valor : valor;
~~~~

[EXERCÍCIO V](https://github.com/cmarih/exercicios-java/commit/ad9be30c0829471c95a6a491e7f62da9f4519a9b)

Conversão de Fahrenheit para Celsius.

~~~~JAVA
         int celsius = (tempF - 32) * 5/9;
~~~~

[EXERCÍCIO VI](https://github.com/cmarih/exercicios-java/commit/09ac44d1ded533c8ccdd9f745a3ec94a6e985f53)

Conversão de Celsius para Fahrenheit.

~~~~JAVA
        int tempF = (celsius * 9/5) + 32;
~~~~

[EXERCÍCIO VII](https://github.com/cmarih/exercicios-java/commit/0a68ad578c1133f915bb1b72421e1640bf1b8d25)

Programa que lê o peso e a altura do usuário e imprime no console o IMC.

~~~~JAVA
        double imc = peso/(altura * altura);
~~~~

[EXERCÍCIO VIII](https://github.com/cmarih/exercicios-java/commit/19ccb3e0662211c1f3775f8849bfa05e5d97d3f7)

Programa que lê um número e retorna o valor quadrado e ao cubo do mesmo.

~~~~JAVA
          //Utilizando Math para elevar o numero a potência.
        double quadrado = Math.pow(numero,2);
        double cubo = Math.pow(numero,3);
~~~~