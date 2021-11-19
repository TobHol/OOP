package oop.practica.practicum2;

public class Swimmingpool {
    private double width;
    private double length;
    private double depth;

    public static void main(String[] args) {

    }

    public Swimmingpool(double width, double length, double depth){
        this.width = width;
        this.length = length;
        this.depth = depth;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setLength(double length){
        this.length = length;
    }

    public void setDepth(double depth){
        this.depth = depth;
    }

    public double getWidth(){
        return width;
    }
    public double getlength(){
        return length;
    }
    public double getDepth(){
        return depth;
    }

    public double getVolume(){
        return length * depth * width;
    }

    public String toString(){
        String s = String.format(" This swimmingpool is %1f meters in width, %1f meters in length and %1f meters deep", this.width, this.length, this.depth);
        return s;
    }

}
