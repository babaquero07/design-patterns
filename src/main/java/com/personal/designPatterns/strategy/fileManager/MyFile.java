package com.personal.designPatterns.strategy.fileManager;

import java.io.File;

public class MyFile {
    private String filePath;
    private ManageFile compressMethod;

    public MyFile(String filePath, ManageFile compressMethod) {
        this.filePath = filePath;
        this.compressMethod = compressMethod;
    }

    public void compressFile() {
        compressMethod.compressFile(new File(this.filePath));
    }
}
