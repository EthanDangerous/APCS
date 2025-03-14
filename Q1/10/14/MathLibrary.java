public class MathLibrary{
    private double pi;
    public void MathLibrary(){
        pi = 3.14;
    }
    public double areaCircle(double radiusIn){
       double area = pi * radiusIn * radiusIn;
       return area;
    }
    public double volCylinder(double radiusIn, double heightIn){
        double area = areaCircle(radiusIn);
        double volume = area * heightIn;
        return volume;
    }
    public double volCone(double radiusIn, double heightIn){
        double area = areaCircle(radiusIn);
        double volume = (area * heightIn)/3.0;
        return volume;
    }
}