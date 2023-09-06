import java.util.Scanner;

public class Calculatrice {

    public static void main(String[] args) {
        //Donner un premier nombre
        Scanner nb1 = new Scanner(System.in);
        System.out.println("Entrer le premier nombre : ");
        int premier = Integer.parseInt(nb1.nextLine());

        //Donner un deuxieme nombre
        Scanner nb2 = new Scanner(System.in);
        System.out.println("Entrer le deuxieme nombre : ");
        int second = Integer.parseInt(nb2.nextLine());

        //calcules possibles
        int res1=premier+second;
        int res2=premier-second;
        int res3=premier*second;
        int res4=premier/second;

        //afficher les différents résultats
        System.out.println("Somme : " + res1);
        System.out.println("Différence : " + res2);
        System.out.println("Produit : " + res3);
        System.out.println("Division : " + res4);
    }
}
