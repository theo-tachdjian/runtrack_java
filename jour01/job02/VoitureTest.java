public class VoitureTest {
    public static void main(String[] args) {
        Voiture maVoiture = new Voiture("Peugeot", "Blanche");

        // Démarrer la Voiture
        maVoiture.demarrer();

        // Accélérer deux fois
        maVoiture.accelerer();
        maVoiture.accelerer();

        // Freiner
        maVoiture.freiner();
    }
}
