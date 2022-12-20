public class CircleWithStaticMethods {

    /**
     * The number of nonstatic methods called (or used in the runner)
     */
    private static int numberOfNonStaticCalls=0;

    /**
     * The number of objects created
     */
    private static int numberOfObjects=0;

    /**
     * The number of static methods called (or used in the runner)
     */
    private static int numberOfStaticMethodCalls=0;

    /**
     * The radius of the circle
     */
    private double radius;

    /**
     * Constructs a circle with radius r
     */
    public CircleWithStaticMethods(){
        radius=1;
        numberOfObjects++;
    }

    /**
     * Constructs a circle with a specified radius
     * @param newRadius is the specified radius
     */
    public CircleWithStaticMethods(double newRadius){
        radius=newRadius;
        numberOfObjects++;
    }

    /**
     * Return the area of this circle
     * @return
     */
    public double getArea(){
        numberOfNonStaticCalls++;
        return Math.PI*Math.pow(radius, 2);
    }

    /**
     * Return the circumference of this circle
     * @return
     */
    public double getCircumference(){
        numberOfNonStaticCalls++;
        return Math.PI*2*radius;
    }

    /**
     * Return numberOfNonStaticMethodCalls
     * @return
     */
    public static int getNumberOfNonStaticCalls(){
        numberOfStaticMethodCalls++;
        return numberOfNonStaticCalls;
    }

    /**
     *Return numberOfObjects
     * @return
     */
    public static int getNumberOfObjects(){
        numberOfStaticMethodCalls++;
        return numberOfObjects;
    }

    /**
     * Return numberOfStaticCalls
     * @return
     */
    public static int getNumberOfStaticMethodCalls(){
        numberOfStaticMethodCalls++;
        return numberOfStaticMethodCalls;
    }

    /**
     * Reports the number of objects created, the number
     * of static method calls and the number of non-static
     * method calls
     */
    public static void printClassAndMethodInfo(){
        numberOfStaticMethodCalls++;
        String info="Number of objects: "+numberOfObjects;
        info+="\nNumber of Static Method Calls: "+numberOfStaticMethodCalls;
        info+="\nNumber of Non-Static Method Calls: "+numberOfNonStaticCalls;
        System.out.println(info);
    }

//why is this not saving
}
