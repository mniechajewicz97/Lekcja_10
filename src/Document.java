public abstract class Document {
    private String title;
    public Document(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public void documentsDetails() {

    }
    public String toString() {
        return title;
    }
}
