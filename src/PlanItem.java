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
    public void markCompleted() {
        this.completed = true;
    }

    public boolean isCompleted() {
        return completed;
    }

    public int getDurationHours() {
        return durationHours;
    }

    public int calculateUrgency() {
        return daysUntil;
    }

    public String getDetails() {
        return title + " | Days left: " + daysUntil;
    }

    @Override
    public String toString() {
        return getDetails() +
                " | Duration: " + durationHours + "h" +
                " | Completed: " + completed;
    }
}
