import java.util.Scanner;

public class tamrin2 {

    public static void main(String[] args) {
        System.out.print("HM grade? ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        class student{
            public int[]grades=new int[n];
            public int[]zarayeb=new int[n];
            public student(int[] grades,int[] zarayeb){
                this.grades=grades;
                this.zarayeb=zarayeb;
            }
            public void moadel(){
                int Jame_Nomre=0,Jame_Zarayeb=0;
                for(int i=0;i<n;i++){
                    if(this.grades[i]>0&&this.zarayeb[i]>0){
                        Jame_Nomre+=this.grades[i]*this.zarayeb[i];
                        Jame_Zarayeb+=this.zarayeb[i];
                    }
                }
                System.out.println("moadele shoma: "+Jame_Nomre/Jame_Zarayeb); ;

            }
        }
        int[]grades=new int[n];
        int[]zarayeb=new int[n];
        int Vorudi=0;
        for(int i=0;i<n;i++){
            System.out.print("nomre: ");
            grades[i]= sc.nextInt();
            System.out.print("zarib: ");
            zarayeb[i]= sc.nextInt();

        }
        student Student_1=new student(grades,zarayeb);
        Student_1.moadel();
    }
}
