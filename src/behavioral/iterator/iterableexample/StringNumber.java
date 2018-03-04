package behavioral.iterator.iterableexample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringNumber implements Iterable<String>{
    List<String> stringList;

    public StringNumber() {
        this.stringList = new ArrayList<String>();
    }

    public void addStringNumebr(String stringNubmer) {
        this.stringList.add(stringNubmer);
    }

    @Override
    public Iterator<String> iterator() {
        return this.stringList.iterator();
    }
}
