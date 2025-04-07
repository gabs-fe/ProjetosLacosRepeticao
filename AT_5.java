import java.util.Scanner;

public class AT_5 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int anos = 0;

        while (true) {
            System.out.println("Qual a população A? ");
            double populacaoA = ler.nextDouble();
            System.out.println("Qual a população B? ");
            double populacaoB = ler.nextDouble();

            System.out.println("Taxa de crescimento A: ");
            double taxaA = ler.nextDouble();
            System.out.println("Taxa de crescimento B: ");
            double taxaB = ler.nextDouble();

            while (populacaoA < populacaoB) {
                populacaoA *= 1 + (taxaA / 100);
                populacaoB *= 1 + (taxaB / 100);
                anos++;
            }
            System.out.println("Levará " + anos + " anos.\n");
        }
    }
}
