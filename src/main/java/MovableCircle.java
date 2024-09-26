public class MovableCircle implements Movable{
  //int x;
  //int y;
  int radius;
  MovablePoint center;
 // center = new MovablePoint(x,y);
  
  public MovableCircle(int radius, MovablePoint center){
   
    this.radius = radius;
    this.center = center;
  }
  public void moveUp(){
    this.center.moveUp();
    
  }
  public void moveDown(){
    this.center.moveDown();
  }
  public void moveLeft(){
    this.center.moveLeft();
  }
  public void moveRight(){
    this.center.moveRight();
  }
  public String toString(){
    return "("+this.center+","+this.radius+")";
  }
}