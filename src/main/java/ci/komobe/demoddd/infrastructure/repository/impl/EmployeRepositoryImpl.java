package ci.komobe.demoddd.infrastructure.repository.impl;

import ci.komobe.demoddd.core.application.port.EmployeRepository;
import ci.komobe.demoddd.core.domain.entite.Employe;
import ci.komobe.demoddd.infrastructure.repository.jpa.EmployeRepositoryJpa;
import java.util.Optional;
import java.util.UUID;
import org.springframework.stereotype.Repository;

/**
 * @author Moro KONÉ 2021-12-04
 */
@Repository
public class EmployeRepositoryImpl implements EmployeRepository {

  private final EmployeRepositoryJpa employeRepositoryJpa;

  public EmployeRepositoryImpl(EmployeRepositoryJpa employeRepositoryJpa) {
    this.employeRepositoryJpa = employeRepositoryJpa;
  }

  @Override
  public void enregistrer(Employe employe) {
    throw new UnsupportedOperationException();
  }

  @Override
  public Optional<Employe> obtenirParId(UUID id) {
    return Optional.empty();
  }
}
