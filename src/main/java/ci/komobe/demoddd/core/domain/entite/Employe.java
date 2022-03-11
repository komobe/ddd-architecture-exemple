package ci.komobe.demoddd.core.domain.entite;

import ci.komobe.demoddd.core.domain.objetvaleur.TypeEmploye;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/**
 * @author Moro KONÉ 2021-12-04
 */
public final class Employe extends Personne {

  private Banque banque;
  private TypeEmploye type;
  private Set<Client> clients;

  public Employe() {
    this(UUID.randomUUID());
  }

  public Employe(UUID id) {
    super(id);
    clients = new HashSet<>();
  }

  public Banque getBanque() {
    return banque;
  }

  public void setBanque(Banque banque) {
    this.banque = banque;
  }

  public TypeEmploye getType() {
    return type;
  }

  public void setType(TypeEmploye type) {
    this.type = type;
  }

  public Set<Client> getClients() {
    return clients;
  }

  public void setClients(Set<Client> clients) {
    if (Objects.nonNull(clients)) {
      clients.forEach(client -> client.setEmploye(this));
    }
    this.clients = clients;
  }

  public void creerClient(Client client) {
    client.setEmploye(this);
    clients.add(client);
  }
}
