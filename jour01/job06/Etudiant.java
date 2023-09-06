import java.util.ArrayList;
import java.util.Collections;

public class Etudiant {

    private String nom;
    private ArrayList<Integer> notes;

    public Etudiant(String nom) {
        //afficher le nom de l'étudiant
        this.nom = nom;
        this.notes = new ArrayList<Integer>();
    }

    public void nom() {
        System.out.println("Nom de l'étudiant : " + nom);
    }

    public void notes() {
        //entrer les notes existantes
        System.out.print("Notes: [");
        for (int i = 0; i < notes.size(); i++) {
            System.out.print(notes.get(i) + ((i != notes.size() - 1) ? ", " : "]\n"));
        }
    }

    public void ajout(int note) {
        //ajouter les notes
        notes.add(note);
        System.out.println("Ajouter la note : " + note);
    }

    public void meilleur() {
        //montrer la meilleur note obtenue
        if (notes.size() > 0) {
            System.out.println("Meilleur note: " + Collections.max(notes));
        } else {
            System.out.println("L'étudiant n'a pas de notes.");
        }
    }

    public void pire() {
        //monter la pire note obtenue
        if (notes.size() > 0) {
            System.out.println("Pire note: " + Collections.min(notes));
        } else {
            System.out.println("L'étudiant n'a pas de notes.");
        }
    }

    public void moyenne() {
        //faire la moyenne de toutes les notes de l'éleve
        if (notes.size() > 0) {
            int somme = 0;
            for (Integer note : notes) {
                somme += note;
            }
            System.out.println("Moyenne: " + (somme / notes.size()));
        } else {
            System.out.println("L'étudiant n'a pas de notes.");
        }
    }
}