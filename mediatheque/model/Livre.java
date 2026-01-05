package modiatheque.model;

public class Livre extends Media implements Empruntable {
    private String auteur;
    private int nombreDePages;
    private Utilisateur emprunteur;//champ
    public Livre(String auteur,String titre,int annee,int nombreDePages){
        super(titre,annee);
        this.auteur=auteur;
        this.nombreDePages=nombreDePages;
        this.emprunteur=null;
    }
     @Override
    public void emprunter( Utilisateur u){
        if(u==null){
            throw new IllegalArgumentException("L'utilisateur ne peut pas etre null");
        }
        if(!disponible){
            throw new IllegalStateException("Le livre est deja empruntee");
        }
        this.disponible=false;
        this.emprunteur=u;
    }
    @Override
    public void retourner(){
        if(emprunteur==null){
            throw new IllegalStateException("Le livre n'est pas emprunter");
        }
        this.disponible=true;
        this.emprunteur=null;
    }
    @Override
    public boolean estEmprunter() {
        return emprunteur != null;
    }
    @Override
    public void afficherInfos(){
        System.out.println("--------LIVRE--------");
        System.out.println("le titre:"+titre);
        System.out.println("Annee:" +annee);
        System.out.println("l'auteur:"+auteur);
        System.out.println("nombre de pages:"+nombreDePages);
        System.out.println("status:" + (disponible? "Disponible":"Emprunte"));
    }   
}
