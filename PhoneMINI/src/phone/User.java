package phone;

public class User {
	private int no;
	private String name;
	private String tel;
	private String email;
	private String id;
	private String pw;
	
	
	
	public User(int no, String name, String tel, String email, String id, String pw) {
		super();
		this.no = no;
		this.name = name;
		this.tel = tel;
		this.email = email;
		this.id = id;
		this.pw = pw;
	}



	public int getNo() {
		return no;
	}



	public void setNo(int no) {
		this.no = no;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getTel() {
		return tel;
	}



	public void setTel(String tel) {
		this.tel = tel;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getPw() {
		return pw;
	}



	public void setPw(String pw) {
		this.pw = pw;
	}



	@Override
	public String toString() {
		return "User [no=" + no + ", name=" + name + ", tel=" + tel + ", email=" + email + ", id=" + id + ", pw=" + pw
				+ "]";
	}
	
	
	
}
