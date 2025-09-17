package LoanShop;

public class Video extends Items{
    //Laver en public attribute som trækker fra vores super class (Items)
    public Video(String title, String type){
        super(title,type);
    }

    //Getters
    public String getTitle(){
        return title;
    }

    public String getType(){
        return type;
    }

    //Setters
    public String setTitle(){
        return title;
    }

    public String setType(){
        return type;
    }

    //Laver en toString metode
    @override
    public String toString(){
        return "Registered: " + type + " - " + title;
    }
}
