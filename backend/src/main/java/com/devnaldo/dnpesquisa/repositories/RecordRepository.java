package com.devnaldo.dnpesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devnaldo.dnpesquisa.entities.Game;
import com.devnaldo.dnpesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {

}
