public class Contract extends Document implements Savable{
    public Contract(String title) {
        super(title);
    }
    @Override
    public void documentsDetails() {
        System.out.println("Contract obliges two sides");
    }
    public void save(String fileName) {
    }
}
