import java.io.File;
public class Practical_36 {

    public static void main(String[] args) {
        String path = "C:\\Users\\jaina\\OneDrive\\Desktop\\Code\\PHP";
        File f1 = new File(path);

        Practical_36 obj = new Practical_36();
        if (f1.exists() && f1.isDirectory()) {
            File[] a1 = f1.listFiles();
            System.out.println();
            for (File file : a1) {
                if (file.isFile()) {
                    System.out.println("File name: " + file.getName());
                    System.out.println("Size: " + file.length() + " bytes");
                    System.out.println("Readable: " + file.canRead());
                    System.out.println("Writable: " + file.canWrite());
                    System.out.println("Executable: " + file.canExecute());
                    System.out.println("Hidden: " + file.isHidden());
                    System.out.println();
                }
            }
        }
    }
}

