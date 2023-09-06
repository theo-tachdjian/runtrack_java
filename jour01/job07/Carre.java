import java.lang.Math;

public class Carre {

    private double cote;

    public Carre(double cote) {
        //donne le coté du cercle
        this.cote = cote;
    }

    public void aire() {
        //formule de l'aire d'un carré
        System.out.println("Aire du carré de cote "+cote+": " +(cote * cote)+".");
    }

}