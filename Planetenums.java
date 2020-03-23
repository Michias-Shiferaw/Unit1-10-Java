//Scan all primitive data types
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

/**
  * This program creates an enum of the Orb and displays their planet.
* from the sun.
  * @author Michias Shiferaw
  * @Version 2.0
  * @since 2020-03-19.
  */



public class Planetenums {
  
  public enum Orb {
    //https://www.nasa.gov/pdf/622145main_SSML1Answr.pdf for measurements between planets and the sun
    MERCURY("mercury", 4.0),
    VENUS("venus", 7.0),
    EARTH("earth", 10),
    MARS("mars", 15),
    JUPITER("jupiter", 52),
    SATURN("saturn", 95),
    URANUS("uranus", 192),
    NEPTUNE("neptune", 300),
    PLUTO("pluto", 393);
    
    private final String planet;
    private final double distancing;
    
    Orb(String planet, double distancing) {
      this.planet = planet;
      this.distancing = distancing;
    }
    
    public String getPlanet() {
      return this.planet;
    }
    
    private double dist() {
      return this.distancing; 
    }
  }
  
  /**
  * This program creates an enum of the Orb and displays their planet.
  * from the sun.
  * @author Michias Shiferaw
  * @Version 2.0
  * @since 2020-03-19.
  */
  
  public static void main(String[] args) throws IOException {

    String chosenPlanet;
    Orb selected;
    
    System.out.println("Enter a planet");
    
    InputStreamReader r = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(r);
    
    chosenPlanet = br.readLine();

    String valid = (chosenPlanet.toUpperCase());
    
    if (valid.equals(Orb.MERCURY.name()))  {
      //if the input is recognized as Mercury
      double closest = ((Math.abs(Orb.MERCURY.dist() - Orb.VENUS.dist())) / 10);
      double close2 = ((Math.abs(Orb.MERCURY.dist() - Orb.EARTH.dist())) / 10);
      double close3 = ((Math.abs(Orb.MERCURY.dist() - Orb.MARS.dist())) / 10);
      double close4 = ((Math.abs(Orb.MERCURY.dist() - Orb.JUPITER.dist())) / 10);
      double close5 = ((Math.abs(Orb.MERCURY.dist() - Orb.SATURN.dist())) / 10);
      double close6 = ((Math.abs(Orb.MERCURY.dist() - Orb.URANUS.dist())) / 10);
      double close7 = ((Math.abs(Orb.MERCURY.dist() - Orb.NEPTUNE.dist())) / 10);
      double furthest = ((Math.abs(Orb.MERCURY.dist() - Orb.PLUTO.dist())) / 10);
      System.out.println("The closest planets from " + valid +  " in AU are in the following;");
      System.out.println("Venus : " + closest + ", Earth " + close2 + ", Mars " + close3 
          + ", Jupiter " + close4 + ", Saturn " + close5 + ", Uranus " + close6 + ", Neptune " 
          + close7 + " &, Pluto " + furthest);
      System.out.println(valid + " is " + Orb.MERCURY.dist() + " from the sun.");
      
    } else if (valid.equals(Orb.VENUS.name()))  {
      //if the input is recognized as Venus
      double closest = ((Math.abs(Orb.MERCURY.dist() - Orb.VENUS.dist())) / 10);
      double close2 = ((Math.abs(Orb.VENUS.dist() - Orb.EARTH.dist())) / 10);
      double close3 = ((Math.abs(Orb.VENUS.dist() - Orb.MARS.dist())) / 10);
      double close4 = ((Math.abs(Orb.VENUS.dist() - Orb.JUPITER.dist())) / 10);
      double close5 = ((Math.abs(Orb.VENUS.dist() - Orb.SATURN.dist())) / 10);
      double close6 = ((Math.abs(Orb.VENUS.dist() - Orb.URANUS.dist())) / 10);
      double close7 = ((Math.abs(Orb.VENUS.dist() - Orb.NEPTUNE.dist())) / 10);
      double furthest = ((Math.abs(Orb.VENUS.dist() - Orb.PLUTO.dist())) / 10);
      System.out.println("The closest planets from " + valid +  " in AU are in the following;");
      System.out.println("Mercury : " + closest + ", Earth " + close2 + ", Mars " + close3 
          + ", Jupiter " + close4 + ", Saturn " + close5 + ", Uranus " + close6 + ", Neptune " 
          + close7 + " &, Pluto " + furthest);
      System.out.println(valid + " is " + Orb.VENUS.dist() + " from the sun.");
      
    } else if (valid.equals(Orb.EARTH.name()))  {  
      //if the input is recognized as Earth
      double closest = ((Math.abs(Orb.VENUS.dist() - Orb.EARTH.dist())) / 10);
      double close2 = ((Math.abs(Orb.MARS.dist() - Orb.EARTH.dist())) / 10);
      double close3 = ((Math.abs(Orb.MERCURY.dist() - Orb.EARTH.dist())) / 10);
      double close4 = ((Math.abs(Orb.EARTH.dist() - Orb.JUPITER.dist())) / 10);
      double close5 = ((Math.abs(Orb.SATURN.dist() - Orb.EARTH.dist())) / 10);
      double close6 = ((Math.abs(Orb.EARTH.dist() - Orb.URANUS.dist())) / 10);
      double close7 = ((Math.abs(Orb.NEPTUNE.dist() - Orb.EARTH.dist())) / 10);
      double  furthest = ((Math.abs(Orb.PLUTO.dist() - Orb.EARTH.dist())) / 10);
      System.out.println("The closest planets from " + valid +  " in AU are in the following;");
      System.out.println("Venus : " + closest + ", Mars " + close2 + ", Mercury " + close3 
          + ", Jupiter " + close4 + ", Saturn " + close5 + ", Uranus " + close6 
          + ", Neptune " + close7 + " &, Pluto " + furthest);
      System.out.println(valid + " is " + Orb.EARTH.dist() + " from the sun.");
      
    } else if (valid.equals(Orb.MARS.name()))  {
      //if the input is recognized as Mars
      double closest = ((Math.abs(Orb.EARTH.dist() - Orb.MARS.dist())) / 10);
      double close2 = ((Math.abs(Orb.MARS.dist() - Orb.VENUS.dist())) / 10);
      double close3 = ((Math.abs(Orb.MERCURY.dist() - Orb.MARS.dist())) / 10);
      double close4 = ((Math.abs(Orb.MARS.dist() - Orb.JUPITER.dist())) / 10);
      double close5 = ((Math.abs(Orb.MARS.dist() - Orb.SATURN.dist())) / 10);
      double  close6 = ((Math.abs(Orb.MARS.dist() - Orb.URANUS.dist())) / 10);
      double  close7 = ((Math.abs(Orb.MARS.dist() - Orb.NEPTUNE.dist())) / 10);
      double  furthest = ((Math.abs(Orb.MARS.dist() - Orb.PLUTO.dist())) / 10);
      System.out.println("The closest planets from " + valid +  " in AU are in the following;");
      System.out.println("Earth : " + closest + ", Venus " + close2 + ", Mercury " + close3 
          + ", Jupiter " + close4 + ", Saturn " + close5 + ", Uranus " + close6 
          + ", Neptune " + close7 + " &, Pluto " + furthest);
      System.out.println(valid + " is " + Orb.MARS.dist() + " AU from the sun.");
      
    } else if (valid.equals(Orb.JUPITER.name()))  {
      //if the input is recognized as Jupiter
      double closest = ((Math.abs(Orb.MARS.dist() - Orb.JUPITER.dist())) / 10);
      double close2 = ((Math.abs(Orb.JUPITER.dist() - Orb.EARTH.dist())) / 10);
      double close3 = ((Math.abs(Orb.JUPITER.dist() - Orb.VENUS.dist())) / 10);
      double close4 = ((Math.abs(Orb.JUPITER.dist() - Orb.SATURN.dist())) / 10);
      double close5 = ((Math.abs(Orb.JUPITER.dist() - Orb.MERCURY.dist())) / 10);
      double close6 = ((Math.abs(Orb.JUPITER.dist() - Orb.URANUS.dist())) / 10);
      double close7 = ((Math.abs(Orb.JUPITER.dist() - Orb.NEPTUNE.dist())) / 10);
      double furthest = ((Math.abs(Orb.JUPITER.dist() - Orb.PLUTO.dist())) / 10);
      System.out.println("The closest planets from " + valid +  " in AU are in the following;");
      System.out.println("Mars : " + closest + ", Earth " + close2 + ", Venus " + close3 
          + ", Saturn " + close4 + ", Mercury " + close5 + ", Uranus " + close6 + ", Neptune " 
          + close7 + " &, Pluto " + furthest);
      System.out.println(valid + " is " + Orb.JUPITER.dist() + " from the sun.");
      
    } else if (valid.equals(Orb.SATURN.name()))  {  
      //if the input is recognized as Saturn
      double  closest = ((Math.abs(Orb.JUPITER.dist() - Orb.SATURN.dist())) / 10);
      double  close2 = ((Math.abs(Orb.SATURN.dist() - Orb.MARS.dist())) / 10);
      double  close3 = ((Math.abs(Orb.SATURN.dist() - Orb.EARTH.dist())) / 10);
      double  close4 = ((Math.abs(Orb.SATURN.dist() - Orb.VENUS.dist())) / 10);
      double  close5 = ((Math.abs(Orb.SATURN.dist() - Orb.MERCURY.dist())) / 10);
      double  close6 = ((Math.abs(Orb.SATURN.dist() - Orb.URANUS.dist())) / 10);
      double  close7 = ((Math.abs(Orb.SATURN.dist() - Orb.NEPTUNE.dist())) / 10);
      double  furthest = ((Math.abs(Orb.SATURN.dist() - Orb.PLUTO.dist())) / 10);
      System.out.println("The closest planets from " + valid +  " in AU are in the following;");
      System.out.println("Jupiter : " + closest + ", Mars " + close2 + ", Earth " 
          + close3 + ", Venus " + close4 + ", Mercury " + close5 + ", Uranus " + close6 
          + ", Neptune " + close7 + " &, Pluto " + furthest);
      System.out.println(valid + " is " + Orb.SATURN.dist() + " from the sun.");
        
    } else if (valid.equals(Orb.URANUS.name()))  {
      //if the input is recognized as Uranus
      double  closest = ((Math.abs(Orb.SATURN.dist() - Orb.URANUS.dist())) / 10);
      double  close2 = ((Math.abs(Orb.URANUS.dist() - Orb.NEPTUNE.dist())) / 10);
      double  close3 = ((Math.abs(Orb.URANUS.dist() - Orb.JUPITER.dist())) / 10);
      double  close4 = ((Math.abs(Orb.URANUS.dist() - Orb.MARS.dist())) / 10);
      double  close5 = ((Math.abs(Orb.URANUS.dist() - Orb.EARTH.dist())) / 10);
      double  close6 = ((Math.abs(Orb.URANUS.dist() - Orb.VENUS.dist())) / 10);
      double  close7 = ((Math.abs(Orb.URANUS.dist() - Orb.MERCURY.dist())) / 10);
      double  furthest = ((Math.abs(Orb.URANUS.dist() - Orb.PLUTO.dist())) / 10);
      System.out.println("The closest planets from " + valid +  " in AU are in the following;");
      System.out.println("Saturn : " + closest + ", Neptune " + close2 + ", Jupiter " 
          + close3 + ", Mars " + close4 + ", Earth " + close5 + ", Venus " + close6 
          + ", Mercury " + close7 + " &, Pluto " + furthest);
      System.out.println(valid + " is " + Orb.URANUS.dist() + " from the sun.");
    } else if (valid.equals(Orb.NEPTUNE.name()))  {
      //if the input is recognized as Neptune
      double  closest = ((Math.abs(Orb.PLUTO.dist() - Orb.NEPTUNE.dist())) / 10);
      double  close2 = ((Math.abs(Orb.NEPTUNE.dist() - Orb.URANUS.dist())) / 10);
      double  close3 = ((Math.abs(Orb.NEPTUNE.dist() - Orb.SATURN.dist())) / 10);
      double  close4 = ((Math.abs(Orb.NEPTUNE.dist() - Orb.JUPITER.dist())) / 10);
      double  close5 = ((Math.abs(Orb.NEPTUNE.dist() - Orb.MARS.dist())) / 10);
      double  close6 = ((Math.abs(Orb.NEPTUNE.dist() - Orb.EARTH.dist())) / 10);
      double  close7 = ((Math.abs(Orb.NEPTUNE.dist() - Orb.VENUS.dist())) / 10);
      double  furthest = ((Math.abs(Orb.NEPTUNE.dist() - Orb.MERCURY.dist())) / 10);
      System.out.println("The closest planets from " + valid +  " in AU are in the following;");
      System.out.println("Pluto : " + closest + ", Uranus " + close2 + ", Saturn " + close3 
          + ", Jupiter " + close4 + ", Mars " + close5 + ", Earth " + close6 + ", Venus " 
          + close7 + " &, Mercury " + furthest);
      System.out.println(valid + " is " + Orb.NEPTUNE.dist() + " from the sun.");
      
    } else if (valid.equals(Orb.PLUTO.name()))  {  
      //if the input is recognized as Pluto
      double closest = ((Math.abs(Orb.NEPTUNE.dist() - Orb.PLUTO.dist())) / 10);
      double close2 = ((Math.abs(Orb.PLUTO.dist() - Orb.URANUS.dist())) / 10);
      double close3 = ((Math.abs(Orb.PLUTO.dist() - Orb.SATURN.dist())) / 10);
      double close4 = ((Math.abs(Orb.PLUTO.dist() - Orb.JUPITER.dist())) / 10);
      double close5 = ((Math.abs(Orb.PLUTO.dist() - Orb.MARS.dist())) / 10);
      double close6 = ((Math.abs(Orb.PLUTO.dist() - Orb.EARTH.dist())) / 10);
      double close7 = ((Math.abs(Orb.PLUTO.dist() - Orb.VENUS.dist())) / 10);
      double furthest = ((Math.abs(Orb.PLUTO.dist() - Orb.MERCURY.dist())) / 10);
      System.out.println("The closest planets from " + valid +  " in AU are in the following;");
      System.out.println("Neptune : " + closest + ", Uranus " + close2 + ", Saturn " + close3 
          + ", Jupiter " + close4 + ", Mars " + close5 + ", Earth " + close6 + ", Venus " 
          + close7 + " &, Mercury " + furthest);
      System.out.println(valid + " is " + Orb.PLUTO.dist() + " from the sun.");
    } else {
      //As the user did not input a proper planet, the program will infomr them so and close. 
      System.out.println("Sorry there is no such planet with the name ' " + valid + "'");
      System.out.println("BYE BYE");
      System.exit(0);
    }
  }
}