public class Horse{
	protected String name;
	protected String color;
	protected int birthYear;
	
	public Horse(String n, String c, int b){
		name = n;
		color = c;
		birthYear = b;
	}
	
	public void setName(String n){
		name = n;
	}
	public String getName(){
		return name;
	}
	public void setColor(String c){
		color = c;
	}
	public String getColor(){
		return color;
	}
	public void setBirthYear(int b){
		birthYear = b;
	}
	public int getBirthYear(){
		return birthYear;
	}
}