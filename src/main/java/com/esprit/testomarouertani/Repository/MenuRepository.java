package com.esprit.testomarouertani.Repository;

import com.esprit.testomarouertani.DAO.Entities.Client;
import com.esprit.testomarouertani.DAO.Entities.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu,Long> {
    Menu findByLibelleMenu (String libelleMenu);

}
