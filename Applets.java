package chaptertwelve;
// Importing the superclass applets. this allows our program to be a applet
import java.applet.*;
// importing the subclass of applets allowing for graphics class methods to be used.
import java.awt.*;

class Applets {
  public void paint(Graphics g){
    g.drawString("This is my first applet", 10, 10);
  }
}
