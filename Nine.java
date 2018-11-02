package chapternine;
import java.io.*;

class Nine {
    public static void main(String [] args ) {
        // creating a new file object that will take arguments from command line
        File f = new File (args[0]); // test by putting "C:\wamp64\www\YourLegacy\HomePage\HTML.php" in command prompt when running code.
        System.out.println("File exist: "+ f.exists()); // to see if file/directory exist or not.
        System.out.println("File can be read: "+ f.canRead());
        System.out.println("File can be written: "+ f.canWrite());
        System.out.println("File can be executed: "+ f.canExecute());
        System.out.println("File name: "+ f.getName());
        System.out.println("Parent of file: "+ f.getParent());
        System.out.println("Path of file: "+ f.getPath());
        System.out.println("Hidden File: "+ f.isHidden());
        System.out.println("Length of the File: "+ f.length()); // returns long value to indicate length of file in bytes.
        System.out.println("Last modified time of file: "+ f.lastModified());
        System.out.println("Is it a File: "+ f.isFile());
        if(f.isDirectory()){
            System.out.println(f.getPath()+ " is a directory");
            // here we create a string that will be the files
            String l[] = f.list(); // We use list method to list all directories/files within directory, returing them as astring array in the process.
            // Here we create a new line wich will print our current directories name.
            System.out.println("\nDirectory listing for "+ f.getPath() + " is:");

            for(String a:l){ // for each loop to iterate across each element in the array.
                // here we attch the current file path with our "a".
                File f1 = new File(f.getPath()+ "/"+a); // file object is created for every file in the array
                if(f1.isDirectory()) {
                    System.out.println(a+ " is a directory");
                    f1 = null; // assigning null makes it eligible for garbage collection.
                } else {
                  System.out.println(a+ " is a File");
                  f1 = null;
                }
            }
        }


    }


}