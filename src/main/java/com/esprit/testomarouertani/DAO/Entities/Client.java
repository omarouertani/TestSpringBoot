package com.esprit.testomarouertani.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Client {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   Long idClient ;
   String identifiant ;
   LocalDate datePremiereVisite;

   @ManyToMany(mappedBy = "clients" , cascade = CascadeType.ALL)
    Set<Menu> menusCli ;





}
