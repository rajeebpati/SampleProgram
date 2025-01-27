package samples;

class Fruit {
    public static void smell() {
        System.out.println("Fruit smell");
    }

    private void taste() {
        System.out.println("Fruit private Test");
    }

    protected void color() {
        System.out.println("Fruit protected color");
    }

}

class Apple extends Fruit{

}

class GreenApple extends Apple {

}

public class FruitHirarchyTest {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        Apple apple = new Apple();
        fruit.smell(); // static members Can be accessed by reference
        //fruit.taste();// Can not access private methods outside the class
        fruit.color(); // own class and Chield calss object only can access
        apple.color();

        Fruit myfruite2 = new GreenApple();

        myfruite2.smell(); //Call Fruit's smell method
        //myfruite2.taste();  // Can not access
        myfruite2.color();  // Calls Fruit color ** will work

    }
}
