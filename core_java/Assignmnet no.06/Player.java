
public class Player {
	
	String name;
	int age;
	String country;
	int matchesPlayed;
	int jerseyNumber;
	
	Player(String name, int age, String country, int matchesPlayed, int jerseyNumber) {
		
		this.name = name;
		this.age = age;
		this.country = country;
		this.matchesPlayed = matchesPlayed;
		this.jerseyNumber = jerseyNumber;
	}

	 void play() {
		 System.out.println("Player is playing");
	 }
	public static void main(String[] args) {
		
		Player p;
		p=new CricketPlayer("Rohit", 65, "India", 300,45,14000,342,"Right hand", "Right Arm");
        p.play();
        
        p= new FootballPlayer("Sunil", 77, "Indian", 234, 07, 56609, "Forward");
        p.play();
	}

}

//cricket Player 
class CricketPlayer extends Player {
	int totalRuns;
	int totalWickets;
    String battingStyle;
	String bowlingStyle;
	
	CricketPlayer(String name,int age, String country, int matchesPlayed,
			int jerseyNumber, int totalRuns,int totalWickets, String battingStyle, String bowlingStyle){
		
		super(name, age, country,matchesPlayed,jerseyNumber);
	this.totalRuns = totalRuns;
	this.totalWickets = totalWickets;
	this.battingStyle = battingStyle;
	this.bowlingStyle = bowlingStyle;
	}

    @Override
    void play() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
        System.out.println("Matches Played: " + matchesPlayed);
        System.out.println("Jersey Number: " + jerseyNumber);
        System.out.println("Total Runs: " + totalRuns);
        System.out.println("Total Wickets: " + totalWickets);
        System.out.println("Batting Style: " + battingStyle);
        System.out.println("Bowling Style: " + bowlingStyle);
        System.out.println("Cricket Player is playing cricket");
        System.out.println();
    }
}

//Football Player
class FootballPlayer extends Player {

 int totalGoals;
 String playingPosition;

 FootballPlayer(String name, int age, String country,
                int matchesPlayed, int jerseyNumber,
                int totalGoals, String playingPosition) {

     super(name, age, country, matchesPlayed, jerseyNumber);

     this.totalGoals = totalGoals;
     this.playingPosition = playingPosition;
 }

 @Override
 void play() {

     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Country: " + country);
     System.out.println("Matches Played: " + matchesPlayed);
     System.out.println("Jersey Number: " + jerseyNumber);
     System.out.println("Total Goals: " + totalGoals);
     System.out.println("Playing Position: " + playingPosition);
     System.out.println("Football Player is playing football");
     System.out.println();
 }
}