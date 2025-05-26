/**
 * @author ph
 */
import java.util.Scanner;

public class dadosDoCliente04 {
    public static void main(String[] args) {

        System.out.println("Boa noite");
        System.out.println("Qual é o seu nome ?");
        Scanner usuario = new Scanner(System.in);



        String nome = usuario.nextLine();
        System.out.println("Seja bem-vindo " +nome);



    }

}
