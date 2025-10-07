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
  GLQuader flügel1;
  GLQuader flügel2;
  GLKugel accessoire1;
  GLKugel accessoire2;
  
 
  
 public Raumschiff (){
   körper = new GLKugel(0,0,0,50);
   körper.setzeSkalierung(3,1,3);
   körper.setzeTextur("RaumschiffTextur.jpg");
   
   flügel1 = new GLQuader(100,0,100,70,25,150);
   flügel1.setzeTextur("RaumschiffTextur.jpg");

   flügel2 = new GLQuader(-100,0,100,70,25,150);
   flügel2.setzeTextur("RaumschiffTextur.jpg");
   
   
   accessoire1 = new GLKugel(100,0,100,25);
   accessoire1.setzeTextur("RaumschiffTextur.jpg");
   
   accessoire2 = new GLKugel(-100,0,100,25);
   accessoire2.setzeTextur("RaumschiffTextur.jpg");
   
   
      
 }
}