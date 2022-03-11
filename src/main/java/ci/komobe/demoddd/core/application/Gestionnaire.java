package ci.komobe.demoddd.core.application;

/**
 * @author Moro KONÉ 2021-12-04
 */
public class Gestionnaire<T extends Commande> {

  public void execute(UseCase<T> useCase, T commande) {
    useCase.perfom(commande);
  }
}
