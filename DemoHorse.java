public class DemoHorse{
	public static void main(String[] args){
		RaceHorse raceHorse = new RaceHorse();
		Horse horse = new Horse();
		
		horse.setName("Roger");
		horse.setColor("Purple");
		horse.setBirthYear(1999);
		raceHorse.setName("Billy");
		raceHorse.setColor("Blue:);
		raceHorse.setBirthYear("2010");
		raceHorse.setRaces(4);
		
		System.out.println("The horse is named " + horse.getName() + ", is " + horse.getColor() + ", and was born in " + horse.getBirthYear();
		System.out.println("The race horse is named " + raceHorse.getName() + ", is " + raceHorse.getColor() + ", was born in " + raceHorse.getBirthYear() + ", and has won " + raceHorse.getRaces() + " races since it started racing.");
	}
}