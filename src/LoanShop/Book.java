package LoanShop;
// Subclass
public class Book extends Items {
    // Constructor trækker fra vores super class (Items)
    public Book(String title, String type, int id) {
        super(title, type, id);
    }
    // Getters: bruges til hente enten title eller typen for bog eller video
    public String getTitle(){
        return title;
    }

    public String getType(){
        return type;
    }
    // Setters: bruges til ændre title eller typen for bog eller video
    public String setTitle(){
        return title;
    }

    public String setType(){
        return type;
    }
}
