import java.util.ArrayList;
import java.util.List;

public class History {
    List<Entry> history = new ArrayList<>();
    PersonalBest pr = new PersonalBest();

    public History(){}

    public void addEntry(Entry toAdd){
        history.add(toAdd);
    }

    public void updatePr(Entry entry){

    }


}
