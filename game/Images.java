package mpjp.game;

import java.util.HashSet;
import java.util.Set;
import java.io.File;

public class Images {

    static java.io.File imageDirectory;

    //getter for the image directory

    public java.io.File getImageDirectory() {
        return imageDirectory;
    }

    //setter for the image directory

    public void setImageDirectory(java.io.File imageDirectory) {
        Images.imageDirectory = imageDirectory;
    }

    static java.util.Set<java.lang.String> extensions;

    //getter for the extensions

    public static java.util.Set<java.lang.String> getExtensions() {
        return extensions;
    }

    // add one extension

    public static void addExtension​(java.lang.String extension) {
        extensions.add(extension);
    }

    //get available images that can be used in MPJP puzzles

    static java.util.Set<java.lang.String> getAvailableImages(){
        if (imageDirectory == null) {
            imageDirectory = new File("test/mpjp/resources");
        }
        Set<String> available = new HashSet<>();
        for (String string : extensions) {
            for (String currFile : imageDirectory.list()) {
                if (currFile.contains(string)) {
                    available.add(currFile);
                }
            }
        }
        return available;

    }
}