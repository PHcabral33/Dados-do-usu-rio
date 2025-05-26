/**
 * @author Paulo Henrique
 * Entrada do Usuário
 * Fazer um programa que leia o Nome e o Sobrenome do usuário e apresente
 * o nome completo
 *
 */
import java.util.Scanner;

public class dadosDoUsuario {
    public static void main(String [] args){

        // declaração de variáveis do tipo String
        String nome;
        String sobrenome;

        // Entrada de dados - Scanner
        // Declaração do objeto
        Scanner digita;
        // Construindo o objeto
        digita = new Scanner(System.in);

        System.out.print("Digite seu nome:");
        // Recebe a entrada de dado
        nome = digita.nextLine();
        System.out.print("Digite seu sobrenome:");
        sobrenome = digita.nextLine();

        //saída
        System.out.println(nome + " " + sobrenome);





    }

}
