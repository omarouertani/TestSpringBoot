package com.esprit.testomarouertani.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idMenu;
    String libelleMenu ;
    TypeMenu typeMenu ;
    Float prixTotal ;
    @ManyToMany(cascade = CascadeType.ALL)
    Set<Client> clients ;

    @OneToMany(mappedBy = "menuComp",cascade = CascadeType.ALL)
    Set<Composant> comp ;


}
