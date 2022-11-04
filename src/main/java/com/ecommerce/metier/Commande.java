package com.ecommerce.metier;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Commande {
    private int idcmd;
    private Integer idc;
    private Date datecmd;
    private String methodePay;
    private String etat;
    private Integer ida;

    @Id
    @Column(name = "idcmd")
    public int getIdcmd() {
        return idcmd;
    }

    public void setIdcmd(int idcmd) {
        this.idcmd = idcmd;
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
    @Column(name = "datecmd")
    public Date getDatecmd() {
        return datecmd;
    }

    public void setDatecmd(Date datecmd) {
        this.datecmd = datecmd;
    }

    @Basic
    @Column(name = "methode_pay")
    public String getMethodePay() {
        return methodePay;
    }

    public void setMethodePay(String methodePay) {
        this.methodePay = methodePay;
    }

    @Basic
    @Column(name = "etat")
    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    @Basic
    @Column(name = "ida")
    public Integer getIda() {
        return ida;
    }

    public void setIda(Integer ida) {
        this.ida = ida;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Commande commande = (Commande) o;
        return idcmd == commande.idcmd && Objects.equals(idc, commande.idc) && Objects.equals(datecmd, commande.datecmd) && Objects.equals(methodePay, commande.methodePay) && Objects.equals(etat, commande.etat) && Objects.equals(ida, commande.ida);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idcmd, idc, datecmd, methodePay, etat, ida);
    }
}
