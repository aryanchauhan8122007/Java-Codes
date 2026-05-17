class Student {

    private String name;
    private int marks;

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        if(marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Marks must be between 0 and 100! ❌");
        }
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

public class Code3_StudentMarks {
    public static void main(String[] args) {

        Student s = new Student();
        s.setName("Rahul");
        s.setMarks(85);
        s.setMarks(150);

        System.out.println(s.getName());
        System.out.println(s.getMarks());
    }
}
