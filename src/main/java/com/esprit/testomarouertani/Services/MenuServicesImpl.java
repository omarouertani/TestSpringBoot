package com.esprit.testomarouertani.Services;

import com.esprit.testomarouertani.DAO.Entities.Client;
import com.esprit.testomarouertani.DAO.Entities.Menu;
import com.esprit.testomarouertani.Repository.ClientRepository;
import com.esprit.testomarouertani.Repository.MenuRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MenuServicesImpl implements MenuServices {
    ClientRepository clientRepository;
    MenuRepository menuRepository;
    @Override
    public Menu affecterClientAuMenu(String identifiant, String libelleMenu) {
        Client client = clientRepository.findByIdentifiant(identifiant);
        Menu menu = menuRepository.findByLibelleMenu(libelleMenu);

        if (client != null && menu != null) {
            client.getMenusCli().add(menu);
            menu.getClients().add(client);

            clientRepository.save(client);
            menuRepository.save(menu);
        }

        return menu;
    }
}
