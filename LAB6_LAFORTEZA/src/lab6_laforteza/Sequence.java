package lab6_laforteza;

import java.util.*;

   
// Custom Generic Sequence Class
public class Sequence<T> implements Iterable<T> {
    private List<T> elements;

    public Sequence() {
        this.elements = new ArrayList<>();
    }

    // Add element to sequence
    public void add(T element) {
        elements.add(element);
    }

    // Retrieve element by index
    public T get(int index) {
        if (index < 0 || index >= elements.size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + elements.size());
        }
        return elements.get(index);
    }

    // Get size of sequence
    public int size() {
        return elements.size();
    }

    // Implement iterator support
    @Override
    public Iterator<T> iterator() {
        return new SequenceIterator();
    }

    // Inner Iterator Class
    private class SequenceIterator implements Iterator<T> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < elements.size();
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return elements.get(currentIndex++);
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Remove operation not supported");
        }
    }
}
