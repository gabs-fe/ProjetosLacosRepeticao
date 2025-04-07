import java.util.Scanner;

public class AT_7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] numeros = new int[3];
    
        for (int contador = 0; contador < 3; contador++) {
            System.out.print("Informe os números: ");
            numeros[contador] = ler.nextInt(); 
        }
        int maior = numeros[0];
        int menor = numeros[0];

        for (int contador = 1; contador < 3; contador++) {
            if (numeros[contador] > maior) {
                maior = numeros[contador];
            }
            if (numeros[contador] < menor) {
                menor = numeros[contador];
            }
        }
        System.out.println("");
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        
        ler.close();
    }
}
