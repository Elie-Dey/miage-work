import java.nio.file.Path;

public class Main {

    public static void main(String[] args) throws Exception {
      DirMonitor dir = new DirMonitor(Path.of("C:\\Users\\deyer\\OneDrive\\Bureau\\DOS TES"));
        //DirMonitor dir = new DirMonitor(Path.of(null));
//        dir.affichage(Path.of("C:\\Users\\deyer\\OneDrive\\Bureau"));
       System.out.println("============");
    dir.sizeOfFiles();
       System.out.println("============");
     System.out.println(dir.mostRecent());
//     dir.affichage2();
        //dir.affichage3();
       // dir.affichage4(23);
        dir.affichage5(50);

    }

}
