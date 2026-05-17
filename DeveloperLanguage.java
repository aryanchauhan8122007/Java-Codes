class Developer {
    void code() {
        System.out.println("Developer is coding...");
    }
}

class JavaDeveloper extends Developer {
    @Override
    void code() {
        System.out.println("Java Developer is writing Java code ☕");
    }
}

class PythonDeveloper extends Developer {
    @Override
    void code() {
        System.out.println("Python Developer is writing Python code 🐍");
    }
}

class WebDeveloper extends Developer {
    @Override
    void code() {
        System.out.println("Web Developer is writing HTML, CSS and JS 🌐");
    }
}

class MobileDeveloper extends Developer {
    @Override
    void code() {
        System.out.println("Mobile Developer is building apps 📱");
    }
}

public class DeveloperLanguage {
    public static void main(String[] args) {

        Developer d1 = new JavaDeveloper();
        Developer d2 = new PythonDeveloper();
        Developer d3 = new WebDeveloper();
        Developer d4 = new MobileDeveloper();

        d1.code();
        d2.code();
        d3.code();
        d4.code();
    }
}
