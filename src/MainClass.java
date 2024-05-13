public class MainClass {
    public static class Circle {
        double radius;
        double length;
    }
    public static class Calculator {
        public static void calculateCircleLength(Circle par) {
            par.length = 2 * 3.14 * par.radius;
        }
    }
    public static void main(String[] args) {
        Circle parametr = new Circle();
        parametr.radius = 12;
        Calculator.calculateCircleLength(parametr);
        System.out.println(parametr.length);
    }
}
