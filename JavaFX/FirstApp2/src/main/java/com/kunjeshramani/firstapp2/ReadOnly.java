package com.kunjeshramani.firstapp2;

import javafx.beans.property.ReadOnlyIntegerProperty;
import javafx.beans.property.ReadOnlyIntegerWrapper;

public class ReadOnly {
    public static void main(String[] args) {
        // Java ReadOnly Integer
        ReadOnlyIntegerWrapper numProperty = new ReadOnlyIntegerWrapper(100);
        ReadOnlyIntegerProperty num = numProperty.getReadOnlyProperty();

        System.out.println(num.get()); // 100
        System.out.println(num.getClass().getSimpleName()); // ReadOnlyPropertyImpl



        numProperty.set(500); // If 1 changes, other change automatically => sync
        System.out.println(num.get()); // 500


    }


}
