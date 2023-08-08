import java.util.Scanner;

public class Ans {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        String red= "\033[31;1m";
        String green= "\033[32;1m";
        String blue= "\033[34;1m";
        String yellow= "\033[33;1m";
        String reset= "\033[30;0m";

        final String errMsg=String.format("%s%s%s", red,"%s",reset);

app:{
        /*personal data */
        System.out.print("Enter Your Name:");
        String name=scanner.nextLine().strip();

    
        if(name.length()==0){
            System.out.printf(errMsg,"Name can't be empty");
            //System.exit(1);
            //assert 5<2;
            break app;
        }
    

        System.out.print("Enter Your Age:");
        int age=scanner.nextInt();
        scanner.nextLine();
        //scanner.skip(System.lineSeparator()); // \n, \r\n

        if(age<10 || age>18){
            System.out.printf(errMsg,"Invalid Age");
            break app;
        }

        /*subject 1 */
        System.out.print("Enter Your subject1:");
        String subject1=scanner.nextLine().strip();

        if(subject1.isBlank()){
            System.out.printf(errMsg,"Subject can't be empty");
            break app;
        }else if(!subject1.startsWith("SE-")){
            System.out.printf(errMsg,"Invalid Subject");
            break app;
        }

        System.out.printf("Enter Your marks for %s:",subject1);
        double marks1=scanner.nextDouble();
        scanner.nextLine();

        if(marks1<0 || marks1>100){
            System.out.printf(errMsg,"Invalid Mark");
            break app;
        }


        /*subject 2 */
        System.out.print("Enter Your subject2:");
        String subject2=scanner.nextLine().strip();

        if(subject2.isBlank()){
            System.out.printf(errMsg,"Subject can't be empty");
            break app;
        }else if(!subject2.startsWith("SE-")){
            System.out.printf(errMsg,"Invalid Subject");
            break app;
        }else if(subject2.equals(subject1)){
            System.out.printf(errMsg,"Subject Already exists");
            break app;
        }

        System.out.printf("Enter Your marks for %s:",subject2);
        double marks2=scanner.nextDouble();
        scanner.nextLine();

        if(marks2<0 || marks2>100){
            System.out.printf(errMsg,"Invalid Mark");
            break app;
        }

        /*subject 3 */
        System.out.print("Enter Your subject3:");
        String subject3=scanner.nextLine().strip();

        if(subject3.isBlank()){
            System.out.printf(errMsg,"Subject can't be empty");
            break app;
        }else if(!subject3.startsWith("SE-")){
            System.out.printf(errMsg,"Invalid Subject");
            break app;
        }else if(subject3.equals(subject1) || subject3.equals(subject2)){
            System.out.printf(errMsg,"Subject Already exists");
            break app;
        }

        System.out.printf("Enter Your marks for %s:",subject3);
        double marks3=scanner.nextDouble();
        scanner.nextLine();

        if(marks3<0 || marks3>100){
            System.out.printf(errMsg,"Invalid Mark");
            break app;
        }

        double total=marks1+marks2+marks3;
        double avg=total/3;

        String status;
        String status1;
        String status2;
        String status3;

        final String DP=String.format("%s%s%s",blue,"Distinguished Pass (DP)".toUpperCase(),reset);
        final String CP=String.format("%s%s%s",green,"Credit Pass (CP)".toUpperCase(),reset);
        final String P=String.format("%s%s%s",yellow,"Pass (P)".toUpperCase(),reset);
        final String F=String.format("%s%s%s",red,"Fail (F)".toUpperCase(),reset);


        // if(avg>=75) status="Distinguished Pass (DP)";
        // else if(avg>=65) status="Credit Pass (CP)";
        // else if(avg>=55) status="Pass (P)";
        // else status="Fail (F)";
    
        //determine the overall status
        if(avg>=75){
            status=DP;
        }else if(avg>=65){
            status=CP;
        }else if(avg>=55){
            status=P;
        }else{
            status=F;
        }

        //subject 1 status
        if(marks1>=75){
            status1=DP;
        }else if(marks1>=65){
            status1=CP;
        }else if(marks1>=55){
            status1=P;
        }else{
            status1=F;
        }

         //subject 2 status
        if(marks2>=75){
            status2=DP;
        }else if(marks2>=65){
            status2=CP;
        }else if(marks2>=55){
            status2=P;
        }else{
            status2=F;
        }

         //subject 3 status
        if(marks3>=75){
            status3=DP;
        }else if(marks3>=65){
            status3=CP;
        }else if(marks3>=55){
            status3=P;
        }else{
            status3=F;
        }

        name=String.format("%s%s%s",blue,name.toUpperCase(),reset);
        subject1=subject1.format("SE-%03d",Integer.valueOf(subject1.substring(3)));
        subject2=subject2.format("SE-%03d",Integer.valueOf(subject2.substring(3)));
        subject3=subject3.format("SE-%03d",Integer.valueOf(subject3.substring(3)));

        //let's generate  the table
        System.out.println("+".concat("-".repeat(50)).concat("+"));
        System.out.printf("| %-10s: %-51s| \n","Name",name);
        System.out.printf("| %-10s: %-37s| \n","Age",age+" Years Old");
        System.out.printf("| %-10s: %-51s| \n","Status",status);
        System.out.printf("| %-10s: %-37s| \n","Total",String.format("%.2f", total));
        System.out.printf("| %-10s: %-37s| \n","Avg",String.format("%.2f", avg).concat("%"));

        System.out.println("+".concat("-".repeat(50)).concat("+"));
        System.out.printf("| %-10s| %-8s| %-27s| \n","Subject","Marks","Status");

        System.out.println("+".concat("-".repeat(50)).concat("+"));
        System.out.printf("| %-10s| %-8.2f| %-41s| \n",subject1,marks1,status1);
        System.out.printf("| %-10s| %-8.2f| %-41s| \n",subject2,marks2,status2);
        System.out.printf("| %-10s| %-8.2f| %-41s| \n",subject3,marks3,status3);

        System.out.println("+".concat("-".repeat(50)).concat("+"));





    }
    
}





}
    

