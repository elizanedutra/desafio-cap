package br.com.elizane.capdesafio;

import br.com.elizane.capdesafio.process.ProcessArgs;
import br.com.elizane.capdesafio.questoes.RunQuestoes;

public class Capdesafio {
    /**
     * Metodo main static, metodo principal da aplicação
     * caso venhas argumentos na execução a aplicação ira tratra os argumentos e execuar os camonados passados
     *
     * @param args argumentos que poder ser informado na executa do programa pela IDE ou linha de propret de comando
     */
    public static void main(String[] args) {
        /**
         * Metodo exeucuta os args caso venha argumentos ou irá executar o que voce modificado dentro do bloco else
         */
        if (args.length > 0) {
            new ProcessArgs().process(args);
        } else {
            // Aqui é que chamamos os metodos pertinentes

            RunQuestoes runQuestoes = new RunQuestoes();// Criar Objeto responsavel bom absttrair a execução dos Questões

            runQuestoes.todas(); // Executar todas as quetões com valores default com base no enuciando
//            runQuestoes.todas(10, "tyteetor", "ifailuhkqq"); // Executar todas as questões com valores de entrada

//            runQuestoes.questao01(); // executa a questão com valor default conforme enuciado
//            runQuestoes.questao01(10); // Executar todas as questões com valores de entrada
//
//            runQuestoes.questao02(); // executa a questão com valor default conforme enuciado
//            runQuestoes.questao02("Htgg"); // Executar todas as questões com valores de entrada
//
//            runQuestoes.questao03(); // executa a questão com valor default conforme enuciado
//            runQuestoes.questao03("JoofgttHf"); // Executar todas as questões com valores de entrada

        }
    }
}
