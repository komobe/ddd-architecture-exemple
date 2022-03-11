package ci.komobe.demoddd.infrastructure.mapper;

import ci.komobe.demoddd.core.domain.entite.Banque;
import ci.komobe.demoddd.infrastructure.entity.BanqueEntity;
import ci.komobe.demoddd.infrastructure.mapper.factory.BanqueFactory;
import ci.komobe.demoddd.infrastructure.mapper.factory.GenreFactory;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author Moro KONÉ 2021-12-04
 */
@Mapper(componentModel = "spring", uses = {BanqueFactory.class, GenreFactory.class})
public interface BanqueMapper {
  @Mapping(target = "employes", ignore = true)
  BanqueEntity toEntity(Banque employe);

  @Mapping(target = "employes", ignore = true)
  Banque toDomain(BanqueEntity employeEntity);
}
