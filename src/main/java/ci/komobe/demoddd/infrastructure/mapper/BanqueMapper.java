package ci.komobe.demoddd.infrastructure.mapper;

import ci.komobe.demoddd.core.domain.entite.Banque;
import ci.komobe.demoddd.infrastructure.entity.BanqueEntity;
import ci.komobe.demoddd.infrastructure.mapper.factory.BanqueFactory;
import org.mapstruct.Context;
import org.mapstruct.Mapper;

/**
 * @author Moro KONÉ 2021-12-04
 */
@Mapper(componentModel = "spring", uses = {BanqueFactory.class, EmployeMapper.class})
public interface BanqueMapper {

  BanqueEntity toEntity(Banque banque, @Context CycleAvoidingMappingContext cycleAvoiding);

  Banque toDomain(BanqueEntity banqueEntity, @Context CycleAvoidingMappingContext context);
}
