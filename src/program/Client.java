package program;

public class Client {
    private static int cptClient = 0;
    private int numeroClient;
    private String nom;
    private double solde;

    public Client(String nom, double solde) {
        this.nom = nom;
        this.solde = solde;
        this.numeroClient = ++cptClient;
    }

    public int getNumeroClient() {
        return numeroClient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void ajouterSolde(double montant) {
        solde += montant;
    }

    public void retirerSolde(double montant) {
        if (montant <= solde) {
            solde -= montant;
        } else {
            System.out.println("Solde insuffisant pour effectuer cette opération.");
        }
    }

    public String toString() {
        return "Client{" +
                "numeroClient=" + numeroClient +
                ", nom='" + nom + '\'' +
                ", solde=" + solde +
                '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Client client = (Client) obj;
        return nom.equals(client.nom);
    }

}
