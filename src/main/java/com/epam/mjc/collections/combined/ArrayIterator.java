package com.epam.mjc.collections.combined;

import java.util.Iterator;

class ArrayIterator<T> implements Iterator<T> {

    private final T[] array;
    private int index;

    public ArrayIterator(T[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        return null;
    }
}

