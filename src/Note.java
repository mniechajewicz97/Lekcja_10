public class Note extends Document implements Printable {
    public Note(String title) {
        super(title);
    }

    @Override
    public void documentsDetails() {
        System.out.println("Note contains a message");
    }

    @Override
    public void print() {
        System.out.println(getTitle() + " has a screenshots!");
    }
}
