package LoanShop;

public class Items {
    protected String title;
    protected String type;

    //Laver en Constructor
    public Items(String title, String type) {
        this.title = title;
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

}

