package com.thoughtworks.collection;

import org.apache.commons.lang3.NotImplementedException;

import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public double getAverage() {
        return arrayList.stream().reduce(0, Integer::sum).doubleValue() / arrayList.size();
    }

    public int getMaxValue() {
        return arrayList.stream().reduce(0, Integer::max);
    }

    public int getLastOdd() {
        return arrayList.stream().reduce(0, (lastOdd, item) -> item % 2 == 1 ? item : lastOdd);
    }
}
