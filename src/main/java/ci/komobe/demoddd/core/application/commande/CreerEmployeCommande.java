package ci.komobe.demoddd.core.application.commande;

import ci.komobe.demoddd.core.application.Commande;
import ci.komobe.demoddd.core.domain.objetvaleur.Genre;
import ci.komobe.demoddd.core.domain.objetvaleur.TypeEmploye;
import java.util.UUID;

/**
 * @author Moro KONÉ 2021-12-04
 */
public record CreerEmployeCommande(
    String nom,
    String prenom,
    Genre genre,
    UUID banqueId,
    TypeEmploye typeEmploye
) implements Commande {

}
