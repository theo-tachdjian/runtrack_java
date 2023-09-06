public class BanqueTest {
    public static void main(String[] args) {
        CompteBancaire monSolde = new CompteBancaire(100);

        // Solde actuel
        monSolde.actuel();

        // Ajouter du solde
        monSolde.ajouter(50);

        // Retirer du solde
        monSolde.retirer(70);
        monSolde.retirer(90);

    }
}
