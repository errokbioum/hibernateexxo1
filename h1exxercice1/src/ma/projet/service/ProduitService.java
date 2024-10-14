/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.service;

import java.util.List;
import javax.persistence.Query;

import ma.projet.dao.Dao;
import ma.projet.entity.Produit;
import ma.projet.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;


/**
 *
 * @author OUMAIMA
 */
public class ProduitService implements Dao <Produit> {

    @Override
    public Boolean creat(Produit o) {
        Session session =null;
        try{
            session= HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(o);
      
            session.getTransaction().commit();
            return true;
                   
        }catch (HibernateException e) {
            session.getTransaction().rollback();
        }finally{
            session.close();
        }
        return false;
        
    }

    @Override
    public Boolean delete(Produit o) {
       Session session =null;
       try  {
           session=HibernateUtil.getSessionFactory().openSession();
           session.beginTransaction();
           session.delete(o);
           session.getTransaction().commit();
           return true;
       }catch (HibernateException e) {
            session.getTransaction().rollback();
        }finally{
            session.close();
        }
        return false;
    }

    @Override
    public Boolean update(Produit o) {
       Session session =null;
       try{
           session= HibernateUtil.getSessionFactory().openSession();
           session.beginTransaction();
           session.update(o);
           session.getTransaction().commit();
           return true;
           
       }catch (HibernateException e) {
            session.getTransaction().rollback();
        }finally{
            session.close();
        }
        return false;
    }

    @Override
    public List<Produit> getAll() {
         Session session =null;
    List<Produit> produits = null;
       try{ 
           session=HibernateUtil.getSessionFactory().openSession();
           session.beginTransaction();
           produits =session.createQuery("from Produit").list();
           session.getTransaction().commit();
           return produits;
       } catch (HibernateException ex) {
          
            session.getTransaction().rollback();
        }finally{
            session.close();
        }
        return produits;
        
    }

    @Override
    public Produit findById(int o) {
       Session session =null;
       Produit produit = null;
       try{ 
           session=HibernateUtil.getSessionFactory().openSession();
           session.beginTransaction();
           produit =(Produit)session.get(Produit.class,o);
           session.getTransaction().commit(); 
       } catch (HibernateException ex) {
            session.getTransaction().rollback();
        }finally{
            session.close();
        }
        return produit;
    }
    
}
