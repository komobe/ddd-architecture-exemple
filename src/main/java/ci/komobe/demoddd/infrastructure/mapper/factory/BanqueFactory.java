package ci.komobe.demoddd.infrastructure.mapper.factory;

import ci.komobe.demoddd.core.domain.entite.Banque;
import ci.komobe.demoddd.infrastructure.entity.BanqueEntity;
import java.util.UUID;
import org.mapstruct.ObjectFactory;

/**
 * @author Moro KONÉ 2021-12-04
 */
public class BanqueFactory implements Factory<BanqueEntity, Banque> {

  @Override
  @ObjectFactory
  public Banque factory(BanqueEntity banqueEntity) {
    return new Banque(UUID.randomUUID());
  }
}
