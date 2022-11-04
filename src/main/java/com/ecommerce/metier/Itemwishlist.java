package com.ecommerce.metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.util.Objects;

@Entity
@IdClass(ItemwishlistPK.class)
public class Itemwishlist {
    private int idw;
    private int idp;

    @Id
    @Column(name = "idw")
    public int getIdw() {
        return idw;
    }

    public void setIdw(int idw) {
        this.idw = idw;
    }

    @Id
    @Column(name = "idp")
    public int getIdp() {
        return idp;
    }

    public void setIdp(int idp) {
        this.idp = idp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Itemwishlist that = (Itemwishlist) o;
        return idw == that.idw && idp == that.idp;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idw, idp);
    }
}
