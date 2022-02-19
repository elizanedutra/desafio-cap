package br.com.elizane.capdesafio.questoes;

public class RetornoSenha {
    private boolean forte;
    private String msg;
    private String senha;
    private String sugestao;

    public RetornoSenha(boolean forte, String msg, String senha, String sugestao) {
        this.forte = forte;
        this.msg = msg;
        this.senha = senha;
        this.sugestao = sugestao;
    }

    public RetornoSenha() {
    }

    public boolean isForte() {
        return forte;
    }

    public void setForte(boolean forte) {
        this.forte = forte;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSugestao() {
        return sugestao;
    }

    public void setSugestao(String sugestao) {
        this.sugestao = sugestao;
    }

    @Override
    public String toString() {
        return "-------------------Questão-02" + "\n" +
                "É Forte: " + (forte ? "SIM" : "NÂO") + "\n" +
                "Messagem: " + msg + "\n" +
                "senha Informada: " + senha;
    }

    public void detalheSenha() {
        System.out.println("É forte        : " + (this.isForte() ? "SIM" : "NÂO"));
        System.out.println("Menssagem      : " + this.getMsg());
        System.out.println("Senha Informada: " + this.getSenha());
        System.out.println("Segestão: " + this.getSugestao());
    }

}
