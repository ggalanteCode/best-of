package com.soprasteria.bestof.model;

import java.util.List;

public class Movie {
	
	private String titolo;
	private int anno;
	private String regista;
	private List<String> cast;
	
	public Movie(String titolo, int anno, String regista, List<String> cast) {
		super();
		this.titolo = titolo;
		this.anno = anno;
		this.regista = regista;
		this.cast = cast;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public String getRegista() {
		return regista;
	}

	public void setRegista(String regista) {
		this.regista = regista;
	}

	public List<String> getCast() {
		return cast;
	}

	public void setCast(List<String> cast) {
		this.cast = cast;
	}

}
