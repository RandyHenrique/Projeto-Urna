package src;

public class Partido {

    private String nome;
    private String dataCriacao;

    public Partido(){}
    public Partido(String nome, String dataCriacao) {
        this.nome = nome;
        this.dataCriacao = dataCriacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
