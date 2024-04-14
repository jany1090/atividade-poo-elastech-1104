public class Pais {

    private String nome;
    private double dimensao;
    private long populacao;


    public Pais(String nome, double dimensao, long populacao) {
        this.nome = nome;
        this.dimensao = dimensao;
        this.populacao = populacao;
    }


    public String getNome() {
        return nome;
    }

    public double getDimensao() {
        return dimensao;
    }

    public long getPopulacao() {
        return populacao;
    }
}

