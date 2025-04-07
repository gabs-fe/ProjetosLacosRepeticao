import java.util.Scanner;
public class AT_8 {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int [] numeros = new int [5];
    int soma = 0, media = 0;

    for (int contador = 0 ; contador < 5 ; contador++){
    System.out.println("Informe seus números: ");
    numeros [contador] = ler.nextInt();}

    for (int contador = 0 ; contador < 5 ; contador++){
    soma += numeros[contador];}

    for (int contador = 0 ; contador < 5 ; contador++){
    media += numeros[contador]/5;}
    
    System.out.println("A soma dos números é: "+ soma);
    System.out.println("A média dos números é: "+ media);

    ler.close();
    }
}
