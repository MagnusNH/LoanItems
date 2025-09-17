package LoanShop;
//Subclass
public class Video extends Items{
    //Laver en public attribute som trækker fra vores super class (Items)
    public Video(String title, String type, int id){
        super(title,type,id);
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

}
