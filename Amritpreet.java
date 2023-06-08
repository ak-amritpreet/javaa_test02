interface InterfaceOne {
    void UpdateGear(int gear);
}

interface InterfaceTwo {
    void Accelerate(int speed);
}

interface InterfaceThree {
    void PushBrake(int brake);
}

class Car implements InterfaceOne, InterfaceTwo, InterfaceThree {
    private int gear;
    private int speed;
    private int brake;

    public void UpdateGear(int gear) {
        this.gear = gear;
    }

    public void Accelerate(int speed) {
        this.speed = speed;
    }

    public void PushBrake(int brake) {
        this.brake = brake;
    }

    public int CurrentSpeed() {
        return speed - brake;
    }

    public void DisplayState() {
        System.out.println("Car present state:");
        System.out.println("Gear: " + gear);
        System.out.println("Speed: " + CurrentSpeed());
        System.out.println("Brake: " + brake);
    }
}

class Truck implements InterfaceOne, InterfaceTwo, InterfaceThree {
    private int gear;
    private int speed;
    private int brake;

    public void UpdateGear(int gear) {
        this.gear = gear;
    }

    public void Accelerate(int speed) {
        this.speed = speed;
    }

    public void PushBrake(int brake) {
        this.brake = brake;
    }

    public int CurrentSpeed() {
        return speed - brake;
    }

    public void displayState() {
        System.out.println("Truck present state:");
        System.out.println("Gear: " + gear);
        System.out.println("Speed: " + CurrentSpeed());
        System.out.println("Brake: " + brake);
    }
}

public class Amritpreet {
    public static void main(String[] args) {
        Car c1 = new Car();
        Truck t1 = new Truck();

        c1.UpdateGear(2);
        c1.Accelerate(1);
        c1.PushBrake(2);
        c1.DisplayState();

        t1.UpdateGear(1);
        t1.Accelerate(1);
        t1.PushBrake(3);
        t1.displayState();
    }
}
