package mediatheques.ui;

import mediatheque.model.*;
import mediatheque.service.Mediatheque;

public class TestMediatheque{

public static void main(String[] args){
        Mediatheque mediatheque = new Mediatheque(10);

        Livre livre1=new livre("JavaPoo",2022,"Erraji",350);
        Livre livre2=new livre("Changes",2024,"Basma",280);
        Livre livre3=new livre("ababil",2019,"khawla",420);
        Dvd dvd1=new Dvd("Inception",2010,"Nolan",148);

        mediatheque.ajouteMedia(livre1);
        mediatheque.ajoutMedia(livre2);
        mediatheque.ajouteMedia(livre3);
        mediatheque.ajoutMedia(dvd1);

        System.out.println("=== CATALOGUE INITIAL ===");
        mediatheque.afficherCatalogue();

        utilisateur u1= new utilisateur("Basma","Klida",20);
        utilisateur u2=new utilisateur("Marame","Klida",14);

        System.out.println("===EMPRUNTS===");
        livre1.emprunteur(u1);
        dvd1.emprunteur(u2);

        System.out.println("Livre1 disponible ? "  + livre1.estDisponible());
        System.out.println("Livre1 emprunte?"  +livre1.estEmprunte());

        System.out.println("dvd1 disponible ? "  + dvd1.estDisponible());
        System.out.println("dvd1 emprunte?"  +dvd1.estEmprunte());

        System.out.println("===TEST EXCEPRUION===");
        try{
            livre1.emorunter(u2);
        }catch (Exception e){
            System.out.println("Exception capturee : " +e.getMessage());
        }
        System.out.println("===RETEUR DES MEDIAS===");
        livre1.retourner();
        dvd1.retourner();

        mediatheque.afficherCtalogue();
    }
}
