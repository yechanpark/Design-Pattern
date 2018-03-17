package behavioral.iterator.iterableexample;

import java.util.Iterator;

public class StringNumberPrinter {
    StringNumber stringNumber;

    public void setStringNumber(StringNumber stringNumber) {
        this.stringNumber = stringNumber;
    }

    public void print() {
        // Using Advanced - For : need "? implements Iterable"
        for(String string : stringNumber){
            System.out.println(string);
        }

        // Using Iterator
        Iterator iterator = stringNumber.iterator();
        while(iterator.hasNext()) {
            String string = (String)iterator.next();
            System.out.println(string);
        }
    }
}
