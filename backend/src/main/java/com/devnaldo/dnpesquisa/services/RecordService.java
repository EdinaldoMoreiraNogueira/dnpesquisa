package com.devnaldo.dnpesquisa.services;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devnaldo.dnpesquisa.dto.GameDTO;
import com.devnaldo.dnpesquisa.dto.RecordDTO;
import com.devnaldo.dnpesquisa.dto.RecordInsertDTO;
import com.devnaldo.dnpesquisa.entities.Game;
import com.devnaldo.dnpesquisa.entities.Record;
import com.devnaldo.dnpesquisa.repositories.GameRepository;
import com.devnaldo.dnpesquisa.repositories.RecordRepository;

@Service
public class RecordService {
   
   @Autowired	
   private RecordRepository repository;
   
   @Autowired
   private GameRepository gameRepository;
   
   @Transactional
   public RecordDTO insert(RecordInsertDTO dto) {
	   Record entity = new Record();
	   entity.setName(dto.getName());
	   entity.setAge(dto.getAge());
	   entity.setMoment(Instant.now());
	   
	   Game game = gameRepository.getOne(dto.getGameId());
	   entity.setGame(game);
	   
	   entity = repository.save(entity);
	   
	   return new RecordDTO(entity);
   }

   @Transactional(readOnly = true)
public Page<RecordDTO> findByMoments(Instant minDate, Instant maxDate, PageRequest pageRequest) {
	
	return repository.findByMoments(minDate, maxDate, pageRequest).map(x -> new RecordDTO(x));
}
}
