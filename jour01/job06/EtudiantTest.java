 public class EtudiantTest {
    public static void main(String[] args) {
        Etudiant etudiant = new Etudiant("Bob");
        etudiant.nom();
        etudiant.ajout(15);
        etudiant.ajout(12);
        etudiant.ajout(18);
        etudiant.ajout(10);
        etudiant.notes();
        etudiant.meilleur();
        etudiant.pire();
        etudiant.moyenne();
    }

}

