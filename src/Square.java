public class Square extends Shape {
    public Square(){
        this.shapeName = "Square";
    }
    public void draw(){
        System.out.println("Drawing " + shapeName);
    }
    public void erase(){
        System.out.println("Erasing " + shapeName);
    }
}
