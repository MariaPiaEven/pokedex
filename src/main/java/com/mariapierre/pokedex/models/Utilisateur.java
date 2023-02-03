package com.mariapierre.pokedex.models;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;


@Entity
@EntityListeners(AuditingEntityListener.class)
public class Utilisateur {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id_utilisateur;
    private String username;
    private String password;
    private String email;

    @ManyToMany
    @JoinTable(
            name="utilisateur_pokemon",
            joinColumns=@JoinColumn(name="utilisateur_id"),
            inverseJoinColumns=@JoinColumn(name="pokemon_id")
    )
    private List<Pokemon> pokemons;

}
