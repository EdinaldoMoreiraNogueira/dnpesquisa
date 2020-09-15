package com.devnaldo.dnpesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devnaldo.dnpesquisa.entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

}
