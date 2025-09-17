package LoanShop;

public class Items {
    protected String title;
    protected String type;

    //Laver en Constructor
    Items(String name, String type) {
        this.title = name;
        this.type = type;
    }

    //Getters
    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    //Setters
    public void SetName(String name) {
        this.title = name;
    }

    public void SetType(String type) {
        this.type = type;
    }

    //ToString
    public String toString() {
        return "";
    }
}

