package com.ecommerce.metier;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Commentaire {
    private int idComm;
    private Integer idP;
    private Integer idcmd;
    private String commentaire;
    private Date datePub;

    @Id
    @Column(name = "idComm")
    public int getIdComm() {
        return idComm;
    }

    public void setIdComm(int idComm) {
        this.idComm = idComm;
    }

    @Basic
    @Column(name = "idP")
    public Integer getIdP() {
        return idP;
    }

    public void setIdP(Integer idP) {
        this.idP = idP;
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
    @Column(name = "commentaire")
    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
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
        Commentaire that = (Commentaire) o;
        return idComm == that.idComm && Objects.equals(idP, that.idP) && Objects.equals(idcmd, that.idcmd) && Objects.equals(commentaire, that.commentaire) && Objects.equals(datePub, that.datePub);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idComm, idP, idcmd, commentaire, datePub);
    }
}
