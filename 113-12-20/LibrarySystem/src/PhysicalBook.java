public class PhysicalBook extends  Book{
    private  String shelfLocation;

    public  PhysicalBook(String title,String author ,String shelfLocation){
        super(title,author);
        this.shelfLocation =shelfLocation;
    }
}
