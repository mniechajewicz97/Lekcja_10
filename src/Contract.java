public class Contract extends Document implements Savable{
    public Contract(String title) {
        super(title);
    }
    @Override
    public void documentsDetails() {
        System.out.println("Contract obliges two sides");
    }
    @Override
    public void save(String  fileName) {
        System.out.println("Contract has been saved:" + fileName);
    }
}
