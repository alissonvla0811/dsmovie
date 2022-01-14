package com.devsuperior.dsmovie.controllers.resource;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.devsuperior.dsmovie.dto.ErrorDTO;
import com.devsuperior.dsmovie.exception.DsmovieException;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(DsmovieException.class)
	public ResponseEntity<ErrorDTO> tratarExcecaoDsmovieException(DsmovieException expection, HttpServletRequest request){
		ErrorDTO error = new ErrorDTO();
		error.setTimestamp(Instant.now());
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(expection.getMessage());
		error.setPath(request.getRequestURI());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND.value()).body(error);
	}
}
