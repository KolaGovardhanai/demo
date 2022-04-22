  class Circle{
    public  int radius; 
    public void setRadius(int r1){
    radius=r1;
   }
     public int getRadius(){
     return radius;
     }
     public double area(){
     return 3.14*radius*radius;
     }
     public static void main(String[] args)
     {
      Circle circle = new Circle();
      circle.setRadius(3);
     System.out.println("Area is "+ circle.area());
     }
   }