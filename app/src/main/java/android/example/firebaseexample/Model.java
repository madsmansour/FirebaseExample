package android.example.firebaseexample;

import java.util.ArrayList;
import java.util.Observable;

public class Model extends Observable {

    private ArrayList<String> lines = new ArrayList<>();

    public void addLine(String line) {
        lines.add(line);
        setChanged();
        notifyObservers();
    }

    public String getLastLine (){
        return lines.get(lines.size()-1);
    }


}
