USE [ENCHERES_DB]

-- insertion d'utilisateurs
INSERT INTO [dbo].[UTILISATEURS] ([pseudo], [nom] ,[prenom],[email],[telephone],[rue],[code_postal]
           ,[ville],[mot_de_passe],[credit],[administrateur])
     VALUES('nandoks','aragao','fernando','fernandooksman@gmail.com','123456789','4 marchal foucault','22400','lamballe','123456',100,0)
INSERT INTO [dbo].[UTILISATEURS] ([pseudo], [nom] ,[prenom],[email],[telephone],[rue],[code_postal]
           ,[ville],[mot_de_passe],[credit],[administrateur])
     VALUES('maddy','hache','maddy','maddyhache@gmail.com','123456789','3 rue du nerval ','44000','Nantes','654321',100,0)

INSERT INTO [dbo].[UTILISATEURS] ([pseudo], [nom] ,[prenom],[email],[telephone],[rue],[code_postal]
           ,[ville],[mot_de_passe],[credit],[administrateur])
     VALUES('guillaume','beylouneh','guillaume','guillaume@gmail.com','456456456','6 av du colibri','35000','Rennes','112233',100,0)

INSERT INTO [dbo].[UTILISATEURS] ([pseudo], [nom] ,[prenom],[email],[telephone],[rue],[code_postal]
           ,[ville],[mot_de_passe],[credit],[administrateur])
     VALUES('thirteen','victor','laetitia','victorlaetitia@gmail.com','9988776655','13 lautre cote','95000','Aucune-Idee','552211',100,0)
GO

--insertion categories
insert into CATEGORIES (libelle) values ('Informatique');
insert into CATEGORIES (libelle) values ('Ameublement');
insert into CATEGORIES (libelle) values ('V�tements');
insert into CATEGORIES (libelle) values ('Sport&Loisir');
GO

--insertion encheres

USE [ENCHERES_DB]
GO

--insert articles_vendus
INSERT INTO [dbo].[ARTICLES_VENDUS]([nom_article],[description],[date_debut_encheres],[date_fin_encheres] ,[prix_initial],[prix_vente],[no_utilisateur],[no_categorie])
     VALUES
           ('Ordinateur portable','Lenovo 15 pouces 8go m�moire i3-8900k','2021-02-15','2021-03-15',250,250,1,13)

INSERT INTO [dbo].[ARTICLES_VENDUS]([nom_article],[description],[date_debut_encheres],[date_fin_encheres] ,[prix_initial],[prix_vente],[no_utilisateur],[no_categorie])
     VALUES
           ('Commode','Commode en pin 1 tirroir','2021-01-15','2021-01-20',100,100,2,14)

INSERT INTO [dbo].[ARTICLES_VENDUS]([nom_article],[description],[date_debut_encheres],[date_fin_encheres] ,[prix_initial],[prix_vente],[no_utilisateur],[no_categorie])
     VALUES ('Kayak','bleu et vert','2021-01-15','2021-01-20',100,100,3,16)


INSERT INTO [dbo].[ARTICLES_VENDUS]([nom_article],[description],[date_debut_encheres],[date_fin_encheres] ,[prix_initial],[prix_vente],[no_utilisateur],[no_categorie])
     VALUES ('Souris ordinateur','Sans fil et sans usure','2021-01-19','2021-03-04',5,25,4,13)

INSERT INTO [dbo].[ARTICLES_VENDUS]([nom_article],[description],[date_debut_encheres],[date_fin_encheres] ,[prix_initial],[prix_vente],[no_utilisateur],[no_categorie])
VALUES ('Table basse','plateau en verre et strucutre en ch�ne','2021-01-15','2021-03-05',80,120,4,14)

INSERT INTO [dbo].[ARTICLES_VENDUS]([nom_article],[description],[date_debut_encheres],[date_fin_encheres] ,[prix_initial],[prix_vente],[no_utilisateur],[no_categorie])
VALUES ('Table � manger','en plexis pour effet r�tro','2021-03-10','2021-03-25',200,320,3,14)

INSERT INTO [dbo].[ARTICLES_VENDUS]([nom_article],[description],[date_debut_encheres],[date_fin_encheres] ,[prix_initial],[prix_vente],[no_utilisateur],[no_categorie])
     VALUES ('Magnifique redingote','Tr�s peu port�e ou peut-�tre dans les ann�es 20','2021-01-15','2021-02-28',20,100,3,15)

-- insert encheres
INSERT INTO [dbo].[ENCHERES]([no_utilisateur],[no_article],[date_enchere],[montant_enchere])
     VALUES(1,1,'2021-7-4 04:13:54',300)


-- insert retraits
INSERT INTO [dbo].[RETRAITS]([no_article],[rue],[code_postal],[ville])
	VALUES(1,'une adresse','22400','lamballe');
INSERT INTO [dbo].[RETRAITS]([no_article],[rue],[code_postal],[ville])
	VALUES(2,'autre adresse','4400','nantes');
