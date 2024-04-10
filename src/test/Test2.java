package test;

import program.Annuaire;
import program.Client;

public class Test2 {

    public static void main(String[] args) {
        Annuaire annuaire = new Annuaire();

        Client c1 = new Client("pedro", 210);
        Client c2 = new Client("pedro", 180);

        annuaire.ajouterClient(c1);

        System.out.println("L'annuaire contient c1 : " + annuaire.contient(c1));
        System.out.println("L'annuaire contient c2 : " + annuaire.contient(c2));

    }
}
