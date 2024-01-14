package com.example.baselib;

public enum LibType {
    LIB1("djiv4", "com.example.lib1.Lib1Class"),
    LIB2("djiv5","com.example.lib2.Lib2Class");

    private String buildTypeName;
    private String className;

    LibType(String buildTypeName, String className) {
        this.buildTypeName = buildTypeName;
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public static LibType findLibTypeByBuildType(String buildTypeName) throws RuntimeException {
        for (LibType libType : LibType.values()) {
            if (libType.buildTypeName.equals(buildTypeName)) {
                return libType;
            }
        }
        throw new RuntimeException("LibType not found for buildTypeName: " + buildTypeName);
    }
}
