public class RaceHorse extends Horse{
	private int numRaces;
	
	public RaceHorse(String n, String c, int b, int r){
		super(n, c, b);
		numRaces = r;
	}
	
	public void setRaces(int r){
		numRaces = r;
	}
	public int getRaces(){
		return numRaces;
	}
}