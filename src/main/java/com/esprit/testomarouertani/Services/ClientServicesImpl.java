package com.esprit.testomarouertani.Services;

import com.esprit.testomarouertani.DAO.Entities.Client;
import com.esprit.testomarouertani.Repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClientServicesImpl implements ClientServices{

    ClientRepository clientRepository;
    @Override
    public  Client ajouterClient (Client client){
        clientRepository.save(client);
        return client;
    }
}
