package chapternine;
import java.io.*;

class NineZero {
    public static void main(String [] args) {
        if (args.length != 2) {
            System.out.println();
            System.exit(0);
        }
        // Here we create a new file object which takes arguments from command line.
        File f = new File(args[0]);
        byte[] b = {};

        if (f.exist()){
            FileInputStream f1 = new FileImputStream(f);
            int num = f1.available();
            b = new byte[num];
            int n = f1.read(b);
            String s = new String(b);
            System.out.println("Contents of "+args[0]+ ":"+s);
            f1.close();
            f = null;
        } else {
            System.out.println("File does not exist");
            System.exit(0);
        }
    if(!f.exists()) {
            System.out.println(args[1]+"is a New file");
    }
    }
}