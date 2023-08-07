
import java.util.Scanner;

public class Ass1{

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String red= "\033[31;1m";
        String green= "\033[32;1m";
        String blue= "\033[34;1m";
        String reset= "\033[32;0m";

        String status1="";
        String status2="";
        String status3="";


        System.out.print("Enter Your Name:");
        String name=scanner.nextLine();
        name=name.strip();

        
        if (name.length()==0){
            System.out.printf("%sInvalid Name%s \n",red,reset);
            assert 5<2;
        }
        

        System.out.print("Enter Your Age:");
        int age=scanner.nextInt();
        scanner.nextLine();

        if(age<10 || age>18) {
            System.out.printf("%sInvalid Age%s \n",red,reset);
            assert 5<2;
        }

        System.out.print("Enter Your Subject1:");
        String subject1=scanner.nextLine();
        subject1=subject1.strip();

        if(subject1.length()==0 || subject1.startsWith("SE-")==false) {
            System.out.printf("%sInvalid Subject%s \n",red,reset);
            assert 5<2;
        }


        System.out.print("Enter Your Marks1:");
        double marks1=scanner.nextDouble();
        scanner.nextLine();


        if(marks1<=0 || marks1>=100) {
            System.out.printf("%sInvalid Age%s \n",red,reset);
            assert 5<2;
        }else if(marks1>=75){
            status1=String.format("%sCredit Pass%s",green,reset);
        }else if(marks1>=55){
             status1=String.format("%sPass%s",blue,reset);

        }else if(marks1<55){
             status1=String.format("%sFail%s",red,reset);

        }


        System.out.print("Enter Your Subject2:");
        String subject2=scanner.nextLine();
        subject2=subject2.strip();

        if(subject2.length()==0 || subject2.startsWith("SE-" )==false || subject1==subject2) {
            System.out.printf("%sInvalid Subject%s \n",red,reset);
            assert 5<2;
        }

        System.out.print("Enter Your Marks2:");
        double marks2=scanner.nextDouble();
        scanner.nextLine();


        if(marks2<=0 || marks2>=100) {
            System.out.printf("%sInvalid Age%s \n",red,reset);
            assert 5<2;
        }else if(marks2>=75){
            status2=String.format("%sCredit Pass%s",green,reset);
        }else if(marks2>=55){
            status2=String.format("%sPass%s",blue,reset);

        }else if(marks2<55){
            status2=String.format("%sFail%s",red,reset);
        }

        System.out.print("Enter Your Subject3:");
        String subject3=scanner.nextLine();
        subject3=subject3.strip();

        if(subject3.length()==0 || subject3.startsWith("SE-" )==false || subject1==subject3 || subject2==subject3) {
            System.out.printf("%sInvalid Subject%s \n",red,reset);
            assert 5<2;
        }

        System.out.print("Enter Your Marks3:");
        double marks3=scanner.nextDouble();
        scanner.nextLine();

        if(marks3<=0 || marks3>=100) {
            System.out.printf("%sInvalid Age%s \n",red,reset);
            assert 5<2;
        }else if(marks3>=75){
            status3=String.format("%sCredit Pass%s",green,reset);
        }else if(marks3>=55){
            status3=String.format("%sPass%s",blue,reset);

        }else if(marks3<55){
            status3=String.format("%sFail%s",red,reset);

        }

        
        double total=marks1+marks2+marks3;
        System.out.println(total);
        double avg=total/3;
        String status="";

        if(avg<=0 || avg>=100) {
            System.out.printf("%sInvalid Age%s \n",red,reset);
            assert 5<2;
        }else if(avg>=75){
            status=String.format("%s%s%s",green,"Credit Pass".toUpperCase(),reset);
        }else if(avg>=55){
            status=String.format("%s%s%s",blue,"Pass".toUpperCase(),reset);

        }else if(avg<55){
            status=String.format("%s%s%s",red,"Fail".toUpperCase(),reset);

        }

        subject1=subject1.substring(0, 3)+"00"+subject1.substring(3);
        subject2=subject2.substring(0, 3)+"00"+subject2.substring(3);
        subject3=subject2.substring(0, 3)+"00"+subject3.substring(3);


        System.out.printf("+--------------------------------------+\n");
        System.out.printf("| Name  : %s%-29s%s| \n",blue,name.toUpperCase(),reset);
        System.out.printf("| Age   : %-29s| \n",age+" Years Old");
        System.out.printf("| Status: %-43s| \n",status);
        System.out.printf("| Total : %.2f  Avg : %-2.2f%s         |\n",total,avg,"%");
        System.out.printf("+--------------------------------------+\n");
        System.out.printf("| %-10s | %-10s | %-10s | \n","Subject","Marks","Status");
        System.out.printf("+--------------------------------------+\n");
        System.out.printf("| %-10s | %-11.2f|%-25s | \n",subject1,marks1,status1);
        System.out.printf("| %-10s | %-11.2f|%-25s | \n",subject2,marks2,status2);
        System.out.printf("| %-10s | %-11.2f|%-25s | \n",subject3,marks3,status3);
        System.out.printf("+--------------------------------------+\n");

        

    }

}