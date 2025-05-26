import java.util.Scanner;

public class AulaMista {
    public static void main (String [] args){
        System.out.println("Coisas que eu aprendi em Java");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome:");
        String nome = scanner.nextLine();
        System.out.println(" Olá,"  +nome+  " sejá bem-vindo ");

        int num1 = 1991;
        int num2 = 33;

        int soma = num1 + num2;
        System.out.println("A soma das variaveis " +soma);


        int a = 33;
        int b = 5;

        int multiplicacao = a * b;
        System.out.println("A multiplicação dos valores " + multiplicacao);


        double c = 2025;
        double d = 15;

        double divisao = c / d;

        System.out.println("A divisão entre c e d é " +divisao);

        int val1 = 2025;
        int val2 = 1991;

        int subtrai = val1 - val2;
        System.out.println("A subtração dos valores é " +subtrai);



















    }
}
