import java.util.Scanner;
public class AT_4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        double populacaoA = 8000, populacaoB = 200000;
        int anos=0;

        while (populacaoA<populacaoB){
        populacaoA = populacaoA * 1.03;
        populacaoB = populacaoB * 1.015;
        anos ++;
        
        }
        System.out.print("Levará "+ anos);
        System.out.print(" anos");
        
        ler.close();
    }
}
