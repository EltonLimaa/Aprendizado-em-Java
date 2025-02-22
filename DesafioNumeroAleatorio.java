import java.util.Random;
import java.util.Scanner;

public class DesafioNumeroAleatorio {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i = 0;
        int numeroS = new Random().nextInt(100);
        int numero = 0;
        int contador = 1;

        while (i < 2) {
            System.out.println("Tente advinhar o numero secreto: ");
            numero = ler.nextInt();

            if (numero < numeroS) {
                System.out.println("\nErrou, o numero secreto e maior!!! :(");
                contador++;
            } else if (numero > numeroS) {
                System.out.println("\nErrou, o numero secreto e menor!!! :(");
                contador++;
            } else {
                System.out.println("\nParabéns, acertou o numero secreto!!! :)");
                i = 2;
            }
        }
        if (contador == 1){
            System.out.println("Parabéns, acertou de primeira :)");
        }else{
            System.out.println(String.format("foram necesarias %s tentativas",contador));
        }
    }
}