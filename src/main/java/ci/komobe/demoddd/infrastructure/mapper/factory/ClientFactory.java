package ci.komobe.demoddd.infrastructure.mapper.factory;

import ci.komobe.demoddd.core.domain.entite.Client;
import ci.komobe.demoddd.infrastructure.entity.ClientEntity;
import java.util.UUID;
import org.mapstruct.ObjectFactory;

/**
 * @author Moro KONÉ 2021-12-04
 */
public class ClientFactory implements Factory<ClientEntity, Client> {

  @Override
  @ObjectFactory
  public Client factory(ClientEntity source) {
    return new Client(UUID.randomUUID());
  }
}
