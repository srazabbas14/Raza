public class user_check {
	private String name;
	private String password;
	private boolean role; // true = teacher and false = student
	private String score;//
	
	user_check(){
		this.name = "";
		this.password = "";
		this.role = true;
		this.score="";
		
	}
	public boolean checkPassword(String s) {
		if(s.equals(this.password))
		{
			return true;
		}
		else return false;
	}
	public void setFromFile(String Name , String Password , boolean Role , String Score) {
		this.name = Name;
		this.password = Password;
		this.role = Role;
		this.score = Score;
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean getRole()
	{
		return this.role;
	}
	public String getScore() {
		return this.score;
	}
	
	public void print() {
		System.out.println(this.name);
		System.out.println(this.password);
		System.out.println(this.role);
		System.out.println(this.score);
	}
}
