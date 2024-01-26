package com.esprit.testomarouertani.RestController;

import com.esprit.testomarouertani.DAO.Entities.Menu;
import com.esprit.testomarouertani.Services.MenuServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("menu")
public class MenuController {

   MenuServices menuService;

    @PostMapping("/affecterClientAuMenu/{identifiant}/{libelleMenu}")
    public Menu affecterClientAuMenu(@PathVariable String identifiant, @PathVariable String libelleMenu) {
        return menuService.affecterClientAuMenu(identifiant, libelleMenu);
    }
}
