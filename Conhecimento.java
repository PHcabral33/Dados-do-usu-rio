import java.util.Scanner;

public class Conhecimento {
    public static void main(String [] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Deus é bom o tempo todo, o tempo todo Deus é bom");

        System.out.println("Coisas que eu aprendi até o momento no Java:");


        System.out.print("Qual é o seu nome ?");
        String nome = entrada.nextLine();

        System.out.print("Digite sua idade:");
        int idade = entrada.nextInt();

        System.out.println("Olá" + nome + " você tem " + idade + " anos ");

        entrada.close();

        int a = 15;
        int b = 150;
        int soma = a + b;

        System.out.println("A soma de a + b é = " +soma);

        int c = 100;
        int d = 17;

        int subtrai = c - d;

        System.out.println("A subtração dos valores c - d é =" +subtrai);

        int x = 33;
        int y = 30;

        int multiplica = x * y;
        System.out.println("A multiplicação dos valores x * y é = " +multiplica);


        double h = 16;
        double n = 5;

        double divide = 5 / 16;

        System.out.println("A divisão dos valores h / n é = " +divide);







    }
}
