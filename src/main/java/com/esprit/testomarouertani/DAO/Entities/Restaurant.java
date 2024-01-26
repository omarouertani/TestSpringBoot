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
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idrestaurant;
    String nom ;
    Long nbPlacesMax ;
    @OneToMany(cascade = CascadeType.ALL)
    Set<Menu> menus ;
}
