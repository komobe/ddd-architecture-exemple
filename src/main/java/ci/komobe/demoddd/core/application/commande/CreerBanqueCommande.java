package ci.komobe.demoddd.core.application.commande;

import ci.komobe.demoddd.core.application.Commande;

/**
 * @author Moro KONÉ 2021-12-04
 */
public record CreerBanqueCommande(
    String nom
) implements Commande {

}
