package hei.tp03.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Thomas on 17/01/2017.
 */

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="nom")
    private String nom;

    @Column(name="prenom")
    private String prenom;

    @OneToMany(cascade={CascadeType.ALL}, mappedBy="client")
    private List<Commande> commandes;

    public Client() {

    }

    public Client(String nom, String prenom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }

    public String getNom() {
        return nom;
    }
}
