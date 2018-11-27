package br.com.abc.core.enumeradores.classes;

public enum TipoCliente {
    PESSOA_FISICA(1,"Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    private int tipo;
    private String tipoPessoa;
    TipoCliente(int tipo, String tipoPessoa) {
        this.tipo = tipo;
        this.tipoPessoa = tipoPessoa;
    }
    public int getTipo() {
        return tipo;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }
}
