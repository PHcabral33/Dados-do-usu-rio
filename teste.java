/**
 * @author PH
 */


import java.util.Scanner; //Importanto a Classe Scanner de dentro do pacote java.util, para ler o teclado do usuário //
public class teste {
    public static void main(String[] args) {
        System.out.println("Diga seu nome:");

        //Nomeando o objeto dentro da classe Scanner, com o nome pessoa - Esse objeto, seria o teclado do usuário //
        Scanner pessoa = new Scanner(System.in);

        String nome = pessoa.nextLine();

        System.out.println(" Boa noite " + nome);


    }
}
