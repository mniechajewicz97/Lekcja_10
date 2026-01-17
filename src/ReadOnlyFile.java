public class ReadOnlyFile extends FileResource implements Readable {
    public ReadOnlyFile(String fileName) {
        super(fileName);
    }
    @Override
    public String read() {
        return  getFileName() + " is reading...";
    }
}
