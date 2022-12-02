# Etapes pour la mise en place du projet java

Création du projet : `mumbling-in-layer-architecture`

Ajout des packages dans source : `fr.lsarribouette.mumblinginlayeredarchitecture`

## Couche IHM

Pour ce projet, elle servira principalement à ranger les classes de tests.

Ajout du package pour la couche IHM : `fr.lsarribouette.mumblinginlayeredarchitecture.ihm`

Ajout des classes `TestDBConnexion`

## Couche BO

Ajout du package pour la couche BO : `fr.lsarribouette.mumblinginlayeredarchitecture.bo`

Ajout de la classe 

## Couche DAL

Ajout du package pour la couche DAL : `fr.lsarribouette.mumblinginlayeredarchitecture.dal`

**Externalisation de la chaine de connexion**  

Création d'un fichier `connexion.properties` qui stocke les informations de connexion (url, user, pwd) 

Ajout de la classe `Settings` : 

  - attribut de classe `proprietes`
  - bloc anonyme qui récupère les informations de connexion : instancie `proprietes`, charge le fichier et traite une IOException
  - méthode de classe `getPropriete()` qui permet de retourner une information de connexion

> Je traite les exceptions IO car c'est bien au développeur de gérer ces erreurs.

Ajout de la classe DBConnexion :

  - méthode de classe `seConnecter()` qui crée la connexion avec la base de données : récupère les trois informations de connexion, instancie la connexion et la retourne, propage une SQLException
  - méthode de classe `seDeconnecter()` qui arrête la connexion avec la base de données : vérifie si la connexion est null, la ferme si besoin et propage une SQLException
  - *je teste dans ihm*

> Je propage les exceptions SQL car c'est à l'administrateur de la base de données de gérer ces erreurs.

**Instructions SQL**

1. Requêtes simples



2. Requêtes précompilées

3. Procédures stockées