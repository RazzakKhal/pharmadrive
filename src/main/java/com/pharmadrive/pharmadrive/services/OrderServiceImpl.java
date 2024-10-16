package com.pharmadrive.pharmadrive.services;

import com.pharmadrive.pharmadrive.dtos.fromView.AddPharmacyDto;
import com.pharmadrive.pharmadrive.dtos.fromView.ArticleChoosenDto;
import com.pharmadrive.pharmadrive.dtos.fromView.ArticleChoosenDtoList;
import com.pharmadrive.pharmadrive.dtos.toView.OrderDto;
import com.pharmadrive.pharmadrive.models.*;
import com.pharmadrive.pharmadrive.repositories.ArticleCommandeRepository;
import com.pharmadrive.pharmadrive.repositories.ArticleRepository;
import com.pharmadrive.pharmadrive.repositories.CommandeRepository;
import com.pharmadrive.pharmadrive.repositories.PharmacieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    CommandeRepository commandeRepository;

    @Autowired
    ArticleRepository articleRepository;

    @Autowired
    PharmacieRepository pharmacieRepository;

    @Autowired
    ArticleCommandeRepository articleCommandeRepository;

    @Override
    public OrderDto createAnOrder(ArticleChoosenDtoList articleChoosenDtoList, Authentication authentication) {

        // Récupération de l'utilisateur connecté
        User user = (User) authentication.getPrincipal();

        // Création de la commande
        Commande commande = new Commande();
        commande.setUser(user);

        // Sauvegarde de la commande
        Commande savedCommande = commandeRepository.save(commande);

        // Ajout des articles à la commande
        List<ArticleChoosenDto> articlesChoosen = articleChoosenDtoList.getArticles();
        for (ArticleChoosenDto item : articlesChoosen) {
            Article article = articleRepository.findByNameArticle(item.getName());

            // Créer la clé composite
            ArticleCommandeKey articleCommandeKey = new ArticleCommandeKey(article.getIdArticle(), savedCommande.getIdCommande());

            // Créer la relation article-commande avec quantité
            ArticleCommande articleCommande = new ArticleCommande();
            articleCommande.setId(articleCommandeKey);
            articleCommande.setArticle(article);
            articleCommande.setCommande(savedCommande);
            articleCommande.setQuantite(item.getQuantity());

            // Sauvegarde dans la table de relation
            articleCommandeRepository.save(articleCommande);
        }

        // Transformer la commande en OrderDto (à compléter selon ta logique)
        OrderDto orderDto = new OrderDto();
        orderDto.setIdCommande(savedCommande.getIdCommande());

        return orderDto;
    }

    public Map<String,String> addPharmacyToOrder(AddPharmacyDto addPharmacyDto){
        Pharmacie pharmacie = pharmacieRepository.findById(addPharmacyDto.getPharmacyId()).orElseThrow(() -> new RuntimeException("Pharmacy non trouvée"));
        Commande commande = commandeRepository.findById(addPharmacyDto.getCommandeId()).orElseThrow(() -> new RuntimeException("Commande non trouvée"));
        commande.setPharmacie(pharmacie);
        commandeRepository.save(commande);

        return Map.of("response", "commande enregistrée avec succès");

    }
}
