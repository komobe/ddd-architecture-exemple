package ci.komobe.demoddd.core.application.port;

import ci.komobe.demoddd.core.domain.entite.Employe;
import java.util.Optional;
import java.util.UUID;

/**
 * @author Moro KONÉ 2021-12-04
 */
public interface EmployeRepository {

  void enregistrer(Employe employe);

  Optional<Employe> obtenirParId(UUID id);
}
