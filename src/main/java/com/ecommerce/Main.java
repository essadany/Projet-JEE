package com.ecommerce;

import com.ecommerce.dao.HibernateUtil;
import com.ecommerce.metier.Produit;

import javax.persistence.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
           /* Produit p = new Produit();
            p.setIdP(6);
            p.setLibelle("new test");
            p.setFraisExpedition(7);*/
            HibernateUtil.beginTransaction();
        EntityManager em = HibernateUtil.getEntityManager();
        //em.persist(p);
        Query q = em.createQuery("select p from Produit p",Produit.class);
        List<Produit> l = q.getResultList();
        for(Produit pr : l){
            System.out.println(pr);
        }
        HibernateUtil.commitTransaction(em);
    }
}