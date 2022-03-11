package ci.komobe.demoddd.infrastructure.mapper;

import ci.komobe.demoddd.core.domain.entite.Employe;
import ci.komobe.demoddd.infrastructure.entity.EmployeEntity;
import org.mapstruct.Context;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ObjectFactory;

/**
 * @author Moro KONÉ 2021-12-04
 */
@Mapper(componentModel = "spring", uses = {BanqueMapper.class})
public interface EmployeMapper {

  @ObjectFactory
  default Employe factory(EmployeEntity employeEntity) {
    return new Employe(employeEntity.getId());
  }

  @Mapping(target = "genreType", ignore = true)
  EmployeEntity toEntity(Employe employe, @Context CycleAvoidingMappingContext context);

  @InheritInverseConfiguration
  Employe toDomain(EmployeEntity employeEntity, @Context CycleAvoidingMappingContext context);
}
