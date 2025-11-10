import java.util.ArrayList;
import java.util.List;

public class History {
    List<Entry> history = new ArrayList<>();
    PersonalBest pr;

    public History(){}

    public void addEntry(Entry toAdd){
        prUpdater(toAdd);
        history.add(toAdd);
    }

    public void prUpdater(Entry entry){
        if(pr == null){
            pr = (PersonalBest) entry;
        }
        else{
            if(pr.getWeight() < entry.getWeight()){
                pr = (PersonalBest) entry;
            }
        }
    }
}
