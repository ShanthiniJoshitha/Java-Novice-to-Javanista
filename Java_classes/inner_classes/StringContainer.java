package inner_classes;

import java.util.Iterator;

public class StringContainer implements Iterable<String> {

    private String[] strings;
    private int index = 0;

    public StringContainer(String... strings) {
        this.strings = strings;
    }

    @Override
    public Iterator<String> iterator() {
        return new UpperCaseNamesIterator();
    }


    private class UpperCaseNamesIterator implements Iterator<String> {

        @Override
        public boolean hasNext() {
            return StringContainer.this.index < StringContainer.this.strings.length;
        }

        @Override
        public String next() {
            return StringContainer.this.strings[StringContainer.this.index++].toUpperCase();
        }
    }
}
