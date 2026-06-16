package com.personal.designPatterns.strategy.fileManager;

import java.io.File;

public class RarCompress implements ManageFile {
    @Override
    public void compressFile(File file) {
        System.out.println("Comprimiendo en formato RAR...");
    }
}
