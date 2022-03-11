package ci.komobe.demoddd.core.application.casutilisation;

import ci.komobe.demoddd.core.application.UseCase;
import ci.komobe.demoddd.core.application.commande.CreerClientCommande;
import ci.komobe.demoddd.core.application.port.EmployeRepository;
import ci.komobe.demoddd.core.domain.entite.Client;
import ci.komobe.demoddd.core.domain.entite.Employe;
import ci.komobe.demoddd.core.domain.exception.ClientException;
import ci.komobe.demoddd.core.application.port.ClientRepository;
import java.util.UUID;

/**
 * @author Moro KONÉ 2021-12-04
 */
public class CreerClient implements UseCase<CreerClientCommande> {

  private final EmployeRepository employeRepository;
  private final ClientRepository clientRepository;

  public CreerClient(EmployeRepository employeRepository, ClientRepository clientRepository) {
    this.employeRepository = employeRepository;
    this.clientRepository = clientRepository;
  }


  @Override
  public void perfom(CreerClientCommande commande) {
    UUID employeId = commande.employeId();
    Employe employe = employeRepository.obtenirParId(employeId)
        .orElseThrow(() -> new ClientException("Client non trouvé !"));

    var client = new Client();
    client.setNom(commande.nom());
    client.setPrenom(commande.prenom());
    client.setGenre(commande.genre());
    employe.creerClient(client);

    clientRepository.creer(client);
  }
}
