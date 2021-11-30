package fr.test.example.exercices.banque;

public class Client {

    private Compte[] comptes = new Compte[0];
    private final String nom;

    public Client(String nom) {
        this.nom = nom;
    }


    public String getNom() {
        return nom;
    }

    public double getSolde() {
        // return total solde
        return 1;
    }

    public void afficherSolde() {

    }
}
