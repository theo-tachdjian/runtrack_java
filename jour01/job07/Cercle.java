import java.lang.Math;

public class Cercle {

    private double rayon;

    public Cercle(double rayon) {
        //donne le rayon du cercle
        this.rayon = rayon;
    }

    public void aire() {
        //formule de l'aire d'un cercle
        System.out.println("Aire du cercle de rayon "+rayon+": " +(Math.PI * (Math.pow(rayon, 2)))+".");
    }

}