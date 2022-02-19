package br.com.elizane.capdesafio;

import br.com.elizane.capdesafio.questoes.Questao01;
import br.com.elizane.capdesafio.questoes.Questao02;
import br.com.elizane.capdesafio.questoes.RetornoSenha;
import org.junit.Test;

import static org.junit.Assert.*;

public class TesteDesafio {

    @Test
    public void testQuestao01() {
        String[] strings = Questao01.executarQuestao();
        assertEquals(strings[0].trim(), "*");
    }

    @Test
    public void testQuestao02() {
        RetornoSenha senhaForte = new Questao02().validarSenha("ssffs%44I");
        RetornoSenha senhaFraca = new Questao02().validarSenha("sdffffsdfff");
        RetornoSenha senhaMenor = new Questao02().validarSenha("kdf");
        assertEquals(senhaForte.isForte(), true);
        assertEquals(senhaFraca.getMsg(), "A senha deve conter um desses caracteres: !@#$%^&*()-+");
        assertEquals(senhaMenor.getMsg(), "A senha deve ter pelo menos 6 caracters");
    }

    @Test
    public void testQuestao03() {
        String[] strings = Questao01.executarQuestao();
        assertEquals(strings[0].trim(), "*");
    }
}
