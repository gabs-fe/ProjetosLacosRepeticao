
import java.util.Scanner;

public class AT_1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero = 0;

        do {
            System.out.println("Qual é o número?");
            numero = ler.nextInt();

            if (numero > 10){
            System.out.println("O número é inválido!");
        }
        } while (numero > 10);
        ler.close();
    }
   
}
