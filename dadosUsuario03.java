/**
 * @author Paulo Henrique Cabral
 */
import java.util.Scanner;
public class dadosUsuario03 {
    public static void main(String [] args){
        System.out.println("Olá, boa noite");
        System.out.println("Digite seu nome: ");
        Scanner nome = new Scanner(System.in);

        String digita = nome.nextLine();
        System.out.println("seja bem-vindo " +digita);



    }
}
