package ci.komobe.demoddd.infrastructure.mapper.factory;

import ci.komobe.demoddd.core.domain.entite.Employe;
import ci.komobe.demoddd.infrastructure.entity.EmployeEntity;
import java.util.UUID;
import org.mapstruct.ObjectFactory;

/**
 * @author Moro KONÉ 2021-12-04
 */
public class EmployeFactory implements Factory<EmployeEntity, Employe> {

  @Override
  @ObjectFactory
  public Employe factory(EmployeEntity source) {
    return new Employe(UUID.randomUUID());
  }
}
