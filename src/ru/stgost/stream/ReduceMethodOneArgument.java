package ru.stgost.stream;

import java.util.List;

public class ReduceMethodOneArgument {
    public static Integer reduce(List<Integer> list) {
        return list.stream().reduce((x, y) -> x * y).get();
    }
}
