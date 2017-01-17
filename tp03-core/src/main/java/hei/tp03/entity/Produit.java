package hei.tp03.entity;

import javax.persistence.*;

/**
 * Created by Thomas on 17/01/2017.
 */

@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="prenom")
    private String nom;

    @ManyToOne
    private Commande commande;

    public Produit(String nom, Commande commande) {
        this.nom = nom;
        this.commande = commande;
    }

    public Produit() {

    }
}
