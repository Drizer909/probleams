import javax.security.auth.login.CredentialException;
import java.util.Scanner;

class circle{
    public double radius ;
    circle(double rad){this.radius = rad;}
    public double getradius(){
        return radius;
    }
    public double getarea(){
        double area = (Math.PI)*radius*radius;
        return area;
    }
}
class cylinder extends circle{
    public double height;
    public void setvalue(){
        this.height = 0;
    }
    public double getheight(){
        return height;
    }
    cylinder(double rad,double hi){
        super(rad);
        if (hi<0){
            System.out.println("Your height is so small so the value is set to 0");
            setvalue();
        }else{
            this.height= hi;
        }

    }
    public double getarea(){
        double area = 2*Math.PI*this.radius*this.height+2*Math.PI*radius*radius;
        return area;
    }
    public double getvolume(){
        double vol = Math.PI*radius*radius*height;
        return vol;
    }
    
    
}
public class guess{
   public static void main(String[] args){
    Scanner input =  new Scanner(System.in);
    System.out.print("Enter the value of radius---");
    double value = input.nextDouble();
    System.out.print("Enter the height of cyclinder----");
    double h = input.nextDouble();
    System.out.println("choice 1 for circle and 2 for cylinder");
    int choice = input.nextInt();
    circle circle = new circle(value);
    cylinder cylinder =new cylinder(value, h);
    if (choice == 1){
    System.out.println("circle radius = "+ circle.getradius());
    double a = circle.getarea();
    System.out.println("circle.area = "+a);

}else if (choice == 2){
    System.out.println("cyclinder radius = "+cylinder.getradius());
    System.out.println("cyclinder height = "+ cylinder.getheight());
    System.out.println("cyclinder area = "+ cylinder.getarea());
    System.out.println("cyclinder volume = "+cylinder.getvolume());

}else{System.out.println("YOur enter wrond number in choice ");}
   }
}