class ScoreCalculator {

    int totalScore(int math, int science) {
        return math + science;
    }

    int totalScore(int math, int science, int english) {
        return math + science + english;
    }

    int totalScore(int math, int science, int english, int history) {
        return math + science + english + history;
    }

    double average(int math, int science) {
        return (math + science) / 2.0;
    }

    double average(int math, int science, int english) {
        return (math + science + english) / 3.0;
    }
}

public class ScoreCalculator {
    public static void main(String[] args) {

        ScoreCalculator s = new ScoreCalculator();

        System.out.println("Total (2 subjects): " + s.totalScore(85, 90));
        System.out.println("Total (3 subjects): " + s.totalScore(85, 90, 78));
        System.out.println("Total (4 subjects): " + s.totalScore(85, 90, 78, 88));
        System.out.println("Average (2 subjects): " + s.average(85, 90));
        System.out.println("Average (3 subjects): " + s.average(85, 90, 78));
    }
}
