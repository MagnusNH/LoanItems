package LoanShop;
// Subklasse
public class Book extends Items {

    public Book(String title, String type) { super(title, type); }

    public String getTitle(){
        return title;
    }

    public String getType(){
        return type;
    }

    public String setTitle(){
        return title;
    }

    public String setType(){
        return type;
    }

    // toString metode
    @Override
    public String toString() {
        return "Registered: " + type + " - " + title;
    }
}
