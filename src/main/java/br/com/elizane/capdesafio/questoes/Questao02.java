package br.com.elizane.capdesafio.questoes;

import br.com.elizane.capdesafio.RetornoSenha;

public class Questao02 {
    private final String especiais = "!@#$%^&*()-+";

    /**
     * Vericar se a senha possue um caracter numérico
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
     * @param senha entrar com a senha para ser analizada
     * @return  retorna verdadeiro caso encomtre um carcter especial e false se não tiver
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
     * @param senha entrar com a senha para verificação
     * @return retorna um Class com as informações para serem analizados
     */
    public RetornoSenha validarSenha(String senha) {
        if (senha.length() >= 6) {
            if (verificarCaracterEspecias(senha)) {
                if (verificarSeTemMaiuscula(senha)) {
                    if (verificarSeTemMinuscula(senha)) {
                        if (verificarSeTemNumero(senha)) {
                            return new RetornoSenha(true, "Senha Forte", senha);
                        } else {
                            return new RetornoSenha(false, "A senha tem deve conter uma número", senha);
                        }
                    } else {
                        return new RetornoSenha(false, "A senha deve conter uma letra minúsculo", senha);
                    }
                } else {
                    return new RetornoSenha(false, "A senha deve conter uma letra maiúsculo", senha);
                }
            } else {
                return new RetornoSenha(false, "A senha deve conter um desses caracteres: !@#$%^&*()-+", senha);
            }
        } else {
            return new RetornoSenha(false, "A senha deve ter pelo menos 6 caracters", senha);
        }
    }
}
