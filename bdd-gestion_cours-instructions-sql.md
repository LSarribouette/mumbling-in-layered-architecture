# Base de données :

Création d'une base de données "gestion_cours" :
```
CREATE DATABASE gestion_cours
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;

COMMENT ON DATABASE bla
    IS 'Base de données pour alimenter les exemples de la partie III de mon projet 
        d''hébergement de mes notes de POO avec Java';
```

Création d'une table "liste_cours" avec des colonnes :
```
CREATE TABLE public.liste_cours
(
numero smallint NOT NULL,
abrev character varying(30) NOT NULL,
libelle character varying(150) NOT NULL,
avec_livre boolean,
PRIMARY KEY (numero)
);

ALTER TABLE IF EXISTS public.liste_cours
OWNER to postgres;

COMMENT ON TABLE public.liste_cours
IS 'Table qui contient la liste des cours des deux cursus.';
```
Ajout des premiers cours :
```
INSERT INTO public.liste_cours(
	numero, abrev, libelle, avec_livre)
	VALUES (01, 'algo', 'Algorithmique', true);
INSERT INTO public.liste_cours(
	numero, abrev, libelle, avec_livre)
	VALUES (02, 'init java', 'Initiation à la programmation procédurale avec Java', true);
INSERT INTO public.liste_cours(
	numero, abrev, libelle, avec_livre)
	VALUES (03, 'HTML CSS', 'Le développement Web côté client – FrontEnd (HTML5, CSS)', null);
INSERT INTO public.liste_cours(
	numero, abrev, libelle, avec_livre)
	VALUES (04, 'SQL', 'Le langage de requête SQL avec SQL Server', null);
INSERT INTO public.liste_cours(
	numero, abrev, libelle, avec_livre)
	VALUES (05, 'PL-SQL', 'Les procédures stockées avec PL-SQL', null);
INSERT INTO public.liste_cours(
	numero, abrev, libelle, avec_livre)
	VALUES (06, 'POO', 'La Programmation Orientée Objet (POO) avec Java', true);
INSERT INTO public.liste_cours(
	numero, abrev, libelle, avec_livre)
	VALUES (07, 'dev en couches', 'Le développement en couches et la persistance des données avec Java SE', false);
INSERT INTO public.liste_cours(
	numero, abrev, libelle, avec_livre)
	VALUES (08, 'JEE', 'Le développement Web côté serveur – BackEnd avec Java Enterprise Edition', false);
```