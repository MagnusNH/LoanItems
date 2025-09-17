package LoanShop;

public class Video extends Items{
    //Laver en public attribute som trækker fra vores super class (Items)
    public Video(String name, String type){
        super(name,type);
    }

    //Getters
    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    //Setters
    public String setName(){
        return name;
    }

    public String setType(){
        return type;
    }

    @override
    public String toString();
}
