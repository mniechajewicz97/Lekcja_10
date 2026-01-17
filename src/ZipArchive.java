public class ZipArchive extends FileResource implements Readable, Compressible {
    public ZipArchive(String fileName) {
        super(fileName);
    }
    @Override
    public String read() {
        return  getFileName() + " is reading...";
    }
    @Override
    public void compress() {
        System.out.println(getFileName() + " is compressing...");
    }
}
