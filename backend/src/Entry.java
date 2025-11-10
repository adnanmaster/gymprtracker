public class Entry {
    private String date;
    private int reps;
    private int weight = 0;

    public Entry(String date, int reps, int weight) {
        this.date = date;
        this.reps = reps;
        this.weight = weight;
    }

    public int getReps() {
        return reps;
    }

    public int getWeight() {
        return weight;
    }

    public String getDate() {
        return date;
    }
}
