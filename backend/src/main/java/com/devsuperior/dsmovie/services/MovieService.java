package com.devsuperior.dsmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.exception.DsmovieException;
import com.devsuperior.dsmovie.repositories.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository movieRepository;
	
	@Transactional(readOnly = true)
	public Page<MovieDTO> findAll(Pageable pageable){
		return movieRepository.findAll(pageable).map(m -> new MovieDTO(m));
	}
	
	@Transactional(readOnly = true)
	public MovieDTO findById(Long id){
		return new MovieDTO(movieRepository.findById(id).orElseThrow(() -> new DsmovieException("Filme não encontrado com id "+id)));
	}
}
