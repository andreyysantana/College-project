package calculadora;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorUm;
        double valorDois;
        String operador;
        boolean continuar;
        try {
            do{
                System.out.println("Digite primeiro valor: ");
                valorUm = scanner.nextDouble();
                System.out.println("Qual operação gostaria de usar (+, -, *, /):");
                operador = scanner.next();
                System.out.println("Digite segundo valor: ");
                valorDois = scanner.nextDouble();
                System.out.println("Resultado: " + realizarCalculo(valorUm, valorDois, operador));

                continuar = verificarNovaOperacao();
            } while (continuar);
        }catch (InputMismatchException ex){
            System.out.println("Os valores para calcular devem ser numericos!");
        }
    }

    public static Double realizarCalculo(Double valorUm, Double valorDois, String operacao) {
        // objeto operadores
        Double respostaCalculo = 0.0;

        switch (operacao){
            case "+":
                respostaCalculo = valorUm + valorDois;
                break;
            case "-":
                respostaCalculo = valorUm - valorDois;
                break;
            case "*":
                respostaCalculo = valorUm * valorDois;
                break;
            case "/":
                respostaCalculo = valorUm / valorDois;
                break;
            default:
                System.out.println("Operação é inválida =(");

        }

        return respostaCalculo;

    }
    public static boolean verificarNovaOperacao() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja realizar uma nova operação ? (S ou N): ");
        return !sc.nextLine().toUpperCase(Locale.ROOT).equals("N");
    }
}


