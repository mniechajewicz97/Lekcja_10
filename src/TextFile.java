public class TextFile extends FileResource implements Readable, Writable, Compressible {
    TextFile(String fileName) {
        super(fileName);
    }
    @Override
    public void compress() {
        System.out.println("Compressing...");
    }
    @Override
    public String write(String text) {
        return  getFileName() + " is writing...";
    }
    @Override
    public String read() {
        return  getFileName() + " is reading...";
    }
}
