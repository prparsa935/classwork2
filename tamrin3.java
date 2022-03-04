import java.util.Scanner;

public class tamrin3 {
    private static int a;

    static class Machine{
        public float a;
        public float b;
        public float e;
        public float c;
        public float d;
        public float f;
        public Machine(float a,float b,float e,float c,float d,float f){
            this.a=a;
            this.b=b;
            this.e=e;
            this.c=c;
            this.d=d;
            this.f=f;
        }
        public void resolve(){
            if((this.a*this.d)-(this.b*this.c)!=0){
                System.out.println("x="+((this.e*this.d)-(this.b*this.f))/((this.a*this.d)-(this.b*this.c)));
                System.out.println("y="+((this.a*this.f)-(this.e*this.c))/((this.a*this.d)-(this.b*this.c)));


            }
            else{
                System.out.println("it cant be resolved");
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float a,b,e,c,d,f;
        System.out.print("a: ");
        a=sc.nextFloat();
        System.out.print("b: ");
        b=sc.nextFloat();
        System.out.print("e: ");
        e=sc.nextFloat();
        System.out.print("c: ");
        c=sc.nextFloat();
        System.out.print("d: ");
        d=sc.nextFloat();
        System.out.print("f: ");
        f=sc.nextFloat();
        Machine Mc=new Machine(a,b,e,c,d,f);
        Mc.resolve();

    }
}
