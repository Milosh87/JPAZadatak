package domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Profesor extends Korisnik {
	@Enumerated(EnumType.STRING)
	private ZvanjeProfesora zvanje;
	private Date date;
	@OneToOne
	@JoinColumn(name = "DEPARTMENT_ID")
	private Department department;
	@OneToMany(mappedBy = "profesor", orphanRemoval = true, cascade = CascadeType.ALL)
	private Set<ProfesorPredmet> profesorPredmets;

	public Profesor() {
		super();
		profesorPredmets = new HashSet<ProfesorPredmet>();

	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public ZvanjeProfesora getZvanje() {
		return zvanje;
	}

	public void setZvanje(ZvanjeProfesora zvanje) {
		this.zvanje = zvanje;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Set<ProfesorPredmet> getProfesorPredmets() {
		return profesorPredmets;
	}

	public void setProfesorPredmets(Set<ProfesorPredmet> profesorPredmets) {
		this.profesorPredmets = profesorPredmets;
	}

	public Profesor(ZvanjeProfesora zvanje, Date date, Department department, Set<ProfesorPredmet> profesorPredmets) {
		super();
		this.zvanje = zvanje;
		this.date = date;
		this.department = department;
		this.profesorPredmets = profesorPredmets;
	}

}
