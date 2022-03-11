package ci.komobe.demoddd.infrastructure.repository.jpa;

import ci.komobe.demoddd.infrastructure.entity.EmployeEntity;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Moro KONÉ 2021-12-04
 */
public interface BanqueRepositoryJpa extends JpaRepository<EmployeEntity, UUID> {

}
