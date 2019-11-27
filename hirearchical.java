class Circle{
    double radius;
    void setRadius(double r){
        radius = r;
    }
}
class CArea extends Circle{
    void area(){
        double a=3.14*radius*radius;
        System.out.println(a);
    }
}
class CPerimeter extends Circle{
    void perimeter(){
        double p = 2*3.14*radius;
        System.out.println("Perimeter = "+p);
    }
}
class Hinterface{
    public static void main(String args[]){
        CArea ca = new CArea();
        ca.setRadius(5.7);
        ca.area();
        CPerimeter cp = new CPerimeter();
        cp.setRadius(4.8);
        cp.perimeter();
    }
}