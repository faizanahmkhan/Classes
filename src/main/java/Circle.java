public class Circle {


    public double radius;


    public Circle (Double newRadius){
        this.radius = newRadius;

    }

    public Double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return 2 * this.radius * Math.PI;
        
    }



}
