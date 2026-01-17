public abstract class FileResource {
    private String fileName;
  public FileResource(String fileName) {
        this.fileName = fileName;
    }
    public String getFileName() {
        return fileName;
    }
  public String toString() {
        return "This is a file resource for " + fileName;
    }
}
