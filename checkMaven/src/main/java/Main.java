import java.io.*;

public class Main {
    public static void main(String[] args) {
        showTree("D://practice", 0);

    }
    public static void showTree(final String dirName, final int nest){
        File dir = new File(dirName);
        if (!dir.isDirectory()){
            return;
        }
        StringBuilder whiteSpace = new StringBuilder();
        for (int i = 0; i < nest; i++){
            whiteSpace.append(' ');
        }
        File files[] = dir.listFiles();
        for (File file : files){
            System.out.println(whiteSpace.toString() + file.getName());
            if (file.isDirectory()){
                showTree(file.getAbsolutePath(), nest + 1);
            }
        }
    }
}
