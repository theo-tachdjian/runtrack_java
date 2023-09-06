public class Voiture {
    private String marque;
    private String couleur;
    private int vitesse;

    // Constructeur
    public Voiture(String marque, String couleur) {
        this.marque = marque;
        this.couleur = couleur;
        this.vitesse = 0; // vitesse 0km/h
    }

    public void demarrer() {
        System.out.println("La voiture démarre.");
    }

    public void accelerer() {
        vitesse += 10;
        System.out.println("La vitesse est maintenant de " + vitesse + " km/h.");
    }

    public void freiner() {
        while (vitesse > 0) {
            vitesse = 0;
            if (vitesse < 0) {
                vitesse = 0;
            }
            System.out.println("La voiture s'arrete. Vitesse réinitialisée à 0km/h.");
        }
    }
}
