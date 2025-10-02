import GLOOP.*;
/**
 * Write a description of class Raumschiff here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Raumschiff
{
  GLKugel körper;
  
 public Raumschiff (){
   körper = new GLKugel(0,0,0,50);
   körper.setzeSkalierung(3,1,3);
   körper.verschiebe(0,0,0);
 }
}