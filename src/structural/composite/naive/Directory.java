package structural.composite.naive;

import java.util.ArrayList;
import java.util.List;

public class Directory {

    private String name;
    private List<File> files;
    private List<Directory> directories;

    public Directory(String name) {
        this.name = name;
        this.files = new ArrayList<File>();
        this.directories = new ArrayList<Directory>();
    }

    public void add(File file) {
        this.files.add(file);
    }

    public void add(Directory directory) {
        this.directories.add(directory);
    }

    public void info(String prefix) {

        System.out.println(prefix + this.name);

        for(File file: files)
            file.info(prefix + "\t");

        for(Directory directory: directories)
            directory.info(prefix + "\t");

    }
}
