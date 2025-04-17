package Demo;


public class Emp 
{
	
	private int id;
	private String name;
	private String email;
	private String password;
	private long salary;
	private int deptNo;
	
	
	
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public Emp(int id, String name, String email, String password, long salary, int deptNo) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.salary = salary;
		this.deptNo = deptNo;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", salary=" + salary
				+ ", deptNo=" + deptNo + "]";
	}
	
	
	
	
	
	
	

}
