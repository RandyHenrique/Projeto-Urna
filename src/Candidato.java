package src;

public class Candidato extends Pessoa {

    private int numero;
    private Partido partido;

    public int getQtdVotos() {
        return qtdVotos;
    }

    public void setQtdVotos() {
        this.qtdVotos++;
    }

    private int qtdVotos;

    public Candidato(){}

    public Candidato(int numero, Partido partido) {
        this.numero = numero;
        this.partido = partido;
    }

    public Candidato(String nome, String idade, int numero, Partido partido) {
        super(nome, idade);
        this.numero = numero;
        this.partido = partido;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }
}
