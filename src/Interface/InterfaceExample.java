package Interface;

interface WaterBottle {
    String color = "Blue"

    void fill();

    void pour();
}

interface MilkBottle {
    String s = "White";

    void coffee();

    void mix();
}

public class InterfaceExample implements WaterBottle, MilkBottle {
    public static void main(String[] args) {
        InterfaceExample interfaceExample = new InterfaceExample();
        System.out.println("Water");
        System.out.println("Colour of the bottle is: " + interfaceExample.color);
        interfaceExample.fill();
        interfaceExample.pour();
        System.out.println();
        System.out.println("Coffee");
        System.out.println("Colour of milk is: " + interfaceExample.s);
        interfaceExample.coffee();
        interfaceExample.mix();
    }

    public void fill() {
        System.out.println("Fill clean water");
    }

    public void pour() {
        System.out.println("Pour water");
    }

    public void coffee() {
        System.out.println("Fill coffee powder");
    }

    public void mix() {
        System.out.println("Mix coffee with milk");
    }
}
