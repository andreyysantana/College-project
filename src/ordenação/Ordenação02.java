package ordenação;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ordenação02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira 4 números
        System.out.println("Digite os 4 números separados por vírgula (exemplo: 3, 10, 0, -5):");
        String input = scanner.nextLine();

        // Dividir a entrada em um array de strings
        String[] numerosStr = input.split(", ");

        // Criar uma lista de inteiros para armazenar os números
        List<Integer> numeros = new ArrayList<>();

        for (String numStr : numerosStr) {
            try {
                int num = Integer.parseInt(numStr);
                numeros.add(num);
            } catch (NumberFormatException e) {
                System.err.println("Entrada inválida. Certifique-se de usar o formato correto.");
                return;
            }
        }


        Collections.sort(numeros);


        System.out.print("Sua lista ordenada é: ");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i));
            if (i < numeros.size() - 1) {
                System.out.print(", ");
            }
        }

        scanner.close();
    }
}