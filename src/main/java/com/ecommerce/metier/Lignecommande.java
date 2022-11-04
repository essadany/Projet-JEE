package com.ecommerce.metier;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Lignecommande {
    private int idlc;
    private Integer idcmd;
    private Integer idp;
    private Integer qte;
    private Integer prixAchat;

    @Id
    @Column(name = "idlc")
    public int getIdlc() {
        return idlc;
    }

    public void setIdlc(int idlc) {
        this.idlc = idlc;
    }

    @Basic
    @Column(name = "idcmd")
    public Integer getIdcmd() {
        return idcmd;
    }

    public void setIdcmd(Integer idcmd) {
        this.idcmd = idcmd;
    }

    @Basic
    @Column(name = "idp")
    public Integer getIdp() {
        return idp;
    }

    public void setIdp(Integer idp) {
        this.idp = idp;
    }

    @Basic
    @Column(name = "qte")
    public Integer getQte() {
        return qte;
    }

    public void setQte(Integer qte) {
        this.qte = qte;
    }

    @Basic
    @Column(name = "prix_achat")
    public Integer getPrixAchat() {
        return prixAchat;
    }

    public void setPrixAchat(Integer prixAchat) {
        this.prixAchat = prixAchat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lignecommande that = (Lignecommande) o;
        return idlc == that.idlc && Objects.equals(idcmd, that.idcmd) && Objects.equals(idp, that.idp) && Objects.equals(qte, that.qte) && Objects.equals(prixAchat, that.prixAchat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idlc, idcmd, idp, qte, prixAchat);
    }
}
