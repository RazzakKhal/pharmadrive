-- Insertion de trois pharmacies à Montpellier
INSERT INTO PHARMACIE (adress_pharmacie, nom_pharmacie, numero, picture) VALUES
('12 Rue de la Loge, 34000 Montpellier', 'Pharmacie de la Comédie', '0467123456', 'http://localhost:3001/upload/pharmacie_picture_1.png'),
('5 Boulevard du Jeu de Paume, 34000 Montpellier', 'Pharmacie du Jeu de Paume', '0467234567', 'http://localhost:3001/upload/pharmacie_picture_1.png'),
('25 Rue Foch, 34000 Montpellier', 'Pharmacie Foch', '0467345678', 'http://localhost:3001/upload/pharmacie_picture_1.png');


-- Insertion de trois utilisateurs avec le rôle "pharmatist" et liaison avec les pharmacies créées
INSERT INTO USERS (name, firstname, role, email, password, pharmacie_id) VALUES
('pharmacie1', 'pharmacie1', 'pharmacist', 'pharmacie1@gmail.com', '$2a$10$e2rFL8yYXTxXp1H0GRjIQOTsH.gQnYR/NDbtYhcHx9nVsfZDrUjHa', 1),
('pharmacie2', 'pharmacie2', 'pharmacist', 'pharmacie2@gmail.com', '$2a$10$8D/A9D/73t5BAK9ooo1pEeuqvyEABhiGJf74auqKuwtUMPac9aD3O', 2),
('pharmacie3', 'pharmacie3', 'pharmacist', 'pharmacie3@gmail.com', '$2a$10$g3e1g.tcZ88MersTk7L5..AelosTGjtNe.HQ1LagkWbBDqgu21USe', 3);