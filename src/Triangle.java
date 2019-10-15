public class Triangle extends Shape {
    public Triangle(){
        this.shapeName = "Triangle";
    }
    public void draw(){
        System.out.println("Drawing " + shapeName);
    }
    public void erase(){
        System.out.println("Erasing " + shapeName);
    }
}
