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
        } else
            new RunQuestoes().todas(10, "tyteetor", "ifailuhkqq");

    }
}
