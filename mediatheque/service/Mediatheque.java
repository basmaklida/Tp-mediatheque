package mediathequed.service;
public class Mediatheque {
    private Media[] medias;
    private int nbMedias;
    public Mediatheque(int capacite){
        medias=new Media[capacite];
        nbMedias=0;
    }
    public void ajoutMedia(Media m){
        if(nbMedias < medias.length){
            medias[nbMedias]=m;
            nbMedias++;
        }else{
            System.out.println("Capacite maximale atteinte.Impossible d'ajouter le media");
        }
    }
    public void afficherCatalogue(){
        System.out.println("CATALOGUE DE LA MEDIATHEQUE:");
        for(int i=0;i<nbMedias;i++){
            if(medias[i] != null){
                medias[i].afficherInfos();
                System.out.println("----------------------------------");
            }
        }
    }
    public Media chercherParTitre(String titre){
        for(int i=0;i<nbMedias;i++){
            if(medias[i] != null && medias[i].getTitre().equals(titre)){
                return medias[i];
            }
        }
        return null;
    }
}
/*package mediatheque.service;

import java.util.ArrayList;

public class Mediatheque{
    private int nbMedias;
    private ArrayList<Media>medias;
    public Mediatheque(){
        medias=new ArrayList<>();
    }
    public void ajoutMedia(Media m){
        medias.add(m);
    }
    public void afficherCatalogue(){
        System.out.println("Catalogue de la mediathque:");
        for(media m: medias){
                m.afficherInfos();
                System.out.println("---------------------------");
        }
    }
    public Media chercherParTitre(String titre){
        for(media m: medias){
            if(m.getTitre().equals(titre)){
                return m;
            }
        }
    return null;
    }
}*/


