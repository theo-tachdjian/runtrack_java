public class CompteBancaire {
    private int solde;

    public CompteBancaire(int solde) {
        //solde de base
        this.solde = solde;
    }

    public void actuel() {
        System.out.println("Solde actuel : " + solde +"€");
    }

    public void ajouter(int valeur) {
        solde+=valeur;
        System.out.println(valeur + "€ déposés. Nouveau solde : " + solde + "€");
    }

    public void retirer(int valeur) {
        if (solde-valeur >= 0) {
            solde-=valeur;
            System.out.println(valeur + "€ retirés. nouveau solde : " + solde + "€");

        } else {
            System.out.println("Tentative de retrait de " + valeur + "€... Solde insuffisant !");
        }
    }
}
