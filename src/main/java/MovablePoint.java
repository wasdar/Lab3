public class MovablePoint implements Movable{
  int x;
  int y;

  public MovablePoint(int x, int y){
    this.x = x;
    this.y = y;
  }

  public void moveUp(){
    this.y++;
  }

  public void moveDown(){
    this.y--;
  }

  public void moveLeft(){
    this.x--;
  }

  public void moveRight(){
    this.x++;
  }

  public String toString(){
    return "("+this.x+","+this.y+")";
  }
}