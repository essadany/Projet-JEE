package com.ecommerce.metier;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Image {
    private int idimg;
    private String url;
    private Integer isprincipal;
    private Integer idp;

    @Id
    @Column(name = "idimg")
    public int getIdimg() {
        return idimg;
    }

    public void setIdimg(int idimg) {
        this.idimg = idimg;
    }

    @Basic
    @Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "isprincipal")
    public Integer getIsprincipal() {
        return isprincipal;
    }

    public void setIsprincipal(Integer isprincipal) {
        this.isprincipal = isprincipal;
    }

    @Basic
    @Column(name = "idp")
    public Integer getIdp() {
        return idp;
    }

    public void setIdp(Integer idp) {
        this.idp = idp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Image image = (Image) o;
        return idimg == image.idimg && Objects.equals(url, image.url) && Objects.equals(isprincipal, image.isprincipal) && Objects.equals(idp, image.idp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idimg, url, isprincipal, idp);
    }
}
