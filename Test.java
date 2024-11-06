package compteClient;

public class Test {
    public static void main(String[] args) {
        Compte monCompte = new Compte(5000);

        monCompte.deposer(1000);
        monCompte.retirer(5000);
        monCompte.afficher();
    }
}
