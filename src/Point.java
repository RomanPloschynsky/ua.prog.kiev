/**
 * Created by exite on 21.07.16.
 */
public class Point {
    private int x = 0;
    private int y = 0;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static int makeRndmNmbr(int n) {
        return (int) (n*Math.random());
    }

    public static Point makeRndmPoint(int n) {
        Point point = new Point(makeRndmNmbr(n),makeRndmNmbr(n));
        return point;
    }
}
