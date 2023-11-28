package media;

import java.util.Scanner;

public class MediaAritmeticaSimples {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua primeira nota: ");
        int nota1 = scanner.nextInt();
        System.out.println("Digite sua segunda nota: ");
        int nota2 = scanner.nextInt();
        System.out.println("Digite sua Terceira nota: ");
        int nota3 = scanner.nextInt();
        System.out.println("Digite sua quarta nota: ");
        int nota4 = scanner.nextInt();

        int media = (nota1 + nota2 + nota3 + nota4) / 2;

        if(media <= 39){
            System.out.println("REPROVADO, sua media foi: " + media);

        } else if (media >= 40 && media < 70) {
            System.out.println("EXAME sua media foi: " + media);
            System.out.println("Coloque sua nota do exame: ");

            int exame = scanner.nextInt();

            int mediaExame = media + exame / 2;

            if(mediaExame < 49){
                System.out.println("NÃO OBETEVE A MEDIA, REPROVADO!");
            }else{
                System.out.println("PARABENS FOI APROVADO!");
            }

        }else {
            System.out.println("APROVADO sua media foi: " + media);
        }
    }
}
