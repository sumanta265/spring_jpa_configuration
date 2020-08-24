package i0.project.spring_project;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Info {
	@Id
    private int id;
    
    private String  name;
	private String email;
	
	
    
	public Info() {
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Info [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	public Info(String id, String name, String email) {
		super();
		this.id =Integer.parseInt(id);
		this.name = name;
		this.email = email;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
