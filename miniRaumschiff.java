import GLOOP.*;
/**
 * Write a description of class Raumschiff here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class miniRaumschiff
{
  //GLZylinder körper;
  //GLKegel spitze;
  //GLZylinder zwischenraum;
  
  GLKugel körper;
  GLQuader lauf1;
  GLQuader lauf2;
  GLKugel kuppel;
  GLTorus luke;
  GLZylinder spitze;
  GLZylinder spitze2;
  GLTorus ring;

  
  public miniRaumschiff (){
   
   //körper =new GLZylinder(100,250,350,20,80);
   //körper.setzeSkalierung(3,3,1.5);
   
   
   //spitze =new GLKegel(100,250,200,20,80);
   //spitze.setzeSkalierung(4,4,1);
   
   //zwischenraum =new GLZylinder(100,250,290,20,80);
   //zwischenraum.setzeSkalierung(4,4,0.2);
   
   körper =new GLKugel(100,250,350,40);
   körper.setzeSkalierung(3,1,3);
   ring = new GLTorus(100,250,350,118,5);
   ring.setzeDrehung(90,0,0);
  
   kuppel = new GLKugel(100,275,350,40);
   
   luke = new GLTorus(100,283,350,40,10);
   luke.setzeDrehung(90,0,0);
   
   lauf1 =new GLQuader(50,250,250,30,30,80);
   lauf1.skaliere(0.6);
   
   lauf2 =new GLQuader(150,250,250,30,30,80);
   lauf2.skaliere(0.6);
   
   spitze =new GLZylinder(150,250,230,3,30);
   spitze2 =new GLZylinder(50,250,230,3,30);
   


   
   
   


 }
}