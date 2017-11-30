import java.io.*;

//public class Main {
//    public static void main(String[] args) {
//        if(args.length > 0) {
//            for (int i = 0; i < args.length; i++) {
//                try (FileReader reader = new FileReader(args[i])) {
//                    BufferedReader bufferedReader= new BufferedReader(reader);
//                    int c = 0;
//                    while(bufferedReader.readLine()!=null) {
//                        c++;
//                    }
//                    System.out.print("lines in " + args[i] + " equally " + c);
//                    System.out.println();
//                    bufferedReader.close();
//                } catch (IOException ex) {
//
//                    System.out.println(ex.getMessage());
//                }
//            }
//        }
//        else System.out.println("No files selected");
//    }
//}

public class Main {

    public static void main(String[] args) {
        if (args.length>0) {
            for (int i=0; i < args.length; i++) {
                try (FileInputStream reader = new FileInputStream(args[i])) {
                    int c = 0;
                    int b=-1;
                    while ((b=reader.read())!=-1) {
                        if (b==13)
                            if (reader.read()==10)
                                c++;
                    }
                    if (c!=0) c++;
                    System.out.print("lines in " + args[i] + " equally " + c);
                    System.out.println();
                } catch (IOException ex) {

                    System.out.println(ex.getMessage());
                }
            }
        }
        else System.out.println("No files selected");
    }
}