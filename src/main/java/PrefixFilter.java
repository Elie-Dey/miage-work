import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

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
