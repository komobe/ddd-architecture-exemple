package ci.komobe.demoddd.infrastructure.repository.impl;

import ci.komobe.demoddd.core.application.port.BanqueRepository;
import ci.komobe.demoddd.core.domain.entite.Banque;
import ci.komobe.demoddd.infrastructure.repository.jpa.BanqueRepositoryJpa;
import java.util.Optional;
import java.util.UUID;
import org.springframework.stereotype.Repository;

/**
 * @author Moro KONÉ 2021-12-04
 */
@Repository
public class BanqueRepositoryImpl implements BanqueRepository {

  private final BanqueRepositoryJpa banqueRepositoryJpa;

  public BanqueRepositoryImpl(BanqueRepositoryJpa banqueRepositoryJpa) {
    this.banqueRepositoryJpa = banqueRepositoryJpa;
  }

  @Override
  public void creer(Banque banque) {
    throw new UnsupportedOperationException();
  }

  @Override
  public Optional<Banque> obtenirParId(UUID id) {
    return Optional.empty();
  }
}
