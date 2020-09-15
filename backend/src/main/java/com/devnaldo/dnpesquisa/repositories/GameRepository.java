package com.devnaldo.dnpesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devnaldo.dnpesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
