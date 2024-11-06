package compteClient;

public class Compte {
    public double solde;

    public Compte(double solde) {
        this.solde = solde;
    }

    public void deposer(double montant) {
        solde += montant;
    }

    public void retirer(double montant) {
        solde -= montant;
    }

    public void afficher() {
        System.out.println(solde);
    }

}