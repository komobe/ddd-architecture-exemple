package ci.komobe.demoddd.infrastructure.mapper;

import ci.komobe.demoddd.core.domain.entite.Banque;
import ci.komobe.demoddd.infrastructure.entity.BanqueEntity;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.ObjectFactory;

/**
 * @author Moro KONÉ 2021-12-04
 */
@Mapper(componentModel = "spring", uses = {EmployeMapper.class})
public interface BanqueMapper {

  @ObjectFactory
  default Banque factory(BanqueEntity banqueEntity) {
    return new Banque(banqueEntity.getId());
  }

  BanqueEntity toEntity(Banque banque, @Context CycleAvoidingMappingContext cycleAvoiding);

  Banque toDomain(BanqueEntity banqueEntity, @Context CycleAvoidingMappingContext context);
}
