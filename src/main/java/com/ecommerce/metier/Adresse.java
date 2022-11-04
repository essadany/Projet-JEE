package com.ecommerce.metier;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Adresse {
    private int ida;
    private String adresse;
    private String ville;
    private Integer codepostale;
    private String pays;
    private Integer idc;

    @Id
    @Column(name = "ida")
    public int getIda() {
        return ida;
    }

    public void setIda(int ida) {
        this.ida = ida;
    }

    @Basic
    @Column(name = "adresse")
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Basic
    @Column(name = "ville")
    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Basic
    @Column(name = "codepostale")
    public Integer getCodepostale() {
        return codepostale;
    }

    public void setCodepostale(Integer codepostale) {
        this.codepostale = codepostale;
    }

    @Basic
    @Column(name = "pays")
    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    @Basic
    @Column(name = "idc")
    public Integer getIdc() {
        return idc;
    }

    public void setIdc(Integer idc) {
        this.idc = idc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adresse adresse1 = (Adresse) o;
        return ida == adresse1.ida && Objects.equals(adresse, adresse1.adresse) && Objects.equals(ville, adresse1.ville) && Objects.equals(codepostale, adresse1.codepostale) && Objects.equals(pays, adresse1.pays) && Objects.equals(idc, adresse1.idc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ida, adresse, ville, codepostale, pays, idc);
    }
}
