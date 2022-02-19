package br.com.elizane.capdesafio.util;

public class Util {
    /**
     * Vericar se a senha possue um caracter numérico
     * @param senha entrar com a senha para verificação
     * @return retorna verdadeiro caso encomtre um carcter numérico e false se não encontrar
     */
    public static boolean verificarSeTemNumero(String senha) {
        for (char c : senha.toCharArray()) {
            if (c >= 48 && c <= 57) return true;
        }
        return false;
    }

}
