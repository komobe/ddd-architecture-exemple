package ci.komobe.demoddd.core.domain.entite;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * @author Moro KONÉ 2021-12-04
 */
public class Banque {

  private final UUID id;
  private String nom;
  private Set<Employe> employes;

  public Banque() {
    this(UUID.randomUUID());
  }

  public Banque(UUID id) {
    this.id = id;
    employes = new HashSet<>();
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

  public Set<Employe> getEmployes() {
    return employes;
  }

  public void setEmployes(Set<Employe> employes) {
    this.employes = employes;
  }

  public void nouveauEmploye(Employe employe) {
    employe.setBanque(this);
    this.employes.add(employe);
  }
}
