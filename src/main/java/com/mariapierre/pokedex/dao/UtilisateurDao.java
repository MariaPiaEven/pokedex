package com.mariapierre.pokedex.dao;

import com.mariapierre.pokedex.models.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurDao extends JpaRepository <Utilisateur, Integer>{
}
