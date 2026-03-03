public class Exam extends PlanItem {

    private String subject;

    public Exam(String title, int daysUntil, int durationHours, String subject) {
        super(title, daysUntil, durationHours);
        this.subject = subject;
    }

    @Override
    public String getDetails() {
        return "[EXAM] " + subject + " | " + super.getDetails();
    }
}