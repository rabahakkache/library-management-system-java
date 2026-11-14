# Système de gestion de bibliothèque

Application en ligne de commande développée en Java en utilisant les principes de la programmation orientée objet (POO).

## Fonctionnalités

- Ajouter de nouveaux livres avec des identifiants uniques.
- Afficher la liste de tous les livres.
- Rechercher un livre par son identifiant.
- Supprimer un livre.
- Emprunter et retourner des livres.
- Empêcher l'ajout de livres avec des identifiants en double.
- Vérifier les saisies de l'utilisateur.
- Gérer la disponibilité des livres.

## Concepts utilisés

- Classes et objets.
- Encapsulation.
- Constructeurs et accesseurs (Getters).
- ArrayList et Collections Java.
- Méthodes et structures conditionnelles.
- Boucles et gestion des exceptions.

## Technologies utilisées

- Java.
- Java Collections Framework.
- Scanner.

## Organisation du projet

```text
library-management-system-java/
├── src/
│   ├── Book.java
│   ├── Library.java
│   └── Main.java
├── .gitignore
└── README.md
```

## Prérequis

- Java Development Kit (JDK).

## Compilation et exécution

Cloner le dépôt :

```bash
git clone https://github.com/rabahakkache/library-management-system-java.git
```

Compiler les fichiers sources :

```bash
mkdir out
javac -d out src/Book.java src/Library.java src/Main.java
```

Exécuter l'application :

```bash
java -cp out Main
```

## Stockage des données

Les livres sont actuellement stockés dans une collection `ArrayList` pendant l'exécution du programme. Les données ne sont pas conservées après la fermeture de l'application.

## Auteur

**Rabah Akkache**

GitHub : [rabahakkache](https://github.com/rabahakkache)
