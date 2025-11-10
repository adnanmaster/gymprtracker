public class Exercise {
    private String name;
    private String description;
    private ExerciseType type;
    private boolean unilateral = false;
    private History history;

    public Exercise(){}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setType(ExerciseType type) {
        this.type = type;
    }

    public ExerciseType getType() {
        return type;
    }

    public void setUnilateral(boolean unilateral) {
        this.unilateral = unilateral;
    }

    public boolean getUnilateral(){
        return unilateral;
    }

    public History getHistory() {
        return history;
    }
}
