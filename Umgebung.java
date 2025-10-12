import GLOOP.*;
/**
 * Write a description of class Umgebung here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Umgebung
{
  GLEntwicklerkamera kamera;
  GLLicht licht;
  Raumschiff einRaumschiff;

  public Umgebung(){
  licht = new GLLicht();
  
  kamera = new GLEntwicklerkamera(1920,1080);
  //kamera.zeigeAchsen(true);
  
  einRaumschiff = new Raumschiff(); 
    
  }
}