import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<PlanItem> planner = new ArrayList<>();

        planner.add(new Exam("Math Exam", 5, 3, "Mathematics"));
        planner.add(new Assignment("Java Project", 10, 5, "Programming"));
        planner.add(new Exam("Physics Test", 2, 2, "Physics"));

        for (PlanItem item : planner) {
            System.out.println(item);
        }
    }
}
