/**
 * Created by a.lyahovich on 01.06.2016.
 */
public class SquareMeter {

    public double getTriangleSquare(double triangleBottom, double triangleHeight){

        return (0.5*triangleBottom)*triangleHeight;
    }

    public double getRectangleSquare(double rectangleHeight, double rectangleWidth){

        return rectangleHeight*rectangleWidth;
    }
    public double getCircleSquare(double circleRadius){
        return Math.PI*(Math.pow(circleRadius,2));
    }

}
