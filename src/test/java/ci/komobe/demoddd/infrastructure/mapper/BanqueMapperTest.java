package ci.komobe.demoddd.infrastructure.mapper;

import ci.komobe.demoddd.core.domain.entite.Banque;
import ci.komobe.demoddd.core.domain.entite.Employe;
import ci.komobe.demoddd.core.domain.objetvaleur.Genre;
import ci.komobe.demoddd.core.domain.objetvaleur.Genre.Type;
import ci.komobe.demoddd.core.domain.objetvaleur.TypeEmploye;
import ci.komobe.demoddd.infrastructure.entity.BanqueEntity;
import ci.komobe.demoddd.infrastructure.mapper.factory.BanqueFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @author Moro KONÉ 2022-03-11
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {BanqueMapperImpl.class, EmployeMapperImpl.class,
    BanqueFactory.class})
class BanqueMapperTest {

  @Autowired
  BanqueMapper banqueMapper;

  @Test
  void toEntityTestMethod() {
    //Given
    var banque = new Banque();
    banque.setNom("Standard");
    for (int i = 1; i <= 2_000_000; i++) {
      Employe employe = new Employe();
      employe.setType(TypeEmploye.AUTRES);
      employe.setGenre(new Genre(Type.HOMME));
      employe.setNom("employé N°" + i);
      banque.nouveauEmploye(employe);
    }

    // When
    BanqueEntity banqueEntity = banqueMapper.toEntity(banque, new CycleAvoidingMappingContext());
    // Then
    Assertions.assertNotNull(banqueEntity);
  }
}
