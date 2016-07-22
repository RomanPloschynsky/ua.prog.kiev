/**
 * Created by exite on 21.07.16.
 */
public class Line {
    private Point start;
    private Point finish;

    public Line(Point start, Point finish) {
        this.start = start;
        this.finish = finish;
    }

    public Line() {

    }


    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getFinish() {
        return finish;
    }

    public void setFinish(Point finish) {
        this.finish = finish;
    }

    public static Line makeRndmLine(int n) {
        Line line = new Line(Point.makeRndmPoint(n),Point.makeRndmPoint(n));
        return line;
    }

    public static void makeLinesArray(int n) {
        Line[] lines = new Line[n];
        for (int i = 0; i <n; i++) {
            lines[i] = makeRndmLine(n);
        }
    }

    public double getLineLength(Line line) {
        int startX = line.getStart().getX();
        int startY = line.getStart().getY();
        int finishX = line.getFinish().getX();
        int finishY = line.getFinish().getY();
        int lengthX = finishX - startX;
        int lengthY = finishY - startY;
        return Math.sqrt(Math.pow(lengthX,2) + Math.pow(lengthY,2));
    }


    public double getLinesLength(Line[] lines) {
        double linesLength = 0;
        for (int i = 0; i < lines.length; i++) {
            linesLength += getLineLength(lines[i]);
        }
        return linesLength;
    }

    public double getLongestLine(Line[] lines) {
        double lineLength = 0;
        for (int i = 0; i < lines.length; i++) {
            if (getLineLength(lines[i]) > lineLength) {
                lineLength = getLineLength(lines[i]);
            }

        }
        return lineLength;
    }



}
