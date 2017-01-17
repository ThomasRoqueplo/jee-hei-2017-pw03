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
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nom;
    private String prenom;
    private List<Commande> commandes;

    public Client() {

    }

    public Client(String nom, String prenom) {
        this.prenom = prenom;
        this.nom = nom;
    }
}
