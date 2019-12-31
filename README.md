# utilitaire perso pour eviter le copier / coller dans chaque projet

Cette utilitaire est une ébauche mais je n'ai pas de temps pour le moment...

DateConverter : Conversion de date (en particulier pour la library sql) en une seule commande
ExceptionConverter : En particulier pour écrire le stack trace dans une log avec des sauts de ligne, en une seule commande
TextConverter : Conversion en Camel case, et style slug (url) en une seule commande.

DateValidator : Controle d'une date texte en une commande


#### Compilation avec maven

Pre-requis : java8 + maven
Remarque : commande linux / mac (adapter la syntaxe pour windows)

Dans un repertoire $Workspace, cloner le repository, lancer la commande de build puis la commande d'integration au repository maven local, avec les commandes suivantes :

	$ cd $Workspace
	$ git clone https://github.com/hervep530/ocherve-util-library.git
	$ cd ocherve-util-library
	$ mvn install


#### Utilisation de la library dans un projet

Dans le repertoire du projet, lancer la commande d'integration au repository maven local :

	$ mvn install:install-file -Dfile=target/ocherve-util-library-0.0.1.jar -DgroupId=com.ocherve -DartifactId=ocherve-util-library -Dversion=0.0.1 -Dpackaging=jar

Dans le pom.xml, ajouter les lignes suivantes :
		
		<!-- Repository Local com.ocherve.ocherve-util-library -->
		<dependency>
			<groupId>com.ocherve</groupId>
			<artifactId>ocherve-util-library</artifactId>
			<version>0.0.1</version>
		</dependency>
 
