class Car {
    public void m1() {
        System.out.println("car1()");
    }

    public void m2() {
        System.out.println("car2()");
    }

    public String toString() {
        return "vroom";
    }
}

class Truck extends Car {
    public void m1() {
        System.out.println("truck1()");
    }

    public void m2() {
        super.m1();
    }

    public String toString() {
        return super.toString() + super.toString();
    }
}

public class MonsterTruck extends Truck {
    public void m1() {
        System.out.println("monster1()");
    }

    public void m2() {
        super.m1();
        super.m2();
    }

    public String toString() {
        return "monster " + super.toString();

    }

    public static void main(String[] args) {

        MonsterTruck mn = new MonsterTruck();

        mn.m1();

        mn.m2();

        System.out.println(mn);

    }

}