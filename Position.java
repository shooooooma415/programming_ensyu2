/*
 * 位置
 */
public class Position {
    private int x;// X座標
    private int y;// Y座標

    /*
     * 位置を作成する
     * 
     * @param x x座標
     * 
     * @param y y座標
     */
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /*
     * X方向にxDeltaだけ移動する
     * ＠param xDelta X方向の移動量
     */
    public void moveX(int xDelta) {
        x += xDelta;
    }

    /*
     * Y方向にyDeltaだけ移動する
     * ＠param yDelta Y方向の移動量
     */
    public void moveY(int yDelta) {
        y += yDelta;
    }

    /*
     * X方向にxDelta，Y方向にyDeltaだけ移動する
     * 
     * @param xDelta X方向の移動量
     * 
     * @param yDelta Y方向の移動量
     */
    public void moveXY(int xDelta, int yDelta) {
        x += xDelta;
        y += yDelta;
    }

    /*
     * X座標を得る
     * 
     * @return X座標
     */
    public int getX() {
        return x;
    }

    /*
     * Y座標を得る
     * 
     * @return Y座標
     */
    public int getY() {
        return y;
    }

    /*
     * 位置を表す文字列を返す
     * 
     * @return 位置を表す文字列
     */
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}