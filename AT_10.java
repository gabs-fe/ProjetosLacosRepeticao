import java.util.Scanner;

public class AT_10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        System.out.println("Digite o início");
        int inicio = ler.nextInt();
        System.out.println("Digite o fim");
        int fim = ler.nextInt();

        for (int contador = inicio + 1; contador < fim; contador++){
            System.out.println(contador);
        }
        ler.close();
    }
}
