package ci.komobe.demoddd.infrastructure.entity;

import ci.komobe.demoddd.core.domain.objetvaleur.TypeEmploye;
import java.util.Set;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "employes")
public final class EmployeEntity extends PersonneEntity {

  @Id
  private UUID id;
  @ManyToOne(optional = false)
  @JoinColumn(name = "banque_id", nullable = false)
  private BanqueEntity banque;
  @Enumerated(value = EnumType.STRING)
  private TypeEmploye type;
  @OneToMany(mappedBy = "employe")
  private Set<ClientEntity> clients;
}
