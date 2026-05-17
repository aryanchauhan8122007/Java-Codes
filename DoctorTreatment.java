class Doctor {
    void treat() {
        System.out.println("Doctor is treating patient...");
    }
}

class Surgeon extends Doctor {
    @Override
    void treat() {
        System.out.println("Surgeon is performing surgery 🏥");
    }
}

class Dentist extends Doctor {
    @Override
    void treat() {
        System.out.println("Dentist is checking teeth 🦷");
    }
}

class Cardiologist extends Doctor {
    @Override
    void treat() {
        System.out.println("Cardiologist is checking heart ❤️");
    }
}

class Pediatrician extends Doctor {
    @Override
    void treat() {
        System.out.println("Pediatrician is treating children 👶");
    }
}

public class DoctorTreatment {
    public static void main(String[] args) {

        Doctor d1 = new Surgeon();
        Doctor d2 = new Dentist();
        Doctor d3 = new Cardiologist();
        Doctor d4 = new Pediatrician();

        d1.treat();
        d2.treat();
        d3.treat();
        d4.treat();
    }
}
