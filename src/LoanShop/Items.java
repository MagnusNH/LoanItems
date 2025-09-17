package LoanShop;

public class Items {
    protected String title;
    protected String type;
    public int id;


    //Laver en Constructor
    public Items(String title, String type, int id) {
        this.title = title;
        this.type = type;
        this.id = id;
    }

    //Getters
    public String getTitle() {return title;}

    public String getType() {return type;}

    //Setters
    public void setTitle(String name) {this.title = name;
    }

    public void setType(String type) {this.type = type;
    }

    public String toString() {
        //toString så det ser lækkert ud
        return id + "\t" + type + "\t" + title;
    }

}

