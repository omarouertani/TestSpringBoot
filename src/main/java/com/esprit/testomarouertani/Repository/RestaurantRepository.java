package com.esprit.testomarouertani.Repository;

import com.esprit.testomarouertani.DAO.Entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant , Long> {
}
