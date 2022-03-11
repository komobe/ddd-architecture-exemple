package ci.komobe.demoddd.infrastructure.repository.impl;

import ci.komobe.demoddd.core.application.port.ClientRepository;
import ci.komobe.demoddd.core.domain.entite.Client;
import ci.komobe.demoddd.infrastructure.repository.jpa.ClientRepositoryJpa;
import java.util.Optional;
import java.util.UUID;
import org.springframework.stereotype.Repository;

/**
 * @author Moro KONÉ 2021-12-04
 */
@Repository
public class ClientRepositoryImpl implements ClientRepository {

  private final ClientRepositoryJpa clientRepositoryJpa;

  public ClientRepositoryImpl(ClientRepositoryJpa clientRepositoryJpa) {
    this.clientRepositoryJpa = clientRepositoryJpa;
  }

  @Override
  public void creer(Client employe) {
    throw new UnsupportedOperationException();
  }

  @Override
  public Optional<Client> obtenirParId(UUID id) {
    return Optional.empty();
  }
}
