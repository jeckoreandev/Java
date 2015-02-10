public abstract class Super{
	private String email;
	private String passwd;
	public Super(String email, String passwd){
		this.email = email;
		this.passwd = passwd;
	}

	public String getEmail(){
		return this.email;
	}
	public String getPasswd(){
		return this.passwd;
	}
	
}
