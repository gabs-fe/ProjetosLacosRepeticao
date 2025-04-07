import java.util.Scanner;
public class AT_2 
{
   public static void main(String[] args) 
   {
    Scanner ler = new Scanner(System.in);
    String nome, senha;

    do {
            System.out.println("Escreva seu nome de usuário: ");
            nome = ler.nextLine();
            System.out.println("Escreva sua senha: ");
            senha = ler.nextLine();

            if (nome.equals(senha)){
                System.out.println("Não podem ser iguais!");}
        } 
    while (nome.equals(senha));;
   ler.close();
    }
}
