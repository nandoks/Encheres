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
insert into CATEGORIES (libelle) values ('cycle');
insert into CATEGORIES (libelle) values ('electromenager');
insert into CATEGORIES (libelle) values ('jardin');
insert into CATEGORIES (libelle) values ('bricolage');
GO

--insertion encheres

USE [ENCHERES_DB]
GO

--insert articles_vendus
INSERT INTO [dbo].[ARTICLES_VENDUS]([nom_article],[description],[date_debut_encheres],[date_fin_encheres] ,[prix_initial],[prix_vente],[no_utilisateur],[no_categorie])
     VALUES
           ('Velo Bwtin','Velo Electrique','2021-02-15','2021-03-15',250
           ,300,1,1)

INSERT INTO [dbo].[ARTICLES_VENDUS]([nom_article],[description],[date_debut_encheres],[date_fin_encheres] ,[prix_initial],[prix_vente],[no_utilisateur],[no_categorie])
     VALUES
           ('Scie sauteuse','Scie sauteuse Dewalt 500w','2021-01-15','2021-01-20',100
           ,200,2,3)

-- insert encheres
USE [ENCHERES_DB]
GO

INSERT INTO [dbo].[ENCHERES]([no_utilisateur],[no_article],[date_enchere],[montant_enchere])
     VALUES(1,1,'2021-7-4 04:13:54',200)
	
INSERT INTO [dbo].[ENCHERES]([no_utilisateur],[no_article],[date_enchere],[montant_enchere])
     VALUES(3,2,'2021-7-4 04:13:54',200)

INSERT INTO [dbo].[ENCHERES]([no_utilisateur],[no_article],[date_enchere],[montant_enchere])
     VALUES(2,2,'2021-7-4 04:13:54',200)


-- insert retraits
INSERT INTO [dbo].[RETRAITS]([no_article],[rue],[code_postal],[ville])
	VALUES(1,'une adresse','22400','lamballe');
INSERT INTO [dbo].[RETRAITS]([no_article],[rue],[code_postal],[ville])
	VALUES(2,'autre adresse','4400','nantes');
