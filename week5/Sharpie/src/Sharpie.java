public class Sharpie {
    String color;
    float width;
    float inkAmount;

    Sharpie (float width, String color){
        this.width = width;
        this.color = color;
        this.inkAmount = 100;
    }

    public void use () {
        this.inkAmount --;
    }

}
