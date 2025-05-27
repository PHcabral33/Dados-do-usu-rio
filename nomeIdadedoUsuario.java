/**
 * @author PH
 */
import java.util.Scanner;


public class dadosCliente {
    public static void main(String[] args) {
        System.out.println("Boa noite");

        Scanner pede_nome = new Scanner(System.in);
        System.out.println("Digite seu nome: ");

        String nome = pede_nome.nextLine();
        System.out.println("Boa noite "+nome);

        Scanner pede_idade = new Scanner(System.in);
        System.out.println("Informe sua idade:");

        int idade = pede_idade.nextInt();
        System.out.println(nome+ " sua idade é " +idade+ " anos");



    }
}
