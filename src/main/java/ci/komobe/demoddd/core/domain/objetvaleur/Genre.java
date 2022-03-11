package ci.komobe.demoddd.core.domain.objetvaleur;

/**
 * @author Moro KONÉ 2021-12-04
 */
public record Genre(
    Type valeur
) {

  public enum Type {
    HOMME,
    FEMME
  }
}
