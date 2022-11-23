package Exercice1;

public class Rectangle {
  private double largeur;
  private double hauteur;

  public Rectangle (double largeur, double hauteur) {
    this.largeur = largeur;
    this.hauteur = hauteur;
  }

  public double getLargeur(double largeur) {
    return this.largeur;
  }

  public double getHauteur(double hauteur) {
    return this.hauteur;
  }

  @Override
  public String toString() {
    return "Rectangle :\n" + "Largeur" + this.getlargeur + "\n" + "Hauteur" + this.getHauteur;
  }

  @Override
  public boolean equals (Object other) {
    if(this == other) 
      return true;
    if(other == null)
      return false;
    if(!(other instanceof Rectangle))
      return false;
    Rectangle rect2 = (Rectangle) other;
    if (largeur == rect2.largeur && hauteur == rect2.hauteur)
      return true;
    return false;
  }
}