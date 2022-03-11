package ci.komobe.demoddd.core.application;

/**
 * @author Moro KONÉ 2021-12-04
 */
public interface UseCase<T> {

  void perfom(T commande);
}
