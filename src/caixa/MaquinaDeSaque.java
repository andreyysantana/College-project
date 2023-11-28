package caixa;

import java.util.Scanner;

public class MaquinaDeSaque{
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);

        System.out.println("Qual valor deseja sacar: ");
        int valorSaque = scanner.nextInt();

        int notasDe100 = valorSaque / 100;
        valorSaque %= 100;
        int notaDe50 = valorSaque / 50;
        valorSaque %= 50;
        int notaDe20 = valorSaque / 20;
        valorSaque %= 20;

        int somaDeResto = (notasDe100 * 100) + (notaDe50 * 50) + (notaDe20 * 20);

        System.out.println("Entregando notas:");

        if (notasDe100 > 0) {
            System.out.println(notasDe100 + " notas de R$:100,00");
        }
        if (notaDe50 > 0){
            System.out.println(notaDe50 + " notas de R$:50,00");
        }
        if (notaDe20 > 0) {
            System.out.println(notaDe20 + " notas de R$:20,00");
        }
        if(valorSaque > 0 ){
            System.out.println("valor residual de R$: "+ valorSaque +" Somente os R$:" + somaDeResto + " estão sendo debitados." );

        }else{
            System.out.println("Saque completo!");
        }
        scanner.close();
    }
}
