package com.esprit.testomarouertani.Services;

import com.esprit.testomarouertani.DAO.Entities.Menu;
import com.esprit.testomarouertani.DAO.Entities.Restaurant;
import com.esprit.testomarouertani.Repository.MenuRepository;
import com.esprit.testomarouertani.Repository.RestaurantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RestaurantServicesImpl implements RestaurantServices {
    RestaurantRepository restaurantRepository;
    MenuRepository menuRepository;
    @Override
    public Restaurant ajouterRestaurantEtMenusAssocie(Restaurant restaurant){
        Restaurant savedRestaurant = restaurantRepository.save(restaurant);

        for (Menu menu : restaurant.getMenus()) {
            menuRepository.save(menu);
        }

        return savedRestaurant;
    }


}


