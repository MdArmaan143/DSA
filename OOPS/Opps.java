package OOPS;

public class Opps {
    public static void main (String args[]){
      
        pen p1 = new pen(); // we created a pen object called p1
        p1.color = "blue";
        p1.setColor("red");
        System.out.println(p1.color);

    

    }
    
}


class pen {
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}
