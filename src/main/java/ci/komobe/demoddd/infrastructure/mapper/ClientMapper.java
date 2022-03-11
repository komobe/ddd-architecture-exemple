package ci.komobe.demoddd.infrastructure.mapper;

import ci.komobe.demoddd.core.domain.entite.Client;
import ci.komobe.demoddd.infrastructure.entity.ClientEntity;
import org.mapstruct.Context;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ObjectFactory;

/**
 * @author Moro KONÉ 2021-12-04
 */
@Mapper(componentModel = "spring", uses = {EmployeMapper.class})
public interface ClientMapper {

  @ObjectFactory
  default Client factory(ClientEntity clientEntity) {
    return new Client(clientEntity.getId());
  }

  @Mapping(target = "genreType", ignore = true)
  ClientEntity toEntity(Client client, @Context CycleAvoidingMappingContext context);

  @InheritInverseConfiguration
  Client toDomain(ClientEntity clientEntity, @Context CycleAvoidingMappingContext context);
}
