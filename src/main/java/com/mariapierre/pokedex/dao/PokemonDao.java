package com.mariapierre.pokedex.dao;

import com.mariapierre.pokedex.models.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonDao extends JpaRepository <Pokemon, Integer> {
}
