package ci.komobe.demoddd.infrastructure.entity;

import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Moro KONÉ 2021-12-04
 */
@Getter
@Setter
@Entity
@Table(name = "clients")
public final class ClientEntity extends PersonneEntity {

  @Id
  private UUID id;
  @ManyToOne(optional = false)
  @JoinColumn(name = "employe_id", nullable = false)
  private EmployeEntity employe;
}
