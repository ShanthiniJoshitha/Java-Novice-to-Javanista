package com.skillsoft.generics;

import java.util.List;

public class Utilities {

    public static <T extends Number> void copy(List<T> sourceList, List<T> destList, int index) {
		
		destList.set(index, sourceList.get(index));

    }
}
