# Pharmadrive - Backend

Le backend de **Pharmadrive** est une API REST développée avec **Spring Boot 3.3.4**. Elle gère l'authentification des utilisateurs, les commandes de médicaments, l'ajout d'ordonnances, la gestion des pharmacies et des profils utilisateurs.

## Fonctionnalités

- **Inscription et Connexion** : Gérer les utilisateurs avec authentification sécurisée via JWT.
- **Gestion des pharmacies** : Récupération de la liste des pharmacies et possibilité de les sélectionner pour une commande.
- **Ajout d'une ordonnance** : Enregistrer et gérer les ordonnances des utilisateurs.
- **Gestion des commandes** : Créer, modifier et consulter les commandes de médicaments.
- **Profil utilisateur** : Gérer et consulter les informations personnelles des utilisateurs.

## Technologies

- **Java 17**
- **Spring Boot 3.3.4** : Framework backend.
- **Spring Security** : Sécurisation des API avec JWT.
- **Spring Data JPA** : Gestion des bases de données relationnelles.
- **MySQL** : Base de données utilisée (ou tout autre SGBD compatible avec Spring Data JPA).

## Prérequis

- **Java 17** ou supérieur.
- **Maven** : Outil de gestion de dépendances.
- **MySQL** ou autre SGBD compatible avec Spring Data JPA.

## Instructions d'installation

1. **Cloner le dépôt :**
   ```bash
   git clone https://github.com/votre-repo/pharmadrive-backend.git
   cd pharmadrive-backend
## Instuction lancement
 démarrer mySql sur le port 3306
 modifier si nécessaire les informations utilisateur dans application.properties
 démarrer l'application sur Intellij via le bouton play en se positionnant sur la classe principale
 lancer le script sql (data.sql) via mysql en se placant dans la base de donnée

 
