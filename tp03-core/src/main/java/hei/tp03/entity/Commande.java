package hei.tp03.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

/**
 * Created by Thomas on 17/01/2017.
 */

@Entity
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private boolean validee;
    private Client client;
    private List<Produit> produits;

    public Commande(Client client) {
        this.client = client;
    }

    public Commande() {
    }
}
