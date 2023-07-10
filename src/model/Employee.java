package model;

/*
 * This Employee model is used as data transfer object between layers.
 * @author bhaskar
 */

public class Employee {
	
	/*
	 * id of employee
	 */
	private Long id;
	
	/*
	 * name of employee
	 */
	private String name;
	
	/*
	 * contact of employee
	 */
	private String contact;
	
	/*
	 * email of employee
	 */
	private String email;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", contact=" + contact + ", email=" + email + "]";
	}
	
	
	
	

}
