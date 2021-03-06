package com.example.Entites;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Userr {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idU;
    private String email;
    private String userLogin ;
    private String userPassword;
    private String Sexe;
    private String nom;
    private String prenom;
    private String phone;
    private String userAddress ;

    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Role> appRoles=new ArrayList<>();

    @OneToMany(mappedBy = "userr")
    private Collection<Commande> commandes=new ArrayList<>();

    @OneToMany(mappedBy = "userr")
    private Collection<Rating> ratings=new ArrayList<>();;


}
