class SchoolTeacher {

    private String teacherName;
    private String subject;
    private int experienceYears;

    public void setTeacherName(String name) {
        this.teacherName = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setExperienceYears(int years) {
        if(years >= 0 && years <= 40) {
            this.experienceYears = years;
        } else {
            System.out.println("Experience must be between 0 and 40 years! ❌");
        }
    }

    public String getTeacherName() { return teacherName; }
    public String getSubject() { return subject; }
    public int getExperienceYears() { return experienceYears; }
}

public class SchoolTeacher {
    public static void main(String[] args) {

        SchoolTeacher t = new SchoolTeacher();
        t.setTeacherName("Mrs. Sharma");
        t.setSubject("Mathematics");
        t.setExperienceYears(15);
        t.setExperienceYears(100);  // invalid

        System.out.println("Teacher: " + t.getTeacherName());
        System.out.println("Subject: " + t.getSubject());
        System.out.println("Experience: " + t.getExperienceYears() + " years");
    }
}
