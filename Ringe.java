import GLOOP.*;
    
public class Ringe {
    
    public static void main(String[] args) {
        // Erstelle die Kamera und das Licht
        GLKamera kamera = new GLKamera();
        GLLicht licht = new GLLicht();

        // Erstelle die Ringe
        GLTorus innereRinge = new GLTorus(0, 0, 0, 70, 5); // Mittelpunkt (0, 0, 0), Radius 70, Dicke 5
        innereRinge.setzeFarbe(1.0, 1.0, 0.0); // Setze die Farbe der inneren Ringe (z.B. gelb)

        GLTorus aeussereRinge = new GLTorus(0, 0, 0, 80, 10); // Mittelpunkt (0, 0, 0), Radius 80, Dicke 10
        aeussereRinge.setzeFarbe(1.0, 0.0, 0.0); // Setze die Farbe der äußeren Ringe (z.B. rot)

        // Animation der Ringe
        while (true) {
            innereRinge.drehe(0, 1, 0); // Drehe die inneren Ringe um die Y-Achse
            aeussereRinge.drehe(0, 1, 0); // Drehe die äußeren Ringe um die Y-Achse
            Sys.warte(50); // Warte 50 Millisekunden
        }
    }
}
    
