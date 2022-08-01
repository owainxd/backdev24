package fr.tests.entities;

public class Person {

	private Long id; 
	private String nom; 
	private String ville;
	public Person(Long id, String nom, String ville) {
		super();
		this.id = id;
		this.nom = nom;
		this.ville = ville;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}


}
