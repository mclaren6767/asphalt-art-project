import org.code.neighborhood.*;

public class BackgroundPainter extends PainterPlus{
  /*  - Combines painting to the right and the left
    - alternates between them to create a background */
  public void paintBackground(String color){
    // loops it 15 times to fill up the 32x32 grid
    for (int i = 0; i<15; i++){
      rightMove(color);
      leftMove(color);
    }
    rightMove(color);
    while(canMove()){
   paint(color);
   move();
  }
  paint(color);

  }

/*  - Painter moves to the right painting everything in its path
 */
public void rightMove(String color){
  //paints the entire row a color
  while(canMove()){
   paint(color);
   move();
  }
  paint(color);
  turnRight();
  move();
  paint(color);
  turnRight();
  
}
/* - Painter moves to the right painting everything in its path, 
 */
public void leftMove(String color){
  //paints the entire row a color
  while(canMove()){
   paint(color);
   move();
  }
  paint(color);
  turnLeft();
  move();
  paint(color);
  turnLeft();
}
  
}

