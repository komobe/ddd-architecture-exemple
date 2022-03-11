package ci.komobe.demoddd.infrastructure.mapper;

import ci.komobe.demoddd.core.domain.entite.Client;
import ci.komobe.demoddd.infrastructure.entity.ClientEntity;
import ci.komobe.demoddd.infrastructure.mapper.factory.ClientFactory;
import org.mapstruct.Context;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author Moro KONÉ 2021-12-04
 */
@Mapper(componentModel = "spring", uses = {ClientFactory.class, EmployeMapper.class})
public interface ClientMapper {

  @Mapping(target = "genreType", ignore = true)
  ClientEntity toEntity(Client client, @Context CycleAvoidingMappingContext context);

  @InheritInverseConfiguration
  Client toDomain(ClientEntity clientEntity, @Context CycleAvoidingMappingContext context);
}
