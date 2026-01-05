package model;
public abstract class Media{
protected String titre;
protected int annee;
protected boolean disponible;
public Media(String titre,int annee){
    this.titre=titre;
    this.annee=annee;
    this.disponible=true;
}
public String getTitre(){
    return titre;
}
public boolean estDisponible(){
    return disponible;
}
public void setDisponible(boolean disponible){
    this.disponible=disponible;
}
public abstract void afficherInfos();
}
