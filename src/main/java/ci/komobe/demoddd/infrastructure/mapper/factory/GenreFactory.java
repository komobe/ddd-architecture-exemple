package ci.komobe.demoddd.infrastructure.mapper.factory;

import ci.komobe.demoddd.core.domain.objetvaleur.Genre;
import ci.komobe.demoddd.core.domain.objetvaleur.Genre.Type;
import org.mapstruct.ObjectFactory;

/**
 * @author Moro KONÉ 2021-12-04
 */
public class GenreFactory {

  @ObjectFactory
  public Type genreToGenreType(Genre genre) {
    return genre.valeur();
  }

  @ObjectFactory
  public Genre genreToGenreType(Genre.Type genreType) {
    return new Genre(genreType);
  }
}
