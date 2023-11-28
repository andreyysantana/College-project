package ordenação;

import java.util.Scanner;

public class Ordenação01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();
        System.out.print("Digite o terceiro número: ");
        int numero3 = scanner.nextInt();
        System.out.print("Digite o quarto número: ");
        int numero4 = scanner.nextInt();

        int menor, segundoMenor, terceiroMenor, maior;

        if (numero1 < numero2) {
            menor = numero1;
            segundoMenor = numero2;
        } else {
            menor = numero2;
            segundoMenor = numero1;
        }

        if (numero3 < numero4) {
            terceiroMenor = numero3;
            maior = numero4;
        } else {
            terceiroMenor = numero4;
            maior = numero3;
        }

        if (menor > terceiroMenor) {
            int temp = menor;
            menor = terceiroMenor;
            terceiroMenor = temp;
        }

        if (segundoMenor > terceiroMenor) {
            int temp = segundoMenor;
            segundoMenor = terceiroMenor;
            terceiroMenor = temp;
        }

        if (menor > segundoMenor) {
            int temp = menor;
            menor = segundoMenor;
            segundoMenor = temp;
        }

        System.out.println("Sua lista ordenada é: " + menor + ", " + segundoMenor + ", " + terceiroMenor + ", " + maior);

        scanner.close();
    }
}
