class Transport {
    void travel() {
        System.out.println("Travelling somewhere...");
    }
}

class Bus extends Transport {
    @Override
    void travel() {
        System.out.println("Travelling by Bus 🚌");
    }
}

class Train extends Transport {
    @Override
    void travel() {
        System.out.println("Travelling by Train 🚂");
    }
}

class Plane extends Transport {
    @Override
    void travel() {
        System.out.println("Travelling by Plane ✈️");
    }
}

public class Code6_Transport {
    public static void main(String[] args) {

        Transport t1 = new Bus();
        Transport t2 = new Train();
        Transport t3 = new Plane();

        t1.travel();
        t2.travel();
        t3.travel();
    }
}
