class UniversityStudent {

    String name;
    int rollNumber;
    String university;

    UniversityStudent(String name, int rollNumber, String university) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.university = university;
    }

    void attendClass() {
        System.out.println(name + " is attending class at " + university + " 📚");
    }

    void giveExam() {
        System.out.println(name + " (Roll: " + rollNumber + ") is giving exam 📝");
    }
}

class EngineeringStudent extends UniversityStudent {

    String branch;

    EngineeringStudent(String name, int rollNumber, String university, String branch) {
        super(name, rollNumber, university);
        this.branch = branch;
    }

    void doProject() {
        System.out.println(name + " is doing " + branch + " engineering project 🔧");
    }
}

class MedicalStudent extends UniversityStudent {

    String specialization;

    MedicalStudent(String name, int rollNumber, String university, String specialization) {
        super(name, rollNumber, university);
        this.specialization = specialization;
    }

    void doInternship() {
        System.out.println(name + " is doing " + specialization + " internship at hospital 🏥");
    }
}

public class UniversityStudentExample {
    public static void main(String[] args) {

        EngineeringStudent e = new EngineeringStudent("Rahul", 101, "IIT Mumbai", "Computer Science");
        e.attendClass();
        e.giveExam();
        e.doProject();

        System.out.println("----------");

        MedicalStudent m = new MedicalStudent("Priya", 202, "AIIMS Delhi", "Cardiology");
        m.attendClass();
        m.giveExam();
        m.doInternship();
    }
}
