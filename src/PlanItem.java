public class PlanItem {

    protected String title;
    protected int daysUntil;
    protected int durationHours;
    protected boolean completed;

    public PlanItem(String title, int daysUntil, int durationHours) {
        this.title = title;
        this.daysUntil = daysUntil;
        this.durationHours = durationHours;
        this.completed = false;
    }
}
