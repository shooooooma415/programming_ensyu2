public class TestEx0103 {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(0.0, 0.0);
        p1.setX(2.4);
        p1.setY(10.7);
        p1.print();
        Point2D p2 = p1.clone();
        p1.setX(100);
        p1.setY(100);
        p2.print();
        p1.print();
    }
}