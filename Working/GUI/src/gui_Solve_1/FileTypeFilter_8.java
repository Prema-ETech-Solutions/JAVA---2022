package gui_Solve_1;
import java.io.File;
import javax.swing.filechooser.FileFilter;
 
public class FileTypeFilter_8 extends FileFilter {
    private String extension;
    private String description;
 
    public FileTypeFilter_8(String extension, String description) {
        this.extension = extension;
        this.description = description;
    }
 
    public boolean accept(File file) {
        if (file.isDirectory()) {
            return true;
        }
        return file.getName().endsWith(extension);
    }
 
    public String getDescription() {
        return description + String.format(" (*%s)", extension);
    }
}