package com.skillsoft.generics;

import java.util.List;

public class Utilities {

    public static void copy(List<Number> sourceList, List<Number> destList, int index) {
		
		destList.set(index, sourceList.get(index));

    }
}
