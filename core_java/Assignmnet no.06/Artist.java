
public class Artist {

	 String name;
	 int age;
	 
	 Artist (String name, int age) {
		 this.name = name;
		 this.age = age;
	 }
	 
	 void perform () {
		 System.out.println("Artist is performing");
	 }
	public static void main(String[] args) {
		
		Artist a;
		
		a= new Painter ("Raj", 35, "Modern", "oil Painting", 25);
		a.perform();
		
		a=new Musician("Amit",30, "Guitar", "ROck", 5);
		a.perform();
		
		a=new Actor("Shyam", 40, "Bolloywood", 30);
		a.perform();
	}

	}

class Painter extends Artist {
	
	String paintingStyle;
	String mediumUsed;
	int numberOfPaintings;
	
	Painter(String name, int age, String paintingStyle, String mediumUsed,int numberOfPaintings){
		
		super(name,age);
		
		this.paintingStyle = paintingStyle;
		this.mediumUsed = mediumUsed;
		this.numberOfPaintings = numberOfPaintings;
	}
	
	@Override
	void perform() {

	    System.out.println("Name: " + name);
	    System.out.println("Age: " + age);
	    System.out.println("Painting Style: " + paintingStyle);
	    System.out.println("Medium Used: " + mediumUsed);
	    System.out.println("Number of Paintings: " + numberOfPaintings);
	    System.out.println("Painter is painting");
	    System.out.println();
	}
}

class Musician extends Artist {
	String instrument;
	String musicGenre;
	int numberOfAlbums;
	
	Musician(String name, int age, String instrument, 
			 String musicGenre, int numberOfAlbums){
		super(name, age);
		
		this.instrument = instrument;
		this.musicGenre = musicGenre;
		this.numberOfAlbums = numberOfAlbums;
	}	
		@Override
    void perform() {
		    System.out.println("name :" + name);
		    System.out.println("Age :" + age);
		    System.out.println("Instrument: " + instrument);
		    System.out.println("Music Genre: " + musicGenre);
		    System.out.println("Number of Albums: " + numberOfAlbums);
		    System.out.println("Musician is performing music");
		    System.out.println();
		}
}

//Actor
class Actor extends Artist {

 String filmIndustry;
 int numberOfMovies;

 Actor(String name, int age, String filmIndustry,
       int numberOfMovies) {

     super(name, age);

     this.filmIndustry = filmIndustry;
     this.numberOfMovies = numberOfMovies;
 }

 @Override
 void perform() {

     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Film Industry: " + filmIndustry);
     System.out.println("Number of Movies: " + numberOfMovies);
     System.out.println("Actor is acting");
     System.out.println();
 

	}

}