package mediatheque.model;
public class Dvd extends Media implements Empruntable{
    private String realisateur;
    private int dureeMinutes;
    private Utilisateur emprunteur;
    public Dvd(String realisateur,int dureeMinutes,String titre,int annee){
        super(titre,annee);
        this.realisateur=realisateur;
        this.dureeMinutes=dureeMinutes;
        this.emprunteur=null;
    }
    @Override
    public void emprunter(Utilisateur u){
        if(u==null){
            throw new IllegalArgumentException("L'utilisateur ne peut pas etre null");
        }
        if(!disponible){
            throw new IllegalStateException("Le Dvd est deja empruntee");
        }
        this.disponible=false;
        this.emprunteur=u;
    }
    @Override
    public void retourner(){
        if(emprunteur==null){
            throw new IllegalStateException("Le Dvd n'est pas emprunter");
        }
        this.disponible=true;
        this.emprunteur=null;
    }
    @Override
    public boolean estEmprunter(){
        return emprunteur!=null;
    }
    @Override
    public void afficherInfos(){
        System.out.println("titre:" +titre);
        System.out.println("realisateur:" +realisateur);
        System.out.println("duree:" +dureeMinutes+ "Minutes");
        System.out.println("annee de realisation:" +annee);
        System.out.println("status:" +(disponible ? "Disponible" : "Emprunte "));
    }
    
}
