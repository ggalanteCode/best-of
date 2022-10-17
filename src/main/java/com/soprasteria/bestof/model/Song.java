package com.soprasteria.bestof.model;

public class Song {
	
	private String titolo;
	private int anno;
	private String genere;
	private String autore;
	private String performer;
	
	public Song(String titolo, int anno, String genere, String autore, String performer) {
		super();
		this.titolo = titolo;
		this.anno = anno;
		this.genere = genere;
		this.autore = autore;
		this.performer = performer;
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

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getPerformer() {
		return performer;
	}

	public void setPerformer(String performer) {
		this.performer = performer;
	}

}
