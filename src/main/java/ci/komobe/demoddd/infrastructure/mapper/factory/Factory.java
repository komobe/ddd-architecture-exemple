package ci.komobe.demoddd.infrastructure.mapper.factory;

/**
 * @author Moro KONÉ 2021-12-04
 */
public interface Factory<S, T> {

  T factory(S source);
}
