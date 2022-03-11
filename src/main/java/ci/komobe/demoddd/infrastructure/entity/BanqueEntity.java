package ci.komobe.demoddd.infrastructure.entity;

import java.util.Set;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Moro KONÉ 2021-12-04
 */
@Getter
@Setter
@Entity
@Table(name = "banques")
public class BanqueEntity {

  @Id
  private UUID id;
  private String nom;
  @OneToMany(mappedBy = "banque")
  private Set<EmployeEntity> employes;
}
