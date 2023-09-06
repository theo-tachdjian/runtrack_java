import java.util.Random;
    public class JeuDeDes {

        public static void main(String[] args) {
            Random lance = new Random();

            //Tirages aléatoire
            int de1 = lance.nextInt(1, 7);
            int de2 = lance.nextInt(1, 7);

            //Impression aléatoire
            System.out.println("Dé 1: "+de1);
            System.out.println("Dé 2: "+de2);

            //Cumule des tirages précédents
            System.out.println("Somme: "+(de1+de2));
        }

    }
