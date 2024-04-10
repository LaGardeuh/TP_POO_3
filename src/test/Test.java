package test;

import program.Annuaire;
import program.Client;
import util.Saisie;

public class Test {

	public static void main(String[] args) {
		Annuaire annuaire = new Annuaire();
		Client client1 = new Client("Alice", 70);
		Client client2 = new Client("Bob", 80);
		annuaire.ajouterClient(client1);
		annuaire.ajouterClient(client2);

		System.out.println("L'annuaire contient Alice : " + annuaire.contient(client1)); 
		System.out.println("L'annuaire contient Bob : " + annuaire.contient(client2));

		int rep = 0;
		while (rep != -1) {
			System.out.println("1 ===>  Ajouter un nouveau client");
			System.out.println("2 ===>  Afficher la taille de l'annuaire");
			System.out.println("3 ===>  Afficher l'annuaire complet");
			System.out.println("4 ===>  Rechercher un client par son identifiant");
			System.out.println("5 ===>  Supprimer un client par son identifiant");
			System.out.println("6 ===>  Créditer le solde d'un client");
			System.out.println("7 ===>  Afficher le total des soldes des clients de l'annuaire");
			System.out.println("-1 ===>  Quitter");
			rep = Saisie.lireEntier("Votre choix ?");

			switch (rep) {
				case 1:
					String nom = Saisie.lireChaine("Entrez le nom du client : ");
					double solde = Saisie.lireDouble("Entrez la solde du client : ");
					Client nouveauClient = new Client(nom, solde);
					annuaire.ajouterClient(nouveauClient);
					System.out.println("Client ajouté avec succès !");
					break;
				case 2:
					System.out.println("Taille de l'annuaire : " + annuaire.getTailleAnnuaire());
					break;
				case 3:
					annuaire.afficherClients();
					break;
				case 4:
					int idClient = Saisie.lireEntier("Entrez l'identifiant du client : ");
					Client clientRecherche = annuaire.rechercherClient(idClient);
					if (clientRecherche != null) {
						System.out.println("Client trouvé : " + clientRecherche);
					} else {
						System.out.println("Aucun client trouvé avec cet identifiant.");
					}
					break;
				case 5:
					int idClientSuppression = Saisie.lireEntier("Entrez l'identifiant du client à supprimer : ");
					boolean suppressionReussie = annuaire.supprimerClient(idClientSuppression);
					if (suppressionReussie) {
						System.out.println("Client supprimé avec succès !");
					} else {
						System.out.println("Aucun client trouvé avec cet identifiant.");
					}
					break;
				case 6:
					int idClientCrediter = Saisie.lireEntier("Entrez l'identifiant du client à créditer : ");
					double montantCredit = Saisie.lireDouble("Entrez le montant à créditer : ");
					annuaire.crediterClient(idClientCrediter, montantCredit);
					System.out.println("Solde du client mis à jour avec succès !");
					break;
				case 7:
					System.out.println(
							"Montant total des soldes des clients de l'annuaire : " + annuaire.getMontantTotalSoldes());
					break;
				case -1:
					System.out.println("Au revoir !");
					break;
				default:
					System.out.println("Choix invalide !");
					break;
			}
		}
	}
}
