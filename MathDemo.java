public class MathDemo{
    public static void main(String[] args){

        double x1 = 17.2;
        double y1 = -8.5;
        double x2 = 5.6;
        double y2 = -2;
        int z =7;

        //absolute value

        System.out.println(Math.abs(y1));
       // System.out.println(abs(y1)); ONLY W/java.lang.Math

        //square root something

        double squareRoot = Math.sqrt(z);
        System.out.println(squareRoot); //integer argument is fine

        //use exponents
        double powerExample = Math.pow(7, 5);
        System.out.println("7 to the 5th power is: " + (int) powerExample);
        
        //find the sin, cos, and tan of an angle
        int angle1 = 60;
        double angle1InRad = Math.toRadians(angle1);
        System.out.println("The cos of 60 degrees is "+ Math.cos(angle1InRad));
        System.out.println("The true value is: 0.5");

        //convert to radians by multiplying by pi/180
        final double PI = Math.PI;
        double angle1InRad2  = angle1*(PI/180);
        System.out.println("The cos of 60 degrees is "+ Math.cos(angle1InRad2));
        System.out.println("The true value is: 0.5");

        //area of a circle
        double radius1 = 4.0;
        double area = PI* Math.pow(radius1, 2);
        System.out.println("The area of a circle with a radius of " +radius1 + " is " + area);






        
    }
}