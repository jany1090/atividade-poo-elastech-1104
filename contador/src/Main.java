import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o valor inicial do contador: ");

        int valorInicial = scanner.nextInt();

        Contador meuContador = new Contador(valorInicial);
            System.out.println("Valor inicial do contador: " + meuContador.getValor());

        meuContador.incrementar();
            System.out.println("Valor do contador após incrementar: " + meuContador.getValor());

        meuContador.zerar();
            System.out.println("Valor do contador após zerar: " + meuContador.getValor());

    }
}
