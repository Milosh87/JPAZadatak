package domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "Ispit", uniqueConstraints = {
		@UniqueConstraint(columnNames = {"PROFPREDMET_ID", "STUDENT_ID"})
})
public class Ispit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date datum;
	private int ocena;
	@ManyToOne
	@JoinColumn(name = "PROFPREDMET_ID",referencedColumnName = "ID")
	private ProfesorPredmet profesorPredmet;
	@ManyToOne
	@JoinColumn(name = "STUDENT_ID",referencedColumnName = "ID")
	private Student student;
	public Ispit() {
		super();
	}
	public Date getDatum() {
		return datum;
	}
	public void setDatum(Date datum) {
		this.datum = datum;
	}
	public int getOcena() {
		return ocena;
	}
	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	public ProfesorPredmet getProfesorPredmet() {
		return profesorPredmet;
	}
	public void setProfesorPredmet(ProfesorPredmet profesorPredmet) {
		this.profesorPredmet = profesorPredmet;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Ispit(Long id, Date datum, int ocena, ProfesorPredmet profesorPredmet, Student student) {
		super();
		this.id = id;
		this.datum = datum;
		this.ocena = ocena;
		this.profesorPredmet = profesorPredmet;
		this.student = student;
	}
	
	
}
