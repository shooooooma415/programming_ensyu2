public class Point2D {
    private double x; // x座標を保持
    private double y; // y座標を保持

    public Point2D(double x, double y) {
        this.x = x;// クラスのフィールド変数の変数 x をローカル変数として参照されるように
        this.y = y;// クラスのフィールド変数の変数 y をローカル変数として参照されるように
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void print() {
        System.out.println("(" + this.x + ", " + this.y + ")");
    }

    public Point2D clone() {
        return new Point2D(x, y);
    }

    public boolean equals(Point2D p2) {
        if (this.x == p2.x) {
            if (this.y == p2.y) {
                return true;
            }
        }
        return false;
    }
}