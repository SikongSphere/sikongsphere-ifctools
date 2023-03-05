package org.sikongsphere.ifc.sdk.convert;

public interface Convertor<T> {
    T readFile(String path);
    void writeFile(T model, String path);
}
