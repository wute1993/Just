package com.wute.lib1;

public class MyClass {
    public static native void bsdiff(String oldPath,String newPath,String patchPath);
    static {
        System.loadLibrary("CTest");
    }
    public static void main(String[] args){
        bsdiff("D:/virtual studio/project/Ctest/CTest/x64/Release/","","");
    }
}
