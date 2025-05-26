/**
 * @author PH
 */


import java.util.Scanner; // Importando a Classe Scanner que esta dentro do pacote java.util //
public class pedindoNomeSobrenome {
    public static void main(String[] args) {
        Scanner pessoa = new Scanner(System.in);

        String nome;
        String sobreNome;
        int idade;
        System.out.println("Digite seu nome:");

        nome = pessoa.nextLine();
        System.out.println("Digite seu sobrenome:");

        sobreNome = pessoa.nextLine();


        System.out.println("Digite sua idade: ");
        idade = pessoa.nextInt();
        System.out.print("Olá, " +nome+ " " +sobreNome+ ",tem "+idade+ "anos");

        pessoa.close();



    }
}
