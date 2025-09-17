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
    public String getTitle() {return title;}

    public String getType() {return type;}

    //Setters
    public void setTitle(String name) {this.title = name;
    }

    public void setType(String type) {this.type = type;
    }

    //ToString
    @Override
    public String toString() {
        return getType() + " " + "(" + getTitle() + ")";
    }
}

