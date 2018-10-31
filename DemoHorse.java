import java.util.*;

public class DemoHorse{
	public static void main(String[] args){
		String horseName;
		String horseColor;
		int horseBirthYear;
		int horseRaces;
		
		
		RaceHorse raceHorse = new RaceHorse("", "", 0, 0);
		Horse horse = new Horse("", "", 0);
		Scanner inputDevice = new Scanner(System.in);
		
		System.out.print("Enter name of horse: ");
		horseName = inputDevice.nextLine();
		horse.setName(horseName);
		System.out.print("Enter color of horse: ");
		horseColor = inputDevice.nextLine();
		horse.setColor(horseColor);
		System.out.print("Enter birth year of horse: ");
		horseBirthYear = inputDevice.nextInt();
		horse.setBirthYear(horseBirthYear);
		inputDevice.nextLine();
		
		System.out.println("\nThe horse is named " + horse.getName() + ", is " + horse.getColor() + ", and was born in " + horse.getBirthYear());
		
		System.out.print("\nEnter name of the race horse: ");
		horseName = inputDevice.nextLine();
		raceHorse.setName(horseName);
		System.out.print("Enter color of the race horse: ");
		horseColor = inputDevice.nextLine();
		raceHorse.setColor(horseColor);
		System.out.print("Enter birth year of the race horse: ");
		horseBirthYear = inputDevice.nextInt();
		raceHorse.setBirthYear(horseBirthYear);
		inputDevice.nextLine();
		System.out.print("Enter number of races the race horse has won: ");
		horseRaces = inputDevice.nextInt();
		raceHorse.setRaces(horseRaces);
		inputDevice.nextLine();
		
		System.out.println("\nThe race horse is named " + raceHorse.getName() + ", is " + raceHorse.getColor() + ", was born in " + raceHorse.getBirthYear() + ", and has won " + raceHorse.getRaces() + " races since it started racing.");
		
	}
}