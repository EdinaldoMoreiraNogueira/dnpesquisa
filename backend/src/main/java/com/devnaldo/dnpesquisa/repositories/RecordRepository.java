package com.devnaldo.dnpesquisa.repositories;

import java.time.Instant;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.devnaldo.dnpesquisa.dto.RecordDTO;
import com.devnaldo.dnpesquisa.entities.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {
	
	 @Query("SELECT obj FROM Record obj WHERE "
	 		+ "(coalesce(:min, null) IS NULL OR obj.moment >= :min) AND "
	 		+ "(coalesce(:max, null)IS NULL OR obj.moment <= :max)")
	 Page<Record> findByMoments(Instant min, Instant max, Pageable pageable);
	

}
