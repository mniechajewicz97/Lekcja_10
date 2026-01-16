public class Invoice extends Document implements Printable, Savable{
    public Invoice(String title) {
        super(title);
    }

    @Override
    public void documentsDetails() {
        System.out.println("Invoice provides a cost of service");
    }
    @Override
    public void print() {
        System.out.println( getTitle() + " is printing!");
    }
    @Override
    public void save(String fileName) {
        System.out.println("The document has been saved: " + fileName);
    }

}
