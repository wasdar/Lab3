// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    MovablePoint mp = new MovablePoint(1, 2);
    MovableCircle mc = new MovableCircle(3, new MovablePoint( 4, 5));
    mp.moveUp();
    mp.moveDown();
    mp.moveLeft();
    mp.moveRight();
    mc.moveUp();
    mc.moveDown();
    mc.moveLeft();
    mc.moveRight();
    System.out.println("Initial position:"+ mp);
    System.out.println("Initial position:"+ mc);
    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}