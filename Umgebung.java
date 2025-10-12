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
  GLLicht licht2;
  Raumschiff einRaumschiff;
  Hintergrund einHintergrund;

  public Umgebung(){
  licht = new GLLicht();
  licht2 = new GLLicht(500,500,500);
  
  kamera = new GLEntwicklerkamera(1920,1080);
  //kamera.zeigeAchsen(true);
  
  einRaumschiff = new Raumschiff(); 
  einHintergrund = new Hintergrund();
    
  }
}