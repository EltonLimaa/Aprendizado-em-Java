import java.util.Random;

public class SorteiodeNome {
    public static void main(String[] args) {

        int numero = new Random().nextInt(8);

        System.out.println("É o sortudo é");
        switch (numero){
            case 1:
                System.out.println("Elton");
                break;
            case 2:
                System.out.println("Emily");
                break;
            case 3:
                System.out.println("Bruno");
                break;
            case 4:
                System.out.println("Caio");
                break;
            case 5:
                System.out.println("Felipe");
                break;
            case 6:
                System.out.println("Jhon");
                break;
            case 7:
                System.out.println("Rodney");
                break;
            case 8:
                System.out.println("Ryan");
                break;
        }

    }
}
