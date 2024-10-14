/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import javax.transaction.SystemException;
import ma.projet.entity.Produit;
import ma.projet.service.ProduitService;
import ma.projet.util.HibernateUtil;
import org.hibernate.Query;



import org.hibernate.Session;


/**
 *
 * @author OUMAIMA
 */
public class Exercice1Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        HibernateUtil.getSessionFactory();
        ProduitService pp=new ProduitService();
        Produit p1= new Produit(new Date(),"alimentation ","bimo",15,"xma");
         Produit p2= new Produit(new Date(),"Vestiment ","nike",200,"xmo");
         Produit p3= new Produit(new Date(),"chaussure","adiddas",10,"LSm");
         Produit p4= new Produit(new Date(),"tShirt ","Lcwaykiki",300,"sxm");
         Produit p5= new Produit(new Date(),"tjacket ","zara",500,"mix");
         pp.creat(p1);
         pp.creat(p2);
         pp.creat(p3);
         pp.creat(p4);
         pp.creat(p5);
         System.out.println("liste des produit est :");
          List<Produit> produits=pp.getAll();
        if (produits != null && !produits.isEmpty()) {
        for (Produit e : produits) {
            System.out.println( e ); 
        }
    } else {
        System.out.println("Aucun produit trouvé.");
    }
        //afficher les information sur le produit d'id 2
        System.out.println(" les informations sur le produit dans l'id 2 est :");
        Produit p = pp.findById(2);
        System.out.println(p);
        //supprimer le produit d'id 3 
        pp.delete(pp.findById(3));
        Produit es= new Produit(1, new Date(), "sportif", "leftis", 12345, "ma");
        pp.update(es);
        Produit s =pp.findById(1);
        System.out.println("les nouveau information du  dproduit de l'id 1 sont: "+  s);
        System.out.println(" les produits ayant le prix superieur a 100 sont : ");
        for (Produit e : produits ) {
            if (e.getPrix()>100){
                System.out.println( e );
            }
            }
           
                System.out.println("entre les deux dates (format: yyyy-MM-dd)  ");
                Scanner sc= new Scanner(System.in);
                String d1 = sc.nextLine();
                String d2=sc.nextLine();
                
              try {
                  Date debutDat = new SimpleDateFormat("yyyy-MM-dd").parse(d1);
                Date finDate  = new SimpleDateFormat("yyyy-MM-dd").parse(d2);
                Session session =null;
                session=HibernateUtil.getSessionFactory().openSession();
                session.beginTransaction();
                
               List <Produit> prod = session.createQuery( "FROM Produit p WHERE p.dateDachat BETWEEN :debutDat AND :finDate").setParameter("debutDat", debutDat).setParameter("finDate", finDate).list();
                                
                session.getTransaction().commit();
               for (Produit produit : prod) {
                   System.out.println(produit);
                   }
                 

                 }  catch(Exception ex) {
                     ex.printStackTrace(); 
                     } 
                    

              
                   
                }
                 
                     
                 }
                 
                       
                 
                 
             
        
        

        
        
    
    

