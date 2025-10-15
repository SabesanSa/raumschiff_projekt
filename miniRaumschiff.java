import GLOOP.*;
/**
 * Write a description of class Raumschiff here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class miniRaumschiff
{
  GLZylinder körper;
  GLKegel spitze;
  GLZylinder zwischenraum;
  //dasdasdsadas
  
  public miniRaumschiff (){
   
   körper =new GLZylinder(100,250,350,20,80);
   körper.setzeSkalierung(3,3,1.5);
   
   
   spitze =new GLKegel(100,250,200,20,80);
   spitze.setzeSkalierung(4,4,1);
   
   zwischenraum =new GLZylinder(100,250,290,20,80);
   zwischenraum.setzeSkalierung(4,4,0.2);
   
   
   


 }
}