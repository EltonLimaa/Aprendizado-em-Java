import java.util.Scanner;

public class EscolhaoCalculo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int op = 0;

        System.out.println("Digite 1. para calcular area do quadrado, 2. para area do circulo:");
        op = ler.nextInt();

        switch (op){
            case 1:
                System.out.println("Qual a altura: ");
                double alt = ler.nextDouble();
                System.out.println("Qual a largura: ");
                double larg = ler.nextDouble();
                int area = (int) (alt * larg);
                System.out.println(String.format("A area total vai ser de %d m²",area));

                break;
            case 2:
                System.out.println("Qual o raio do circulo: ");
                int raio = ler.nextInt();
                double a = 3.14 * (raio * raio);
                System.out.println(String.format("A area do circulo sera de %.1f",a));

                break;
        }
    }
}
