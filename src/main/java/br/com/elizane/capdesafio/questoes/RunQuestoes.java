package br.com.elizane.capdesafio.questoes;

/**
 * Class que organizará a execução dos exercico, metodos que possuem valores default ou com strings informadas
 */
public class RunQuestoes {

    /**
     * Metudo que executa a questão 01 com valor default e mostra no console
     */
    public void questao01() {
        Questao01.executarQuestao();
    }

    /**
     * Metodo que executar o questão 01 com o porcesameto da quantidade de degraus inofrmado
     *
     * @param tamanho quantidade de degraus que a escada terá
     */
    public void questao01(int tamanho) {
        new Questao01B().montarEscada(tamanho);
    }

    /**
     * Metodo que executa a questão 02 com os valores default e mostra o resulado no console
     *
     * @return
     */
    public RetornoSenha questao02() {
        return new Questao02().validarSenha("Skk#dfi$4");
    }

    /**
     * Metodo que irá verificar se a senha informa esta de acordo com as regras de segurança
     *
     * @param senha entrada da senha que será verificada
     * @return retorno uma class com as informações da senha
     */
    public RetornoSenha questao02(String senha) {
        return new Questao02().validarSenha(senha);
    }

    /**
     * Metodo que executa a questão 03 com valores default e mostra o resultado no conssole
     */
    public void questao03() {
        Questao03.executar("ifailuhkqq");
    }

    /**
     * Metodo de executa o processamento da string informada
     *
     * @param value entrada com a string que será analizada
     */
    public void questao03(String value) {
        Questao03.executar(value);
    }

    /**
     * metodo que executa todos exercicios com valores default
     */
    public void todas() {
        System.out.println("----------- Executar Todas as Questões -----------------");
        questao01();
        questao02();
        questao03();
        System.out.println("----------- FIM ----------------------------------------\n");
    }

    /**
     * Metodo que executa todos exercicios com as entradas dos valores
     *
     * @param tamanhoEscada informa quantos degraus a escada possue
     * @param senha         informa a senha para ser analizada
     * @param palavra       informa a string que será analizar se tem anagrama
     */
    public void todas(int tamanhoEscada, String senha, String palavra) {
        System.out.println("----------- Executar Todas as Questões -----------------");
        questao01(tamanhoEscada);
        questao02(senha);
        questao03(palavra);
        System.out.println();
        System.out.println("----------- FIM ----------------------------------------");
    }

}
