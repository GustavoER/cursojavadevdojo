package br.com.abc.core.colecoes.classes;

public class Celular {
    private String nome;
    private String imei;

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(this == obj){
            return true;
        }
        if(this.getClass() != obj.getClass()){
            return false;
        }
        Celular outroCelular = (Celular) obj;
        return this.imei != null && imei.equals(outroCelular.getImei());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public Celular(String nome, String imei) {
        this.nome = nome;
        this.imei = imei;
    }
}
