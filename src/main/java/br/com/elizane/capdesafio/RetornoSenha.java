package br.com.elizane.capdesafio;

public class RetornoSenha {
    private boolean forte;
    private String msg;
    private String senha;

    public RetornoSenha(boolean forte, String msg, String senha) {
        this.forte = forte;
        this.msg = msg;
        this.senha = senha;
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

    @Override
    public String toString() {
        return "RetornoSenha{" +
                "forte=" + forte +
                ", msg='" + msg + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }

    public void detalheSenha() {
        System.out.println("É forte        : " + (this.isForte() ? "SIM" : "NÂO"));
        System.out.println("Menssagem      : " + this.getMsg());
        System.out.println("Senha Informada: " + this.getSenha());
    }

}
