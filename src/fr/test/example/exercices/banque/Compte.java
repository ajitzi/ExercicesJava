package fr.test.example.exercices.banque;

public class Compte {

    private int numero;
    private double solde = 0;

    public Compte(int numero) {
        this.numero = numero;
    }


    void deposer(double value) {
        this.solde += value;
    }

    void retirer(double value) {
        if (solde >= value) {
            this.solde += value;
        } else {
            System.out.println("Solde insufisant.");
        }
    }

    double getSolde() {
        return this.solde;
    }

    void afficherSolde() {
        System.out.println(this.solde);
    }

    void virer(double value, int numero) {
        if (solde >= value) {
            this.solde -= value;
            Compte Crediteur = new Compte(numero);
            Crediteur.deposer(value);

        } else {
            System.out.println("Solde insufisant.");
        }
    }
}
