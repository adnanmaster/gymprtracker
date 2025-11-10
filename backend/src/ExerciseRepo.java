import java.util.HashMap;
import java.util.Map;

public class ExerciseRepo {
    private Map<String, Exercise> repo = new HashMap<>();

    public ExerciseRepo(){}

    public void addExercise(Exercise newExercise){

        String newName = newExercise.getName();
//        if(checkForDuplicates(newExercise)){
//            newName = newName + "1";
//        }
        repo.put(newName, newExercise);
    }

//    public boolean checkForDuplicates(Exercise newExercise){
//        boolean duplicate = false;
//        for(String key : repo.keySet()){
//            if(key.equals(newExercise.getName())){
//                duplicate = true;
//            }
//        }
//    }
}
