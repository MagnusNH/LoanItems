package LoanShop;

public class Items {
    protected String name;
    protected String type;

    //Laver en Constructor
    Items(String name, String type ) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }
    public String getType() {
            return type;
    }
public void SetName(String name){this.name = name;}
public void SetType(String type){this.type = type;}
}
