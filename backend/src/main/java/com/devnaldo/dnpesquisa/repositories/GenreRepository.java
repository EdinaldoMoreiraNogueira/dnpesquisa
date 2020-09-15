package com.devnaldo.dnpesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devnaldo.dnpesquisa.entities.Game;
import com.devnaldo.dnpesquisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}
