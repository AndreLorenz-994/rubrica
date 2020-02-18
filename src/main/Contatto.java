package main;

import java.util.Date;

public class Contatto {
	private String nome;
	private String cognome;
	private long numero;
	private String email;
	private String indirizzo;
	private Date nascita;
	private int id;
	private boolean preferiti;
	// Commento
	public Contatto(String nome, String cognome, long numero, String email, String indirizzo, Date nascita, int id,
			boolean preferiti) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.numero = numero;
		this.email = email;
		this.indirizzo = indirizzo;
		this.nascita = nascita;
		this.id = id;
		this.preferiti = preferiti;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public long getNumero() {
		return numero;
	}

	public String getEmail() {
		return email;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public Date getNascita() {
		return nascita;
	}

	public int getId() {
		return id;
	}

	public boolean isPreferiti() {
		return preferiti;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public void setNascita(Date nascita) {
		this.nascita = nascita;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPreferiti(boolean preferiti) {
		this.preferiti = preferiti;
	}
	
	
	
	
}
