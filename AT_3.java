import java.util.Scanner;

public class AT_3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String nome;
        int idade = 0;
        double salario=0;
        char sexo, estadocivil;

        do {
            System.out.println("\nEscreva seu nome:");
            nome = ler.nextLine();

            if (nome.length() <= 3) {
                System.out.println("Nome inválido!");
            }
        } while (nome.length() <= 3);

        do {
            System.out.println("\nEscreva sua idade:");
            idade = ler.nextInt();

            if (idade > 150 || idade <= 0) {
                System.out.println("Idade inválida!");
            }
        } while (idade > 150 || idade <= 0);
        
        do {
            System.out.println("\nQual o seu salário?");
            salario = ler.nextDouble();

            if (salario <= 0){
                System.out.println("Salário inválido!");
            }
        } while (salario <= 0);

        do {
            System.out.println("\nInforme o seu sexo (m/f):");
            sexo = ler.next().toLowerCase().charAt(0);
            if (sexo != 'm' && sexo != 'f') {
                System.out.println("Sexo inválido!\n");
            }
        } while (sexo != 'm' && sexo != 'f');

        do {
            System.out.println("\nInforme seu estado civil (s/c/v/d):");
            estadocivil = ler.next().toLowerCase().charAt(0);
            if (estadocivil != 's' && estadocivil != 'c' && estadocivil != 'v' && estadocivil != 'd') {
                System.out.println("Estado civil inválido!\n");
            }
        } while (estadocivil != 's' && estadocivil != 'c' && estadocivil != 'v' && estadocivil != 'd');

        System.out.println("\nNome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Salário: R$"+ salario);
        System.out.println("Sexo: "+ sexo);
        System.out.println("Estado civil: "+ estadocivil);

        ler.close();
    }
}
