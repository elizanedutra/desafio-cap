package br.com.elizane.capdesafio.questoes;

import br.com.elizane.capdesafio.util.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Questao02 {
    private final String especiais = "!@#$%^&*()-+";
    private final int minimo = 6;

    /**
     * Vericar se a senha possue um caracter numérico
     *
     * @param senha entrar com a senha para verificação
     * @return retorna verdadeiro caso encomtre um carcter numérico e false se não encontrar
     */
    protected boolean verificarSeTemNumero(String senha) {
        for (char c : senha.toCharArray()) {
            if (c >= 48 && c <= 57) return true;
        }
        return false;
    }

    /**
     * Metodo que verifica se tem um caracter especial na senha
     *
     * @param senha entrar com a senha para ser analizada
     * @return retorna verdadeiro caso encomtre um carcter especial e false se não tiver
     */
    protected boolean verificarCaracterEspecias(String senha) {
        for (char c : senha.toCharArray()) {
            for (char cs : especiais.toCharArray()) {
                if (cs == c) return true;
            }
        }
        return false;
    }

    /**
     * Metodo que verifica se tem um caracter minusculos na senha
     *
     * @param senha entrar com a senha para verificação
     * @return retorna verdadeiro caso encomtre um caracter minúsculo e false se não encontrar
     */
    protected boolean verificarSeTemMinuscula(String senha) {
        for (char c : senha.toCharArray()) {
            if (c >= 97 && c <= 122) return true;
        }
        return false;
    }

    /**
     * Metodo que verifica se tem um caracter maiscusculos na senha
     *
     * @param senha entrar com a senha para verificação
     * @return retorna verdadeiro caso encomtre um caracter minúsculo e false se não encontrar
     */
    protected boolean verificarSeTemMaiuscula(String senha) {
        for (char c : senha.toCharArray()) {
            if (c >= 65 && c <= 90) return true;
        }
        return false;
    }

    /**
     * Metodo de entrada para processamento da senha
     *
     * @param senha entrar com a senha para verificação
     * @return retorna um Class com as informações para serem analizados
     */
    public RetornoSenha validarSenha(String senha) {
        senha = "TTTgggDDD";
        String sugestao = "";
        if (senha.length() >= minimo) {
            Random rd = new Random();
            char[] indexModificados = new char[senha.length()];
            char cs[] = senha.toCharArray();
            boolean especial = verificarCaracterEspecias(senha);
            boolean maiuscula = verificarSeTemMaiuscula(senha);
            boolean minuscula = verificarSeTemMinuscula(senha);
            boolean numero = verificarSeTemNumero(senha);

            if (!maiuscula) {
                for (int i = 0; i < cs.length; i++) {
                    if (Util.isMinuscula(cs[i])) {
                        cs[i] -= 32;
                        indexModificados[i] = 1;
                        break;
                    }
                }
                sugestao = Util.charsToString(cs);
            }

            if (!minuscula) {
                for (int i = 0; i < cs.length; i++) {
                    if (Util.isMaisculas(cs[i]) && ((int) indexModificados[i] != 1)) {
                        cs[i] += 32;
                        indexModificados[i] = 1;
                        sugestao = Util.charsToString(cs);
                        break;
                    } else {
                        int max = 122, min = 97;
                        sugestao += "" + (char) rd.nextInt((max - min) + 1) + min;
                    }
                }
            }

            if (!especial) {
                char[] chars = especiais.toCharArray();
                sugestao = Util.charsToString(cs) + chars[rd.nextInt(especiais.length())];
            }

            if (!numero) {
                sugestao += "" + rd.nextInt(9);
            }

            return new RetornoSenha(false, "Sua senha e fraca", senha, sugestao);
        } else {
            int falta = minimo - senha.length();
            for (int i = 0; i < minimo; i++) {

            }
            return new RetornoSenha(false, "A senha deve ter pelo menos 6 caracters", senha, sugestao);
        }
    }
}
