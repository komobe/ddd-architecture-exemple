package ci.komobe.demoddd.core.domain.entite;

import ci.komobe.demoddd.core.domain.objetvaleur.Genre;
import java.util.UUID;

/**
 * @author Moro KONÉ 2021-12-04
 */
public abstract sealed class Personne permits Employe, Client {

  private final UUID id;
  private String nom;
  private String prenom;
  private Genre genre;

  Personne(UUID id) {
    this.id = id;
  }

  public UUID getId() {
    return id;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public Genre getGenre() {
    return genre;
  }

  public void setGenre(Genre genre) {
    this.genre = genre;
  }
}
