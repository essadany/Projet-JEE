package com.ecommerce.metier;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Produit {
    private int idP;
    private Integer idcat;
    private String libelle;
    private String marque;
    private Integer prix;
    private String description;
    private Integer fraisExpedition;
    private Integer disponibilite;
    private Integer qtestck;
    private Date datePub;


    @Id
    @Column(name = "idP")
    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    @Basic
    @Column(name = "idcat")
    public Integer getIdcat() {
        return idcat;
    }

    public void setIdcat(Integer idcat) {
        this.idcat = idcat;
    }

    @Basic
    @Column(name = "libelle")
    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Basic
    @Column(name = "Marque")
    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    @Basic
    @Column(name = "prix")
    public Integer getPrix() {
        return prix;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }

    @Basic
    @Column(name = "Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "fraisExpedition")
    public Integer getFraisExpedition() {
        return fraisExpedition;
    }

    public void setFraisExpedition(Integer fraisExpedition) {
        this.fraisExpedition = fraisExpedition;
    }

    @Basic
    @Column(name = "disponibilite")
    public Integer getDisponibilite() {
        return disponibilite;
    }

    public void setDisponibilite(Integer disponibilite) {
        this.disponibilite = disponibilite;
    }

    @Basic
    @Column(name = "qtestck")
    public Integer getQtestck() {
        return qtestck;
    }

    public void setQtestck(Integer qtestck) {
        this.qtestck = qtestck;
    }

    @Basic
    @Column(name = "date_pub")
    public Date getDatePub() {
        return datePub;
    }

    public void setDatePub(Date datePub) {
        this.datePub = datePub;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produit produit = (Produit) o;
        return idP == produit.idP && Objects.equals(idcat, produit.idcat) && Objects.equals(libelle, produit.libelle) && Objects.equals(marque, produit.marque) && Objects.equals(prix, produit.prix) && Objects.equals(description, produit.description) && Objects.equals(fraisExpedition, produit.fraisExpedition) && Objects.equals(disponibilite, produit.disponibilite) && Objects.equals(qtestck, produit.qtestck) && Objects.equals(datePub, produit.datePub);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idP, idcat, libelle, marque, prix, description, fraisExpedition, disponibilite, qtestck, datePub);
    }

    @Override
    public String toString() {
        return "Produit{" +
                "idP=" + idP +
                ", idcat=" + idcat +
                ", libelle='" + libelle + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", description='" + description + '\'' +
                ", fraisExpedition=" + fraisExpedition +
                ", disponibilite=" + disponibilite +
                ", qtestck=" + qtestck +
                ", datePub=" + datePub +
                '}';
    }
}
