package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Department {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	@Column(unique =  true)
	private String ime;

	public Department(String ime) {
		super();
		this.ime = ime;
	}

	public Department() {
		super();
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public Department(Long id, String ime) {
		super();
		this.id = id;
		this.ime = ime;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", ime=" + ime + "]";
	}
	
	
	
	
}
