import java.util.ArrayList;
import java.util.List;

public class Exercise {
    private String name;
    private String description;
    private ExerciseType type;
    private boolean unilateral = false;
    private double PRweight;
    private int PRreps;
    private List<Entry> history = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(ExerciseType type) {
        this.type = type;
    }

    public void setUnilateral(boolean unilateral) {
        this.unilateral = unilateral;
    }

    public double getPRweight() {
        return PRweight;
    }

    public int getPRreps() {
        return PRreps;
    }
}
