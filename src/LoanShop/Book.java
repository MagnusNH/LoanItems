package LoanShop;
// Subclass
public class Book extends Items {
    // Her laves en public attribute som trækker fra vores super class (Items)
    public Book(String title, String type) {
        super(title, type);
    }
    // Getters
    public String getTitle(){
        return title;
    }

    public String getType(){
        return type;
    }
    // Setters
    public String setTitle(){
        return title;
    }

    public String setType(){
        return type;
    }

    // Her laves en toString metode
    @Override
    public String toString() {
        return "Registered: " + type + " - " + title;
    }
}
