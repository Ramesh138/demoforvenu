package demo.practice;


// Java Program to rename a file
import java.io.File;
import java.io.FileFilter;

public class Sample {
    public static void main(String[] args)
    {
        // Create an object of the File class
        File directoryPath = new File("D:\\OLD songs");
        //Creating a File object for directory

        FileFilter textFilefilter = new FileFilter(){
            public boolean accept(File file) {
                boolean isFile = file.isFile();
                if (isFile) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        //List of all the text files
        File filesList[] = directoryPath.listFiles(textFilefilter);
        System.out.println("List of the text files in the specified directory:");
        for(File file : filesList) {
            File file1 = new File(file.getAbsolutePath());

            String value =file.getAbsolutePath().replace("WAPTINY.COM","");
// File (or directory) with new name
            File file2 = new File(value);
            System.out.println("File name: "+file2);

        }
    }
        // Replace the file path with path of the directory
//        File file = new File("/home/mayur/Folder/GFG.java");

    }

