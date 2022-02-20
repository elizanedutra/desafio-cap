# Elizane Dutra Silva Carvalho
![banner](https://user-images.githubusercontent.com/98763411/154823112-3cf7f26b-6893-434f-bce7-652395cb4633.png)

# EU ESTOU PRONTA PARA CONSTRUIR O MEU FUTURO...

**O projeto voi feito em java com maven, eu procurei atenter os requisitos e implementar algums funcionalidades por minha conta, foi implementado um CLI onde posibilitar testar todas as execuções das questões com comandos espessificos** 

> Projeto DESAFIO DE PROGRAMAÇÃO - ACADEMIA CAPGEMINI
* Questão 01
* Questão 02
* Questão 03

> Segue abaixo a forma de executa para cada questão, uma por vez ou todas em uma unica chamada

* **Class Capdesafio:** É a class principal com metodo **main** onde ela estará espera argumentos como entra, caso não seja oferecido nem uma argumento como entrada ela ira executar os metodos dentro do bloco else
* **Class RunQuestoes:** responsável pela execução das questões

**Exemplos:**
<p>obs.: O codigo deverar ser escrito dentro do bloco else e não entrar com nem um argumento no String[] args</p>

```
RunQuestoes runQuestoes = new RunQuestoes();// Criar Objeto responsavel bom absttrair a execução dos Questões
            
runQuestoes.todas(); // Executar todas as quetões com valores default com base no enuciando 
runQuestoes.todas(10, "tyteetor", "ifailuhkqq"); // Executar todas as questões com valores de entrada
```
**Saida Todas as Questão**

```
RunQuestoes runQuestoes = new RunQuestoes();// Criar Objeto responsavel bom absttrair a execução dos Questões
                        
runQuestoes.questao01(); // executa a questão com valor default conforme enuciado
runQuestoes.questao01(10); // Executar todas as questões com valores de entrada

```


**Saida Questão 01**
![saida-q1](https://user-images.githubusercontent.com/98763411/154825129-b22d35ee-f420-4d32-899f-b8804dddaacc.png)


**Saida Questão 02**
```
RunQuestoes runQuestoes = new RunQuestoes();// Criar Objeto responsavel bom absttrair a execução dos Questões

runQuestoes.questao02(); // executa a questão com valor default conforme enuciado
runQuestoes.questao02("Htgg"); // Executar todas as questões com valores de entrada

```  
![saida-q2](https://user-images.githubusercontent.com/98763411/154825203-55813821-556b-4603-9376-5c1c3a29f301.png)


**Saida Questão 03**
```
RunQuestoes runQuestoes = new RunQuestoes();// Criar Objeto responsavel bom absttrair a execução dos Questões

runQuestoes.questao03(); // executa a questão com valor default conforme enuciado
runQuestoes.questao03("JoofgttHf"); // Executar todas as questões com valores de entrada

```  

 


