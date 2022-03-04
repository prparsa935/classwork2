import java.util.Scanner;


public class tamrin1{
    public static class mostatil{
        public float width;
        public float height;
        public mostatil(float width,float height){
            this.width=width;
            this.height=height;
        }
        public void area(){
            System.out.println("masahat: "+this.width*this.height);
        }
        public void mohit(){
            System.out.println("mohit: "+2*(this.width+this.height));
        }}
    public static class moraba{
        public float zel;
        public moraba(float zel){
            this.zel=zel;

        }
        public void area(){
            System.out.println("masahat: "+this.zel*this.zel);
        }
        public void mohit(){
            System.out.println("mohit: "+ this.zel*4);
        }
    }


    public static void main(String[] args) {




        Scanner reader=new Scanner(System.in);
        System.out.println("$$mostatil$$");
        System.out.print("tool:");
        float a=reader.nextFloat();
        System.out.print("arz:");
        float b=reader.nextFloat();
        mostatil mostatil1=new mostatil(a,b);
        mostatil1.area();
        mostatil1.mohit();
        System.out.println("$$moraba$$");
        System.out.print("zel:");
        a=reader.nextFloat();
        moraba moraba1=new moraba(a);
        moraba1.mohit();
        moraba1.area();

}}

