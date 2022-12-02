# mumbling-in-layered-architecture
Un projet pour mettre en place ma première application avec une architecture en couches, suite au cours de Développement en couches avec Java SE.
fr.lsarribouette.mumblinginlayeredarchitecture
L'objectif est d'alimenter les exemples de la partie III de mon projet d'hébergement de mes notes de POO avec Java ([disponible ici](https://github.com/LSarribouette/notes-poo-java/)), en partant d'une base de données PostgreSQL.

> Technologies : JavaSE-17, SQL, IntelliJ, PostgreSQL 15.1

---

Mise en place de l'environnement :

  - téléchargement et installation de PostgreSQL 15.1 et pgAdmin 4 v6.15
  - téléchargement et installation de IntelliJ IDEA 2022.2.4 Ultimate Edition
  - ajout du pilote JDBC postgreSQL 42.5.1 :
    - téléchargement du pilote : `postgresql-42.5.1.jar`
    - ajout aux librairies externes du projet : 
      - clique-droit sur le projet > *Open Module Settings*
      - *Libraries* > "+" > Java > choix du pilote > OK
 
---

Base de données :

  - création d'une base de données "gestion_cours"
  - création d'une table "liste_cours" avec des colonnes :
    - "numero" *smallint* : le numéro du cours (dans l'ordre chronologique)
    - "abrev" *varchar* : le nom abrégé du cours
    - "libelle" *varchar* : le nom complet du cours
    - "avec_livre" *boolean* :  *true* si le cours est accompagné d'un livre-support, *false* s'il ne l'est pas
  - ajout des premiers cours