package BehavioralPattern.IteratorGeneric;

import java.util.Iterator;

public class IterableArray implements Iterable<String>{
    String text[] = {"first","thcend","third","forth"};
    @Override
    public Iterator<String> iterator() {
        return new ArrayIterator();
    }
    private class ArrayIterator implements Iterator<String>
    {
        int index;
        @Override
        public boolean hasNext() {
            if(index<text.length)
            {
                return true;
            }
            return false;
        }

        @Override
        public String next() {
            if(hasNext())
            {
                return text[index++];
            }
            return null;
        }
    }
}
