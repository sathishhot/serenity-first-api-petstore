package starter.petstore;

public class Pet {

	private String name;
	private String status;
	private Long id;

	public Pet(String name, String status, Long id) {
		this.name=name;
		this.status=status;
		this.id=id;
	}

	public Pet(String name, String status) {
		this.name=name;
		this.status=status;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public Long getId() {
		return this.id;
	}
	

	public void setName() {
		 this.name = name;
	}
	
	public void setStatus() {
		 this.status=status;
	}
	
	public void setId() {
		 this.id=id;
	}
}
