package pkg_car.java;

public class main {
    public static void main(String[] args) {
        car Tesla = new car("ModelS", 23, 222);
        System.out.println(Tesla.getModel());
        System.out.println(Tesla.getTankSize());
        System.out.println(Tesla.estimateDistance());
    }
}
