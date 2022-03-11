package ci.komobe.demoddd.core.application.casutilisation;

import ci.komobe.demoddd.core.application.UseCase;
import ci.komobe.demoddd.core.domain.entite.Banque;
import ci.komobe.demoddd.core.application.commande.CreerBanqueCommande;
import ci.komobe.demoddd.core.application.port.BanqueRepository;

/**
 * @author Moro KONÉ 2021-12-04
 */
public class CreerBanque implements UseCase<CreerBanqueCommande> {

  private final BanqueRepository banqueRepository;

  public CreerBanque(BanqueRepository banqueRepository) {
    this.banqueRepository = banqueRepository;
  }

  @Override
  public void perfom(CreerBanqueCommande commande) {
    var banque = new Banque();
    banque.setNom(commande.nom());
    banqueRepository.creer(banque);
  }
}
