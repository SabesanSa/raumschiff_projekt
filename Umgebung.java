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
  Raumschiff zweiRaumschiff;
  Hintergrund einHintergrund;
  Planet planet;
<<<<<<< HEAD
  GLTastatur tastatur;
  miniRaumschiff miniRaumschiff;
=======
  

>>>>>>> 04ad868c1d5d07ca356eb1d67f787357e1384a14

  public Umgebung(){
  licht = new GLLicht();
  licht2 = new GLLicht(500,500,500);
  
  kamera = new GLEntwicklerkamera(1920,1080);
  //kamera.zeigeAchsen(true);
  
  einRaumschiff = new Raumschiff(); 
  einHintergrund = new Hintergrund();
  planet = new Planet();
<<<<<<< HEAD
  this.starteLiveAbfrage();
  miniRaumschiff = new miniRaumschiff();
}
private void starteLiveAbfrage(){

=======
  
  
>>>>>>> 04ad868c1d5d07ca356eb1d67f787357e1384a14
}
}
