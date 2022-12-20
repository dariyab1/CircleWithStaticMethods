public class Main {
    public static void main(String[] args) {
        CircleWithStaticMethods circle1 = new CircleWithStaticMethods();
        CircleWithStaticMethods circle2 = new CircleWithStaticMethods(5);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getCircumference());
        System.out.println(circle2.getArea());
        System.out.println(circle2.getCircumference());
        System.out.println(CircleWithStaticMethods.getNumberOfNonStaticCalls());
        System.out.println(CircleWithStaticMethods.getNumberOfStaticMethodCalls());
        System.out.println(CircleWithStaticMethods.getNumberOfObjects());
        CircleWithStaticMethods.printClassAndMethodInfo();
    }


}
