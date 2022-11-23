package Exercice1;

public class RectangleColore extends Rectangle {
  private String couleur;

  public RectangleColore (double largeur, double hauteur, double couleur) {
    super(largeur, hauteur);
    this.couleur = couleur;
  }

  public double getLargeur(double largeur) {
    return this.largeur;
  }

  public double getHauteur(double hauteur) {
    return this.hauteur;
  }

  public double getCouleur(double couleur) {
    return this.couleur;
  }

  @Override
  public String toString() {
    return super.toString() + "\nCouleur: " + couleur;
  }

  @Override
  public boolean equals(Object other){
    boolean result = super.semiEquals(other);
    if(result){
      if(other instanceof RectangleColore){
        RectangleColore patrick = (RectangleColore) other;
        result = patrick.couleur.equals(couleur);
      }else{
        result = false;
      }
    }
    return result;
  }
}