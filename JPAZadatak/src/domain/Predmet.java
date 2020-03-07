package domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Predmet {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	@Column(unique =  true)
	private String naziv;
	private int espb;
	@OneToMany(mappedBy = "predmet", orphanRemoval = true, cascade = CascadeType.ALL)
	private List<ProfesorPredmet> profesorPredmet;
	@ManyToMany(mappedBy = "predmeti")
	List<StudijskiProgram> studijskiPrograms;
	
	public Predmet() {
		super();
		studijskiPrograms = new ArrayList<StudijskiProgram>();
	
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getEspb() {
		return espb;
	}
	public void setEspb(int espb) {
		this.espb = espb;
	}
	public List<ProfesorPredmet> getProfesorPredmet() {
		return profesorPredmet;
	}
	public void setProfesorPredmet(List<ProfesorPredmet> profesorPredmet) {
		this.profesorPredmet = profesorPredmet;
	}
	public List<StudijskiProgram> getStudijskiPrograms() {
		return studijskiPrograms;
	}
	public void setStudijskiPrograms(List<StudijskiProgram> studijskiPrograms) {
		this.studijskiPrograms = studijskiPrograms;
	}
	public Predmet(Long id, String naziv, int espb, List<ProfesorPredmet> profesorPredmet,
			List<StudijskiProgram> studijskiPrograms) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.espb = espb;
		this.profesorPredmet = profesorPredmet;
		this.studijskiPrograms = studijskiPrograms;
	}
	
	
}
