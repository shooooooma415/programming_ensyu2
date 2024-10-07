public class TestLine2DVer2 {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(10, 20);
        Point2D p2 = new Point2D(30, 40);
        Point2D p3 = new Point2D(50, 60);
        Line2D l1 = new Line2D(p1, p2);
        l1 = l1.clone();
        Line2D l2 = new Line2D(p1, p2);
        Line2D l3 = new Line2D(p1, p3);
        Line2D l4 = new Line2D(p2, p1);
        System.out.println("l1, l2 = " + l1.equals(l2));
        System.out.println("l2, l1 = " + l2.equals(l1));
        System.out.println("l1, l3 = " + l1.equals(l3));
        System.out.println("l1, l4 = " + l1.equals(l4));
    }
}