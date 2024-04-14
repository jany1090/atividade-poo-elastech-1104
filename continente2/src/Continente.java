import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Continente {

    private String nome;
    private List<Pais> paises;


    public Continente(String nome) {
        this.nome = nome;
        this.paises = new ArrayList<>();
    }


    public void adicionarPais(Pais pais) {
        this.paises.add(pais);
    }


    public double getDimensaoTotal() {
        return this.paises.stream().mapToDouble(Pais::getDimensao).sum();
    }


    public long getPopulacaoTotal() {
        return this.paises.stream().mapToLong(Pais::getPopulacao).sum();
    }


    public double getDensidadePopulacional() {
        if (getDimensaoTotal() == 0) {
            return 0;
        }
        return getPopulacaoTotal() / getDimensaoTotal();
    }



    public Pais getPaisComMaiorPopulacao() {
        return this.paises.stream().max(Comparator.comparingLong(Pais::getPopulacao)).orElse(null);
    }



    public Pais getPaisComMenorPopulacao() {
        return this.paises.stream().min(Comparator.comparingLong(Pais::getPopulacao)).orElse(null);
    }



    public Pais getPaisComMaiorDimensao() {
        return this.paises.stream().max(Comparator.comparingDouble(Pais::getDimensao)).orElse(null);
    }



    public Pais getPaisComMenorDimensao() {
        return this.paises.stream().min(Comparator.comparingDouble(Pais::getDimensao)).orElse(null);
    }



    public double getRazaoTerritorialMaiorMenorPais() {
        Pais paisMaiorDimensao = getPaisComMaiorDimensao();
        Pais paisMenorDimensao = getPaisComMenorDimensao();

        if (paisMaiorDimensao == null || paisMenorDimensao == null) {
            return 0;
        }

        return paisMaiorDimensao.getDimensao() / paisMenorDimensao.getDimensao();
    }



    public void imprimirInformacoes() {
        System.out.println("=========================================");
        System.out.println("Continente: " + this.nome);
        System.out.println("-----------------------------------------");

        for (Pais pais : this.paises) {
            System.out.println("País: " + pais.getNome());
            System.out.println("Dimensão: " + pais.getDimensao() + " km²");
            System.out.println("População: " + pais.getPopulacao() + " habitantes");
            System.out.println("-----------------------------------------");
        }

        System.out.println("Dimensão total do continente: " + getDimensaoTotal() + " km²");
        System.out.println("População total do continente: " + getPopulacaoTotal() + " habitantes");
        System.out.println("Densidade populacional do continente: " + getDensidadePopulacional() + " hab/km²");
        System.out.println("País com maior população: " + (getPaisComMaiorPopulacao() != null ? getPaisComMaiorPopulacao().getNome() : "Não existe"));
        System.out.println("País com menor população: " + (getPaisComMenorPopulacao() != null ? getPaisComMenorPopulacao().getNome() : "Não existe"));
        System.out.println("País com maior dimensão territorial: " + (getPaisComMaiorDimensao() != null ? getPaisComMaiorDimensao().getNome() : "Não existe"));
        System.out.println("País com menor dimensão territorial: " + (getPaisComMenorDimensao() != null ? getPaisComMenorDimensao().getNome() : "Não existe"));
        System.out.println("Razão territorial do maior para o menor país: " + getRazaoTerritorialMaiorMenorPais());
        System.out.println("=========================================");
    }
}
