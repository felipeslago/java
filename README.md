## A Linguagem de Programação Java
Na linguagem de programação Java, todos os códigos-fonte são escritos em arquivo de puro texto com a extensão .java

Esses arquivos são processados pelo Java Compiler (javac) em arquivos com a extensão .class

Os arquivos .class contém bytecodes, que são a linguagem de máquina utilizada pela Java Virtual Machine (JVM)

Como a JVM está disponível em vários sistemas operacionais (Windows, MacOS, Solaris e Linux), os mesmos arquivos .class podem ser utilizados em qualquer um deles

## A Plataforma Java

A Plataforma Java é composta pela Java Virtual Machine (JVM) e pela Java Application Programming Interface (API)

A divisão é feita da seguinte forma:

1. Na camada mais alta temos o nosso código-fonte no arquivo .java
2. Esse programa utiliza as APIs do Java para escrever suas instruções
3. Após compilado, a JVM utiliza os arquivos .class
4. O hardware recebe as instruções de máquina vindas da JVM

## Compilando um Arquivo Java

1. Para compilar e executar arquivos Java é necessário ter a JVM ou JDK instalados na máquina
2. A partir do terminal, ou um editor de textos, crie um arquivo, por exemplo HelloWorld.java
3. Acesso o terminal, caso já não esteja nele, vá até o diretório do seu arquivo e compile esse arquivo com a instrução `javac HelloWorld.java`
4. Dentro do mesmo diretório verifique se foi criado o arquivo HelloWorld.class e, caso positivo, execute o arquivo com o comando `java HelloWorld`

## Conceitos Sobre Orientação a Objetos

* Objeto
    * É um agrupamento de código que possuí estados e comportamentos. 
    * Um objeto de software é geralmente utilizado para modelar um objeto do mundo real, como por exemplo uma bicicleta e muitas outras coisas que vemos no dia a dia.
    * Os estados são armazenados em variáveis e os comportamentos são expostos através de métodos.
    * Os métodos operam nos estados internos de um objeto e servem como mecanismo primário de comunicação entre objetos diferentes.
    * Esconder todos os estados de um objeto e exigir que toda interação com ele seja feita através dos métodos é conhecido como encapsulamento de dados.
    * Exemplo: Uma bicicleta possuí estados (marcha atual, velocidade atual) e estados (mudança de marcha, utilização do freio)

* Classe
    * É um protótipo a partir do qual cada objeto individual será criado
    * 