package ci.komobe.demoddd.core.application.casutilisation;

import ci.komobe.demoddd.core.application.UseCase;
import ci.komobe.demoddd.core.application.port.EmployeRepository;
import ci.komobe.demoddd.core.domain.entite.Banque;
import ci.komobe.demoddd.core.domain.entite.Employe;
import ci.komobe.demoddd.core.domain.exception.BanqueException;
import ci.komobe.demoddd.core.application.commande.CreerEmployeCommande;
import ci.komobe.demoddd.core.application.port.BanqueRepository;
import java.util.UUID;

/**
 * @author Moro KONÉ 2021-12-04
 */
public class CreerEmploye implements UseCase<CreerEmployeCommande> {

  private final BanqueRepository banqueRepository;
  private final EmployeRepository employeRepository;

  public CreerEmploye(BanqueRepository banqueRepository, EmployeRepository employeRepository) {
    this.banqueRepository = banqueRepository;
    this.employeRepository = employeRepository;
  }

  @Override
  public void perfom(CreerEmployeCommande commande) {
    UUID banqueId = commande.banqueId();
    Banque banque = this.banqueRepository.obtenirParId(banqueId)
        .orElseThrow(() -> new BanqueException("Banque non trouvée"));

    var employe = new Employe();
    employe.setNom(commande.nom());
    employe.setPrenom(commande.prenom());
    employe.setType(commande.typeEmploye());
    employe.setGenre(commande.genre());
    banque.nouveauEmploye(employe);
    employeRepository.enregistrer(employe);
  }
}
