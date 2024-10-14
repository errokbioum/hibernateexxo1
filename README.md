# hibernateexo1

# Projet :gestion des produits

## Objectif du TP
Le but de ce rapport est de suivre les produits   au sein d'une entreprise Ces données sont collectées et stockées dans un système de gestion de base de données (SGBD) afin de faciliter le suivi et l'analyse de la progression du projet, ainsi que l’implémentation de Framework de persistance hibernate afin d’établir le mappage .
## Structure du projet
Le projet est organisé de la manière suivante :

![pp](https://github.com/user-attachments/assets/8225979f-a5cf-441a-8b72-81eab0ffdfa0)

  - `src/` : Contient le code source Java : 
     - `projet ` : contient les pachage utulise
     - `Test` : le test de l'application
     - ` util` : contient  une class connexion qui va faire liee la connexion avec 
la base de donnee. 
     - `dao ` : contient  une interface générique qui contrôle le comportement du 
service de chaque entité. 
     - ` entité `: contient les entités utulise dans le projet. 
     - ` service `: contient les services que cette application offre, les classes 
présente dans ce package son implémente d’interface dao. 
     - `Test` : ou on va effectuer les test. 
![projets](https://github.com/user-attachments/assets/2e81c36f-ac7d-4408-a9a3-b8ea9fed3d05)

## Outil utulise :
hibernate.
MySql.
java .
neatbeans.
## Méthodes utilisées

  - ` creat (T o) ` :  crée des enregistrements dans la base de donnée. 
  
  - `  delete (T o) `: supprimer des enregistrements dans la base de donne.

  - `update (T o) `:  modifié un enregistrement. 
    
  - ` T findById (int o) `: trouver un  enregistrement à partir de son id. 

   - `getAll () `:récupérer toute les enregistrements

## Vue relationnel 
![projet2](https://github.com/user-attachments/assets/0628fb63-fc9c-473f-b6e3-4bf9b5cb42a5)



## Test
Pour tester le projet :
1. Assurez-vous que votre serveur MySQL ou Oracle est en cours d'exécution.
3. Compilez et exécutez `Main.java` pour insérer et récupérer des données.





[explication.webm](https://github.com/user-attachments/assets/f599c0a1-2b7e-4f6d-b4e4-c76884cf450e)



## Auteurs

uête SQL suivante :
 

 

 
