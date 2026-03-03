public class Assignment extends PlanItem {

    private String course;

    public Assignment(String title, int daysUntil, int durationHours, String course) {
        super(title, daysUntil, durationHours);
        this.course = course;
    }

    @Override
    public String getDetails() {
        return "[ASSIGNMENT] " + course + " | " + super.getDetails();
    }
}
