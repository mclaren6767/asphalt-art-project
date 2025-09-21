import org.code.neighborhood.*;

public class NeighborhoodRunner {
    public static void main(String[] args) {
      
        BackgroundPainter painterBackground = new BackgroundPainter();
        painterBackground.paintBackground("blue");
        SmileFacePainter2 painterSmile = new SmileFacePainter2();
        painterSmile.paintEyes("black");
        painterSmile.paintSmile("black");
    }
}