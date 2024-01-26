package com.esprit.testomarouertani.RestController;

import com.esprit.testomarouertani.DAO.Entities.Restaurant;
import com.esprit.testomarouertani.Services.RestaurantServices;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("restaurant")
public class RestaurantController {

    RestaurantServices restaurantServices;

    @PostMapping("/ajouter")
    public ResponseEntity<Restaurant> ajouterRestaurantEtMenusAssocie(@RequestBody Restaurant restaurant) {
        Restaurant savedRestaurant = restaurantServices.ajouterRestaurantEtMenusAssocie(restaurant);
        return new ResponseEntity<>(savedRestaurant, HttpStatus.CREATED);
    }



}
