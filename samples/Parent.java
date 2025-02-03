package samples;
class Parent {

    public Parent() {
        this("construtor");
        System.out.println("Parent class default constructor");
    }

    public Parent(String message) {
        System.out.println("Parent class parameterized " + message);
    }
}

class Child extends Parent {
    public Child() {
        this("construtor");
        System.out.println("Child class default constructor");
    }

    public Child(String message) {
        System.out.println("Child class parameterized " + message);
    }
}
