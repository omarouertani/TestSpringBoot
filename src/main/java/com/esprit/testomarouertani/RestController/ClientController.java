package com.esprit.testomarouertani.RestController;

import com.esprit.testomarouertani.DAO.Entities.Client;
import com.esprit.testomarouertani.Services.ClientServices;
import com.esprit.testomarouertani.Services.ClientServicesImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("client")
public class ClientController {
    ClientServicesImpl clientServices;

    @PostMapping("addClient")
    public Client addClient(@RequestBody Client c ){
        return clientServices.ajouterClient(c);
    }
}
