package br.com.elizane.capdesafio.questoes;

public class Questao01 {

    private final static String escada[] = new String[6];

    /**
     * Metodo montar a linha espessifica do degrau da escada
     *
     * @param n
     */
    private static void getDegrau(int n) {
        switch (n) {
            case 0:
                escada[0] = "     *";
                break;
            case 1:
                escada[1] = "    **";
                break;
            case 2:
                escada[2] = "   ***";
                break;
            case 3:
                escada[3] = "  ****";
                break;
            case 4:
                escada[4] = " ******";
                break;
            case 5:
                escada[5] = "*******";
                break;
        }
    }

    /**
     * Metodo para imprimir escada no console
     */
    private static void mostrarEscada() {
        System.out.println("-------------------Questão-01");
        for (String s : escada) {
            System.out.println(s);
        }
    }

    /**
     * Metodo que constroe a escada
     */
    private static void montarEscada() {
        for (int i = 0; i < 7; i++) {
            getDegrau(i);
        }
    }

    /**
     * Medoto pricimpal onde inicia o fluxo de construção saida no console da escada
     */
    public static void executarQuestao() {
        montarEscada();
        mostrarEscada();
    }
}
