/**
 * author Paulo Henrique
 * 5 de Maio de 2025
 * T
 */

public class conversaoExplicita {
    public static void main(String [] args){

        //do maior para o menor tipo

        long varLong = 653654;
        int varInt = (int) varLong;
        System.out.println("Long: " +varLong);
        System.out.println("Int: " +varInt);


        double varDouble = 3654.9875;
        int varInt2 = (int) varDouble;
        float varFloat = (float) varDouble;

        System.out.println("Double para int: "+varInt2);
        System.out.println("Double para Float: "+ varFloat);





    }
}
