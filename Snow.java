//c:\program files\java\jre1.8.0_311\bin

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Snow extends Applet implements KeyListener
{
 int x=600,y=360;
 public void paint(Graphics g)
 {

  addKeyListener(this);
  setBackground(Color.gray);


  g.setColor(Color.WHITE);
  g.drawRoundRect(x,y,76,105,10,20);
  g.fillRoundRect(x,y,76,105,10,20);


//   g.setColor(Color.yellow);
//   g.drawRect(x+7,y+75,62,18);

  
//   g.setColor(Color.red);
//   g.drawOval(x+4,y+95,6,9); 
//   g.drawOval(x+66,y+95,6,9);
//   g.fillOval( x+4,y+95,6,9);
//   g.fillOval( x+66,y+95,6,9);


  g.setColor(Color.white);
  
  g.drawOval(x+10,y-60,60,60);
  g.fillOval(x+10,y-60,60,60);

  g.setColor(Color.black);
  g.drawOval(x+18,y-45,9,15);
  g.drawOval(x+45,y-45,9,15);
  g.fillOval(x+45,y-45,9,15);
  g.fillOval(x+18,y-45,9,15);

  g.setColor(Color.yellow);
  g.drawOval(x+4,y+1,9,15);
  g.drawOval(x+3,y+1,9,15);
  g.fillOval(x+63,y+1,9,15);
  g.fillOval(x+4,y+1,9,15);

 }
 public void keyPressed(KeyEvent ke){
    int KeyCode = ke.getKeyCode();

    switch(KeyCode)
    {
        case KeyEvent.VK_UP:
        if(y>0)
        y=y-1;
        break;
        case KeyEvent.VK_DOWN:
        if(y<getHeight()-105)
        y=y+1;
        break;
        case KeyEvent.VK_LEFT:
        if(x>0)
        x=x-1;
        break;
        case KeyEvent.VK_RIGHT:
        if(x<getWidth()-76)
        x++;
        break;
    }
    repaint();
 }

 public void keyTyped(KeyEvent ke) {
    
 } 

 public void keyReleased(KeyEvent ke){
 }


 

}

/*

<html>
<body>
<applet code="Snow" width=1200 height=720></applet>
</body>
</html>


*/

