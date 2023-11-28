package imc;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class CalculadoraDeImc {
    public static void main(String[] args) {


        DecimalFormatSymbols simbolos = new DecimalFormatSymbols(new Locale("pt", "BR"));
        DecimalFormat formatoComVirgula = new DecimalFormat("#,##0.00", simbolos);

        Scanner scanner = new Scanner(System.in);


        System.out.print("CALCULO IMC");
        System.out.println();

        System.out.println("Informe sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Informe seu peso: ");
        double peso = scanner.nextDouble();


        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC: %.1f%n ", imc);


        if (imc < 18.5) {
            System.out.println("Se encontra: Abaixo do peso");
        }
        else if (imc <= 18.6 && imc < 24.9){
            System.out.println("Se encontra: Peso ideal");
        }
        else if (imc <= 25 && imc < 29.9){
            System.out.println("Se encontra: Levemente acima do peso");
        }
        else if (imc <= 30 && imc < 34.5){
            System.out.println("Se encontra: Obesidade Leve (grau I)");
        }
        else if (imc <= 35 && imc < 39.9){
            System.out.println("Se encontra: Obesidade Leve (grau II)");
        }
        else{
            System.out.println("Se encontra: Obesidade Leve (grau III)");
        }
        scanner.close();
    }

}
