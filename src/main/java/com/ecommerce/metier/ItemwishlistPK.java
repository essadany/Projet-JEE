package com.ecommerce.metier;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ItemwishlistPK implements Serializable {
    private int idw;
    private int idp;

    @Column(name = "idw")
    @Id
    public int getIdw() {
        return idw;
    }

    public void setIdw(int idw) {
        this.idw = idw;
    }

    @Column(name = "idp")
    @Id
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
        ItemwishlistPK that = (ItemwishlistPK) o;
        return idw == that.idw && idp == that.idp;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idw, idp);
    }
}
