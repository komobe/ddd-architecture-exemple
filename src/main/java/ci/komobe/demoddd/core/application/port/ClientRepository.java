package ci.komobe.demoddd.core.application.port;

import ci.komobe.demoddd.core.domain.entite.Client;
import java.util.Optional;
import java.util.UUID;

/**
 * @author Moro KONÉ 2021-12-04
 */
public interface ClientRepository {

  void creer(Client employe);

  Optional<Client> obtenirParId(UUID id);
}
