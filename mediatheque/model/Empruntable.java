package model;

public interface Empruntable {
    void emprunter(Utilisateur u);
    void retourner();
    boolean estEmprunter();
}
