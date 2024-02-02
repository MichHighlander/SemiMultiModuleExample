package com.example.baselib;

public enum LibType {
    LIB1("djiv4", "com.example.lib1.Lib1Class"),
    LIB2("djiv5","com.example.lib2.Lib2Class");

    private String flavorName;
    private String className;

    LibType(String flavorName, String className) {
        this.flavorName = flavorName;
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public static LibType findLibTypeByFlavor(String flavourName) throws RuntimeException {
        for (LibType libType : LibType.values()) {
            if (flavourName.contains(libType.flavorName)) {
                return libType;
            }
        }
        throw new RuntimeException("LibType not found for flavourName: " + flavourName);
    }
}
