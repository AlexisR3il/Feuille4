package Exercice2;

public class Personne {
  private String nom;
  private String prenom;
  private String numeroDeSecuriteSociale;

  public Personne (String nom, String prenom, String numeroDeSecuriteSociale) {
    this.nom = nom;
    this.prenom = prenom;
    this.numeroDeSecuriteSociale = numeroDeSecuriteSociale;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public void setnumeroDeSecuriteSociale(String numeroDeSecuriteSociale) {
    this.numeroDeSecuriteSociale = numeroDeSecuriteSociale;
  }

  public String getNom () {
    return this.nom;
  }

  public String getPrenom () {
    return this.prenom;
  }

  public String getNumeroDeSecuriteSociale () {
    return this.numeroDeSecuriteSociale;
  }
  
  @Override
  public boolean equals (Object other) {
    if(this == other) 
      return true;
    if(other == null)
      return false;
    if(!(other instanceof Personne))
      return false;
    Personne pers2 = (Personne) other;
    if (nom == pers2.nom && prenom == pers2.prenom)
      return true;
    return false;
  }

  @Override
  public String toString() {
    return "Personne :\n" + "Nom " + this.getNom + "\nPrenom " + this.getPrenom + "\nnumero De Securite Sociale " + this.getNumeroDeSecuriteSociale;
  }
}