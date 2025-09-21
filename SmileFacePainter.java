import org.code.neighborhood.*;

public class SmileFacePainter2 extends PainterPlus{
  /* - paints both the eyes 
     - uses loops to condense code
  */
  public void paintEyes(String color){
      // moves to start
    
    for (int i = 0; i<7; i++){
    move();
  }
  turnRight();
  for (int i = 0; i<7; i++){
    move();
  }

    // paints the first eye
for (int i = 0; i<2; i++){
    for (int j = 0; j<4; j++){
    move();
    paint(color);
  }
  move();
  turnLeft();
  move();
  turnLeft();
  for (int h = 0; h<4; h++){
    move();
    paint(color);
  }

  move();
  turnRight();
  move();
  turnRight();

    
  }
    turnLeft();
    
    for (int k = 0; k<10; k++){
    move();
  }
  turnRight();
// paints the second eye
    for (int i = 0; i<2; i++){
    for (int j = 0; j<4; j++){
    move();
    paint(color);
  }
  move();
  turnLeft();
  move();
  turnLeft();
  for (int h = 0; h<4; h++){
    move();
    paint(color);
  }

  move();
  turnRight();
  move();
  turnRight();

    
  }

    
  }
  /* - paints the smile
     - uses loops to paint the main bar of the smile
  */
  public void paintSmile(String color){
    turnRight();
    move();
    move();
    move();
    turnLeft();

    // moves to starting position

    for (int u = 0; u<11; u++){
      move();
    }
    // right part of smile
    turnRight();
    paint(color);
    move();
    paint(color);
    turnLeft();
    move();
    turnRight();
    move();
    paint(color);
    move();
    turnLeft();
    move();
    turnRight();
    //paints bar of smile
    for (int g = 0; g<8; g++){
      paint(color);
      move();
    }
    // left part of smile
    paint(color);
    turnRight();
    move();
    turnLeft();
    move();
    paint(color);
    move();
    turnRight();
    move();
    turnLeft();
    paint(color);
    move();
    paint(color);
    move();
  }
}