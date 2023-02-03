package com.mariapierre.pokedex.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Pokemon {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_pokemon;
    private String pokemon_name;
    private String type;
    private String description;

    @ManyToMany(mappedBy="pokemons")
    private List<Utilisateur> utilisateurs;

}
