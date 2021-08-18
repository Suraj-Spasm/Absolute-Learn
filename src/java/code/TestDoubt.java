
package code;

import daoimpl.DoubtDaoimp;
import java.util.List;
import java.util.Scanner;
import model.Doubt;

    
public class TestDoubt {
    public static void main(String[] args) {
        DoubtDaoimp Ddi = new DoubtDaoimp();
//            List<Doubt> ull = Ddi.getAllDoubts();
//        for (Doubt u : ull) {
//            System.out.println(u);}
//        int id = Ddi.getLastno();
//        System.out.println(id);
 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        String un = sc.nextLine();
        System.out.println("Enter your Email");
        String eml = sc.nextLine();
        System.out.println("enter subject");
        String Sub = sc.nextLine();
        System.out.println("enter doubt");
        String Do = sc.nextLine();
        int id = Ddi.getLastno();
        Doubt d= new Doubt(id+1, eml, eml, Sub, Do);
        boolean b= Ddi.addDoubt(d);
         if (b){
             System.out.println("Success");
             
         }   else {
             System.out.println("Failure");
         }  
//        
}
}
