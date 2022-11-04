package com.ecommerce.metier;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Wishlist {
    private int idw;
    private Integer idc;
    private String libelle;

    @Id
    @Column(name = "idw")
    public int getIdw() {
        return idw;
    }

    public void setIdw(int idw) {
        this.idw = idw;
    }

    @Basic
    @Column(name = "idc")
    public Integer getIdc() {
        return idc;
    }

    public void setIdc(Integer idc) {
        this.idc = idc;
    }

    @Basic
    @Column(name = "libelle")
    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wishlist wishlist = (Wishlist) o;
        return idw == wishlist.idw && Objects.equals(idc, wishlist.idc) && Objects.equals(libelle, wishlist.libelle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idw, idc, libelle);
    }
}
