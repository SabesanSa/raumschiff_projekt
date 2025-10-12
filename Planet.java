import GLOOP.*;
/**
 * Write a description of class Planet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Planet
{
  GLKugel planet;
  
  public Planet(){
    planet = new GLKugel(-1000,0,-1500,300);
    planet.setzeTextur("roterPlanet.jpg");
  }
}