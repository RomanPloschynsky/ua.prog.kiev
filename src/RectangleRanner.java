/**
 * Created by exite on 19.07.16.
 */
public class RectangleRanner {

    public static void getMssgFromRectangles (int n) {
        try {
            int hight = 0;
            int width = 0;
            int square = 0;
            for (int i = 0; i < n; i++) {
                hight = (int) (100*Math.random());
                width = (int) (100*Math.random());
                square += Rectangle.getSquare(hight,width);
                System.out.println("I'm rectangle №" + i+1 + ". My hight is " + hight + "and my width is " + width + ".");
                Rectangle.reportPerimeter(hight,width);
                Rectangle.reportSquare(hight,width);
            }
            System.out.println("And all our Squares = " + square);
        }
        catch(NumberFormatException exept) {
            System.out.println("The number of Rectangles should be Integer!");
        }

    }

}
