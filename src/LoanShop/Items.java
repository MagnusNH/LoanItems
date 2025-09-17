package LoanShop;

public class Items {
    protected String title;
    protected String type;
    public int[] id;


    //Laver en Constructor
    public Items(String title, String type, int id) {
        this.title = title;
        this.type = type;
        this.id = new int[]{id};
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

