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
  GLKugel kuppel;
  GLQuader flügel1;
  GLQuader flügel2;
  GLKugel accessoire1;
  GLKugel accessoire2;
  //GLQuader vordererQuader1;
  //GLQuader vordererQuader2;
  GLQuader hinterteil;
  GLKegel langesHinterteil1;
  GLKegel langesHinterteil2;
  GLKegel langesVorderteil1;
  GLKegel langesVorderteil2;
  GLTorus luke;
  GLTorus ring;
  GLTextur meineTextur;
  
  public Raumschiff (){
   GLTextur meineTextur = new GLTextur("RaumschiffTextur.jpg");
   
   körper = new GLKugel(0,0,0,50);
   körper.setzeSkalierung(3,1,3);
   körper.setzeTextur(meineTextur);
   
   ring = new GLTorus(0,5,0,150,5);
   ring.setzeDrehung(90,0,0);
   ring.setzeTextur(meineTextur);
   
   flügel1 = new GLQuader(100,0,100,70,40,150);
   flügel1.setzeTextur(meineTextur);
   flügel2 = new GLQuader(-100,0,100,70,40,150);
   flügel2.setzeTextur(meineTextur);
   
   accessoire1 = new GLKugel(100,0,100,35);
   accessoire1.setzeTextur(meineTextur);
   accessoire2 = new GLKugel(-100,0,100,35);
   accessoire2.setzeTextur(meineTextur);
   
   hinterteil = new GLQuader(0,0,-100,100,80,100);
   hinterteil.setzeTextur(meineTextur);
   
   langesHinterteil1 = new GLKegel(0,0,-300,40,300);
   langesHinterteil1.setzeTextur(meineTextur);
   
   langesHinterteil2 = new GLKegel(0,0,-300,40,200);
   langesHinterteil2.setzeTextur(meineTextur);
   
   langesVorderteil1 = new GLKegel(100,0,275,20,200);
   langesVorderteil1.setzeDrehung(180,0,0);
   langesVorderteil1.setzeTextur(meineTextur);
   
   langesVorderteil2 = new GLKegel(-100,0,275,20,200);
   langesVorderteil2.setzeDrehung(180,0,0);
   langesVorderteil2.setzeTextur(meineTextur);
   
   luke = new GLTorus(0,50,0,50,10);
   luke.setzeDrehung(90,0,0);
   luke.setzeTextur(meineTextur);
   
   kuppel = new GLKugel(0,40,0,50);
   kuppel.setzeTextur("Glas.jpg");
   
   //vordererQuader1 = new GLQuader(-100,0,150,40,40,40);
   
   accessoire1 = new GLKugel(100,0,100,25);
   accessoire1.setzeTextur(meineTextur);
   
   accessoire2 = new GLKugel(-100,0,100,25);
   accessoire2.setzeTextur(meineTextur);
   
   
      

 }
}