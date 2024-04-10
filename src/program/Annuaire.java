package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Annuaire {
    private List<Client> listeClients;

    public Annuaire() {
        this.listeClients = new ArrayList<>();
    }

    public void ajouterClient(Client client) {
        listeClients.add(client);
    }

    public void afficherClients() {
        System.out.println("Liste des clients dans l'annuaire :");
        for (Client client : listeClients) {
            System.out.println(client);
        }
    }

    public int getTailleAnnuaire() {
        return listeClients.size();
    }

    public Client rechercherClient(int idClient) {
        for (Client client : listeClients) {
            if (client.getNumeroClient() == idClient) {
                return client;
            }
        }
        return null;
    }

    public boolean supprimerClient(int idClient) {
        Iterator<Client> iterator = listeClients.iterator();
        while (iterator.hasNext()) {
            Client client = iterator.next();
            if (client.getNumeroClient() == idClient) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public void crediterClient(int idClient, double montantCredit) {
        Client client = rechercherClient(idClient);
        if (client != null) {
            client.ajouterSolde(montantCredit);
        } else {
            System.out.println("Aucun client trouvé avec cet identifiant.");
        }
    }

    public double getMontantTotalSoldes() {
        double montantTotal = 0;
        for (Client client : listeClients) {
            montantTotal += client.getSolde();
        }
        return montantTotal;
    }

    public boolean contient(Client client) {
        return listeClients.contains(client);
    }
}
