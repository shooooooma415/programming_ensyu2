public class Line2D {
    private Point2D p1;
    private Point2D p2;
    public Line2D(Point2D p1,Point2D p2) {
       this.p1 = p1;
       this.p2 = p2;
   }
    public static void main(String[] args) {
       Point2D Pointp1 = new Point2D(10.0, 20.0);
       Point2D Pointp2 = new Point2D(20.0, 30.0);
       Line2D line = new Line2D(Pointp1, Pointp2);
       line.print();
      }
public Point2D getp1() { 
       return p1;
   }
    public Point2D getp2() {
       return p2;
   }
    public void setp1(Point2D p1){
       this.p1=p1;
   }
    public void setp2(Point2D p2){
       this.p2=p2;
   }
   public void print() {
    p1.print();System.out.print(" - ");p2.print();
   }
   public void length() {
    
   }
}