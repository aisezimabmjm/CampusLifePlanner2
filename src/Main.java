import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<PlanItem> planner = new ArrayList<>();

        planner.add(new Exam("Math Exam", 5, 3, "Mathematics"));
        planner.add(new Assignment("Java Project", 10, 5, "Programming"));
        planner.add(new Exam("Physics Test", 2, 2, "Physics"));

        // Mark first item as completed
        planner.get(0).markCompleted();

        // Display all items
        for (PlanItem item : planner) {
            System.out.println(item);
        }

        // Find most urgent item
        PlanItem mostUrgent = planner.get(0);
        for (PlanItem item : planner) {
            if (item.calculateUrgency() < mostUrgent.calculateUrgency()) {
                mostUrgent = item;
            }
        }

        System.out.println("\nMost urgent item:");
        System.out.println(mostUrgent);

        // Calculate total remaining hours
        int totalHours = 0;
        for (PlanItem item : planner) {
            if (!item.isCompleted()) {
                totalHours += item.getDurationHours();
            }
        }

        System.out.println("\nTotal remaining hours: " + totalHours);
    }
}
