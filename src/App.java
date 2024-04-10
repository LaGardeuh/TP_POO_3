import java.util.Scanner;

import program.Client;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le nom du client : ");
        String nomClient = scanner.nextLine();
        Client client1 = new Client(nomClient, 50);

        System.out.println("Informations du client : ");
        System.out.println("Numéro de client : " + client1.getNumeroClient());
        System.out.println("Nom du client : " + client1.getNom());
        System.out.println("Solde du client : " + client1.getSolde());

        client1.ajouterSolde(100);
        client1.retirerSolde(50);

        System.out.println("Nouveau solde du client : " + client1.getSolde());

        scanner.close();
    }
}
