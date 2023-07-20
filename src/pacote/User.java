package pacote;
import java.util.Scanner;

public class User {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu Nome : ");
        String name = scanner.nextLine();

        System.out.println("Olá, " + name);
    }


}
