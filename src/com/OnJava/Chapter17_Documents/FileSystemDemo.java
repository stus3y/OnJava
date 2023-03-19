package com.OnJava.Chapter17_Documents;

import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FileSystemDemo {
    static void show(String id, Object o) {
        System.out.println(id + " : " + o);
    }

    public static void main(String[] args) {
        System.out.println(System.getProperty("os.name"));
        FileSystem sys = FileSystems.getDefault();
        for (FileStore fileStore : sys.getFileStores()) {
            show("File Store", fileStore);
        }
        System.out.println("*************************************************************************************************************************************");
        for (Path rootDirectory : sys.getRootDirectories()) {
            show("Root Directory", rootDirectory);
        }
        System.out.println("*************************************************************************************************************************************");
        show("Separator", sys.getSeparator());
        System.out.println("*************************************************************************************************************************************");
        show("UsePrincipalLookupService", sys.getUserPrincipalLookupService());
        System.out.println("*************************************************************************************************************************************");
        show("isOpen", sys.isOpen());
        System.out.println("*************************************************************************************************************************************");
        show("isReadOnly", sys.isReadOnly());
        System.out.println("*************************************************************************************************************************************");
        show("FileSystemProvider", sys.provider());
        System.out.println("*************************************************************************************************************************************");
        show("File Attribute Views", sys.supportedFileAttributeViews());
    }
}
