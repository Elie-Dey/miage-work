import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Iterator;

import static java.nio.file.Files.newDirectoryStream;

/**
 * @author Elie
 */

public class DirMonitor {
    final private Path path;

    /**
     *
     * @param path
     * @throws IOException
     */
   public DirMonitor(Path path) throws IOException {
        if(path == null)
            throw new IOException();
           File file = new File(String.valueOf(path));
           this.path = path;
           if( !file.isDirectory() && !Files.isReadable(path))
               throw new IOException();
   }
    /**
     *
     * @param path
     * @throws IOException si le repertoire existe pas
     */
   public void affichage(Path path) throws IOException {
       try (DirectoryStream<Path> ds = newDirectoryStream(path)) {
           Iterator<Path> iterator = ds.iterator();
           while (iterator.hasNext()) {
               Path p = iterator.next();
               System.out.println(p);
           }
       }
   }

   // Affichage avec la classe prefix dans un autre fichier
//    public void affichage2() throws IOException {
//       PrefixFilter filter = new PrefixFilter(30);
//        try (DirectoryStream<Path> ds = newDirectoryStream(path, filter)) {
//            Iterator<Path> iterator = ds.iterator();
//            while (iterator.hasNext()) {
//                Path p = iterator.next();
//                System.out.println(p.getFileName());
//            }
//        } catch (IOException e){
//            e.printStackTrace();
//        }
//    }

//    public void affichage3() throws IOException {
//       PrefixFilter filter = new DirMonitor.PrefixFilter(30);
//        try (DirectoryStream<Path> ds = newDirectoryStream(path, filter)) {
//            Iterator<Path> iterator = ds.iterator();
//            while (iterator.hasNext()) {
//                Path p = iterator.next();
//                System.out.println(p.getFileName());
//            }
//        } catch (IOException e){
//            e.printStackTrace();
//        }
//    }
    public void applyAction(String prefix, MyAction action) throws  IOException {
       Path path = Path.of(prefix);
       if((path == null) || !Files.exists(path))
           throw new IOException();
       action.perform(path);

    }

    /**
     *
     * @param givenFileSize
     * @throws IOException
     */
    public void affichage5(int givenFileSize) throws IOException {
       MyAction act;
       applyAction(String.valueOf(path), act = new MyAction() {
                   @Override
                   public void perform(Path performPath) throws IOException {
                       PrefixFilter filter = new PrefixFilter(50);
                       DirectoryStream<Path> ds = newDirectoryStream(path, filter);
                       Iterator<Path> iterator = ds.iterator();
                       while (iterator.hasNext()) {
                           Path p = iterator.next();
                           System.out.println(p.getFileName());
                       }
                   }
               });
    }

    /**
     *
     * @param givenFileSize taille minimum du fichier
     * @throws IOException
     */
    public void affichage4(int givenFileSize) throws IOException {
        DirectoryStream.Filter<Path> filter = new DirectoryStream.Filter<Path>() {
            long minimumSizeOfFile = givenFileSize;
            @Override
            public boolean accept(Path entry) throws IOException {
                BasicFileAttributes attr = Files.readAttributes(entry, BasicFileAttributes.class);
                long sizeOfFile = attr.size();
                return (sizeOfFile >= minimumSizeOfFile);
            }
        };
        try (DirectoryStream<Path> ds = newDirectoryStream(path, filter)) {
            Iterator<Path> iterator = ds.iterator();
            while (iterator.hasNext()) {
                Path p = iterator.next();
                System.out.println(p.getFileName());
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }


    /**
     *
     *
     * @return la somme de la taille des fichiers présent dans le repo
     */
   public long sizeOfFiles() throws Exception {
       long sumOfOctet = 0l;
       File[] listOfFiles;
       // Creation de tableau de tous les fichier présent dans le directory path
       if(this.path == null)
           throw new IOException();

        try{
            listOfFiles = path.toFile().listFiles();

            for (int i = 0; i < listOfFiles.length; i++) {
                if(listOfFiles[i].isFile()){
                    System.out.println(listOfFiles[i].getName() + " est de taille de " + listOfFiles[i].length() + " octets" );
                    sumOfOctet = sumOfOctet + listOfFiles[i].length();
                }
            }
        } catch (Exception e){}
       return  sumOfOctet;


   }
   public File mostRecent(){
       // Creation de tableau de tous les fichier présent dans le directory path
       File[] listOfFiles = path.toFile().listFiles();
       if(this.path == null)
           throw  new NullPointerException("Path null");

       if(listOfFiles.length == 0) return null;
      File lastModifiedFile = listOfFiles[0];
       for (int i = 0; i < listOfFiles.length ; i++) {
           if (lastModifiedFile.lastModified() < listOfFiles[i].lastModified())
               lastModifiedFile = listOfFiles[i];
       }
       return lastModifiedFile;
   }

   public class PrefixFilter implements DirectoryStream.Filter<Path> {
           private long  minimumSizeOfFile;

           public PrefixFilter(int  givenMinimumSizeOfFile){
               minimumSizeOfFile = givenMinimumSizeOfFile;
           }
           @Override
           public boolean accept(Path entry) throws IOException {
               BasicFileAttributes attr = Files.readAttributes(entry,BasicFileAttributes.class);
               long sizeOfFile = attr.size();
               return (sizeOfFile > minimumSizeOfFile);
           }
       }

   }
