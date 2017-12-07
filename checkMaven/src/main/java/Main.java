import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List dirFiles=new ArrayList<String>();
    public static void main(String[] args) {
        showTree("C:\\Users\\oleg_slepichev\\IdeaProjects\\practice", 0);
        for (int i=0;i<dirFiles.size();i++) {
            System.out.println(dirFiles.get(i));
        }
    }
    public static void showTree(final String dirName, final int nest){
        File dir = new File(dirName);
        if (!dir.isDirectory()){
            return;
        }
        File files[] = dir.listFiles();
           for (File file : files){
            if (file.isDirectory()){
                showTree(file.getAbsolutePath(), nest + 1);
            }
            else {
                if (file.getName().endsWith("java")) {
                    dirFiles.add(file.getAbsolutePath());
                }
            }
        }
    }
}
