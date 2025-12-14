// Superclass
package Test004oopsconcepts2;

abstract class Test015Vehicle {
    abstract void startEngine();
    void stopEngine() {
        System.out.println("Vehicle engine stopped.");
    }
}

// Subclass
class Test016car extends Test015Vehicle {
    @Override
    void startEngine() {
        System.out.println("Car engine started.");
    }

    // Method specific to Test016car
    void playRadio() {
        System.out.println("Playing radio in the car.");
    }
}
