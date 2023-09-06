import java.util.Scanner;

public class job01 {
    /*demander à l'utilisateur son nom et l'afficher
     le message de bienvenue*/

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Veuillez saisir votre nom : ");
        String name=scanner.nextLine();
        System.out.println("Bienvenue : " + name);
    }
}