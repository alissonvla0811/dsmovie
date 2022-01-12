package com.devsuperior.dsmovie.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private ScorePK id;
	private Double value;
	
	public Score() {
		this.id = new ScorePK();
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	public void setMovie(Movie movie) {
		this.id.setMovie(movie);
	}
	
	public void setuUser(User user) {
		this.id.setUser(user);
	}
}
