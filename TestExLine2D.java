public class TestExLine2D {
        public static void main(String[] args) {
                Point2D p1 = new Point2D(10, 10);
                Point2D p2 = p1.clone(); // p2をクローン
                p2.setX(20); // p2のx座標を変更
                p1.print();
                p2.print();
                Line2D l1 = new Line2D(p1, p2);
                Line2D l2 = l1.clone(); // l1をクローン
                // l2の終点を(25,30)に変更
                l2.getP2().setX(25);
                l2.getP2().setY(30);
                l1.print();
                l2.print();

                
                // Point2D Pointp1 = new Point2D(10.0, 20.0);
                // Point2D Pointp2 = new Point2D(20.0, 30.0);
                // Line2D line = new Line2D(Pointp1, Pointp2);
                // line.print();
                // System.out.println("線分の長さ: " + line.length());
                // Line2D lineClone = line.clone();
                // Pointp1.setX(100);
                // Pointp1.setY(100);
                // Pointp2.setX(1000);
                // Pointp2.setY(1000);
                // // ここにp１，p２の値を変えるコードを打つ
                // line.print();
                // System.out.println("線分の長さ: " + line.length());
                // lineClone.print();
                // System.out.println("線分の長さ: " + lineClone.length());
                
        }
}