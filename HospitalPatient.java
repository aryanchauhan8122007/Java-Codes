class HospitalPatient {

    private String patientName;
    private int age;
    private double temperature;

    public void setPatientName(String name) {
        this.patientName = name;
    }

    public void setAge(int age) {
        if(age > 0 && age < 150) {
            this.age = age;
        } else {
            System.out.println("Invalid age! ❌");
        }
    }

    public void setTemperature(double temperature) {
        if(temperature > 90 && temperature < 110) {
            this.temperature = temperature;
        } else {
            System.out.println("Invalid temperature! ❌");
        }
    }

    public String getPatientName() { return patientName; }
    public int getAge() { return age; }
    public double getTemperature() { return temperature; }
}

public class HospitalPatient {
    public static void main(String[] args) {

        HospitalPatient p = new HospitalPatient();
        p.setPatientName("Rahul");
        p.setAge(25);
        p.setTemperature(98.6);
        p.setAge(-5);         // invalid
        p.setTemperature(200); // invalid

        System.out.println("Name: " + p.getPatientName());
        System.out.println("Age: " + p.getAge());
        System.out.println("Temperature: " + p.getTemperature());
    }
}
