package com.mariapierre.pokedex.dao;

import com.mariapierre.pokedex.models.Pokedex;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokedexDao extends JpaRepository <Pokedex, Integer> {

    
    
}
