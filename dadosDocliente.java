/**
 * @author Paulo Henrique Cabral
 */

import java.util.Scanner;

public class dadosDocliente {
    public static void main(String [] args){
        System.out.println("Boa noite, qual é o seu nome ?");

        Scanner saudacao = new Scanner(System.in);


        String pessoa = saudacao.nextLine();
        System.out.println("Seja bem-vindo(a) " + pessoa);
        
    }
}
