/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author OUMAIMA
 */
@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String marque;
    private String reference ;
    @Temporal(TemporalType.DATE)
    private Date dateDachat;
    private Double prix;
    private String designation;

    public Produit() {
    }

    public Produit(int id, Date dateDachat , String marque, String reference, double prix, String designation) {
        this.id = id;
        this.marque = marque;
        this.reference = reference;
        this.dateDachat = dateDachat;
        this.prix = prix;
        this.designation = designation;
    }

    public Produit(Date dateDachat,String marque, String reference, double prix, String designation) {
        this.dateDachat = dateDachat;
        this.marque = marque;
        this.reference = reference;
        
        this.prix = prix;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Produit{" + "id=" + id + ", marque=" + marque + ", reference=" + reference + ", dateDachat=" + dateDachat + ", prix=" + prix + ", designation=" + designation + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Date getDateDachat() {
        return dateDachat;
    }

    public void setDateDachat(Date dateDachat) {
        this.dateDachat = dateDachat;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    
    
    
}
