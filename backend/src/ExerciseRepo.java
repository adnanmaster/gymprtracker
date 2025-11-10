import java.util.HashMap;
import java.util.Map;

public class ExerciseRepo {
    private Map<String, Exercise> repo = new HashMap<>();

    public ExerciseRepo(){}

    public void addExercise(Exercise newExercise){
        repo.put(newExercise.getName(), newExercise);
    }

    public void checkForDoubles(){

    }
}
