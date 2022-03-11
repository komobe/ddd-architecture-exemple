package ci.komobe.demoddd.infrastructure.entity;

import ci.komobe.demoddd.core.domain.objetvaleur.Genre;
import ci.komobe.demoddd.core.domain.objetvaleur.Genre.Type;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Moro KONÉ 2021-12-04
 */
@Getter
@Setter
@MappedSuperclass
public abstract sealed class PersonneEntity permits EmployeEntity, ClientEntity {

  private String nom;
  private String prenom;


  @Enumerated(value = EnumType.STRING)
  @Column(name = "genre")
  private Type genreType;

  @Setter(AccessLevel.NONE)
  @Transient
  private Genre genre;

  public void setGenre(Genre genre) {
    this.genre = genre;
    this.genreType = genre.valeur();
  }
}
