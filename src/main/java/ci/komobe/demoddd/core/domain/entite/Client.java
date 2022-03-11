package ci.komobe.demoddd.core.domain.entite;

import java.util.UUID;

/**
 * @author Moro KONÉ 2021-12-04
 */
public final class Client extends Personne {

  private Employe employe;

  public Client() {
    this(UUID.randomUUID());
  }

  public Client(UUID id) {
    super(id);
  }

  public Employe getEmploye() {
    return employe;
  }

  public void setEmploye(Employe employe) {
    this.employe = employe;
  }
}
