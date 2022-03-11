package ci.komobe.demoddd.core.application.port;

import ci.komobe.demoddd.core.domain.entite.Banque;
import java.util.Optional;
import java.util.UUID;

/**
 * @author Moro KONÉ 2021-12-04
 */
public interface BanqueRepository {

  void creer(Banque banque);

  Optional<Banque> obtenirParId(UUID id);
}
