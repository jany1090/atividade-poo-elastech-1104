public class Main {
    public static void main(String[] args) {


        Continente americaDoSul = new Continente("América do Sul");


        americaDoSul.adicionarPais(new Pais("Brasil", 8515770, 212559554));
        americaDoSul.adicionarPais(new Pais("Argentina", 3768879, 45376759));
        americaDoSul.adicionarPais(new Pais("Peru", 1285216, 33007019));


        americaDoSul.imprimirInformacoes();
    }
}