import java.util.Scanner;
class Farmer{
    int pa;//principal amt
    float td;//time duration
    static float ri;//rate of interest
    float si;//simple interest

void input()
{
    Scanner scan=new Scanner(System.in);
    System.out.println("Please mention the amount required");
    pa=scan.nextInt();
    System.out.println("Please mention the time duration");
    td=scan.nextFloat();
    ri=8.5f;
}
void compute(){
    si=(pa*ri*td)/100f;
}
void display(){
    System.out.println("SI is : "+si);

}
}
public class StaticFarmProj {
    public static void main(String [] args)
    {
        Farmer f1=new Farmer();
        f1.input();
        f1.compute();
        f1.display();
        Farmer f2=new Farmer();
        f2.input();
        f2.compute();
        f2.display();//here i created only two objects u can create as much as u want
    }
}
