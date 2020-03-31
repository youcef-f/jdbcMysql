# JDBC mysql



## A)  Configuration du projet

### 1)  Cr�ation du r�pertoire lib et copie du jar file jdbc

Ici nous utilisons la version jar du driver  **mysql-connector-java-6.0.2.jar**

![Structure du projet java](doc/structure_projet_java.jpg)

### 2) Configuration du BuildPath du projet sous eclipse
![Structure du projet java](doc/buildpath.jpg)


## B) Configuration de Mysql 

Creation d'une base de donn�es **db_mvc_cat** et la creation d'une table **produit**

- Structure de la table **produit** avec **ID_PROD** qui est d�fini en auto-incr�ment
![Structure de la table produit](doc/structureTableProduit.jpg)

- �l�ments de la table **produit**
![Structure de la table produit](doc/ElementsProduit.jpg)

- Utilisation du compte root de mysql avec les droits de base.  Ici les appelles vers la base sont effectu�s en local � la base de donn�es.
![Utilisation du compte root mysql](doc/privilegeRootPardefautsuffit.jpg)


## C)  Run de l'application

R�sultat 

```bash
ctlgs  =  db_mvc_cat
ctlgs  =  feedback
ctlgs  =  information_schema
ctlgs  =  mysql
ctlgs  =  performance_schema
ctlgs  =  sys
ctlgs  =  tododb
p1
p2
```

