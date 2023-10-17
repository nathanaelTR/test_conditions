package fr.rnd_rev_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    // Je récupére le clavier de l'utilisateur 
        Scanner clavier = new Scanner(System.in);

    // L'utilisateur note sont nombre de vente + je ferme le clavier.
        System.out.print("Nombre de vente : ");
        int VenteClient = clavier.nextInt();
        clavier.close();
        
    // Le salaire de bases par semaine     
        int salaire = 400;
        System.out.println("Salaire par semaine : " + salaire);

    // Le nombre de vente pour la prime 
        int NombreDeVente = 10;
        System.out.println("Nombre de vente pour la prime : " + NombreDeVente);

    // La prime si le nombre de vente = 10
        int prime = 250;
        System.out.println("La prime : " + prime);

    // Calcule pour dire que si la vente du Client est supérieur ou égale au nombre de vente pour la prime
        if(NombreDeVente <= VenteClient) {

            // Je calcule le résultat entre la prime et le salaire
            int primeAvecSalaire = prime + salaire;

            System.out.println("La prime vous a été donnée ! ce qui vous fait un salaire de "+ primeAvecSalaire);

        }else {

            // le nombre de vente moins ce du client 
            int nombreManquant = NombreDeVente - VenteClient;

            // Si le nombre de vente supérieur au nombre de vente du client
             System.out.println("Vous n'avez pas eu la prime car " + VenteClient + " et inférieur au nombre de vente pour la prime ! (Nombre demander restant avant de reçevoir la prime : "+nombreManquant+")");

        }

    }
}

   /* Calcule pour savoir si le nombre de vente pour avoir la prime et supérieur a la Vente venant du Client
        if(NombreDeVente > VenteClient) {

            System.out.println("Vous n'avez pas eu la prime car " + VenteClient + " et inférieur au nombre de vente pour la prime !");

        }
        */