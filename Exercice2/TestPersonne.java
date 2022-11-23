package Exercice2;

class TestPersonne {
  public static void main (String args[]) {
    Personne juliette, romeo;
    juliette = new Personne("Dupont", "Juliette", "0781075987765 67");
    romeo = new Personne("Durand", "Romeo", "1741075987345 05");
    System.out.println("nom de romeo : "+romeo.getNom());
    System.out.println("tout sur juliette : "+juliette.toString());
    if (juliette.estHomme())
      System.out.println("juliette est un homme");
    else
      System.out.println("juliette est une femme");
    Personne homonyme = new Personne("Dupont", "Juliette", "0765839286755 67");
    if (juliette.equals(homonyme))
      System.out.println("juliette equals homonyme");
    else
      System.out.println("juliette pas equals homonyme");
  }
}
