/**
 * author Paulo Henrique Cabral
 */

//Importanto a biblioteca Scanner
import java.util.Scanner;

public class dadosdoUsuario02 {

    public static void main(String [] args){
        System.out.println("Olá, boa noite");


        Scanner nomeUsuario = new Scanner(System.in);

        System.out.println("Qual é o seu nome ?");

         String nome = nomeUsuario.nextLine();

         System.out.println("Seja bem-vindo " +nome);


    }
}

