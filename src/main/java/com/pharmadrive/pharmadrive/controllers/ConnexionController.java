package com.pharmadrive.pharmadrive.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pharmadrive.pharmadrive.models.ArticleCommande;
import com.pharmadrive.pharmadrive.models.ArticleCommandeKey;
import com.pharmadrive.pharmadrive.repositories.ArticleCommandeRepository;

// @RestController
// public class ConnexionController {

//     @Autowired
//     UserRepository userRepository;

//     @GetMapping("/hello")
//     public User helloWolrd(){

//         Optional<User> user = userRepository.findByEmail("test@test.com");
//         if(user.isPresent()){
//             return user.get();
//         }
//         throw new RuntimeException("helloworld");
//     }
//     @GetMapping("/user/{id}")
//     public User getUserById(@PathVariable Long id) {
//         Optional<User> user = userRepository.findById(id);
//         if (user.isPresent()) {
//             return user.get();
//         }
//         throw new RuntimeException("User not found with ID: " + id);
//     }


//     @Autowired 
//     private ArticleRepository articleRepository;

//     @GetMapping("/by-name/{name}")
//     public Article getArticleByName(@PathVariable String name) {
//         Article article = articleRepository.findByNameArticle(name);
//         if (article != null) {
//             return article;
//         }
//         throw new RuntimeException("Article not found with name: " + name);
//     }


    
// }
@RestController
@RequestMapping("/article-commandes")
public class ConnexionController {

    @Autowired
    private ArticleCommandeRepository articleCommandeRepository;

    @GetMapping("/by-ids")
    public ArticleCommande getArticleCommandeById(@RequestParam Long idArticle, @RequestParam Long idCommande) {
        ArticleCommandeKey key = new ArticleCommandeKey(idArticle, idCommande);
        Optional<ArticleCommande> articleCommande = articleCommandeRepository.findById(key);
        
        if (articleCommande.isPresent()) {
            return articleCommande.get();
        }
        throw new RuntimeException("ArticleCommande not found with idArticle: " + idArticle + " and idCommande: " + idCommande);
    }
}