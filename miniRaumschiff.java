import GLOOP.*;
/**
 * Write a description of class Raumschiff here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class miniRaumschiff
{
  GLKugel körper;
  GLQuader lauf1;
  GLQuader lauf2;
  GLKugel kuppel;
  GLTorus luke;
  GLZylinder spitze;
  GLZylinder spitze2;
  GLTorus ring;
  GLQuader heck;
  GLKegel hinterteil;
  GLKegel hinterteil2;
  GLQuader unterlauf;
  GLZylinder haltung;
  GLZylinder unterspitze;

  
  public miniRaumschiff (){
   GLTextur meineTextur = new GLTextur("RaumschiffTextur.jpg");
    

   körper =new GLKugel(100,250,-200,40);
   körper.setzeSkalierung(3,1,3);
   körper.setzeTextur(meineTextur);
   
   ring = new GLTorus(100,250,-200,118,5);
   ring.setzeDrehung(90,0,0);
   ring.setzeTextur(meineTextur);
  
   kuppel = new GLKugel(100,275,-200,40);
   kuppel.setzeTextur("Glas.jpg");
   
   luke = new GLTorus(100,283,-200,40,10);
   luke.setzeDrehung(90,0,0);
   luke.setzeTextur(meineTextur);
   
   lauf1 =new GLQuader(50,250,-85,30,30,80);
   lauf1.skaliere(0.6);
   lauf1.setzeTextur(meineTextur);
   
   lauf2 =new GLQuader(150,250,-85,30,30,80);
   lauf2.skaliere(0.6);
   lauf2.setzeTextur(meineTextur);
   
   spitze =new GLZylinder(150,250,-70,3,30);
   spitze.setzeTextur(meineTextur);
   spitze2 =new GLZylinder(50,250,-70,3,30);
   spitze2.setzeTextur(meineTextur);
   
   heck = new GLQuader(100,250,-300,50,50,50); 
   heck.setzeTextur(meineTextur);
   
   
   hinterteil = new GLKegel(100,250,-300,45,250);
   hinterteil.setzeTextur(meineTextur);
   
   hinterteil2 = new GLKegel(100,250,-430,40,350);
   hinterteil2.setzeSkalierung(0.5,0.5,0.5);
   hinterteil2.setzeTextur(meineTextur);
   
   
   unterlauf =new GLQuader(100,190,-160,10,10,50);
   unterlauf.setzeTextur(meineTextur);
   haltung =new GLZylinder(100,220,-178,3,50);
   haltung.setzeTextur(meineTextur);
   haltung.setzeDrehung(90,0,0);
   spitze =new GLZylinder(100,190,-145,3,30);
   spitze.setzeTextur(meineTextur);
   
   
   


 }
}