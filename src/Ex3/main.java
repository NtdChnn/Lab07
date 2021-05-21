/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex3;

import java.util.Scanner;

/**
 *
 * @author notda
 */
public class main {
    public static void main(String[] args) {
        System.out.println("1.Person 2.Student 3.Employee 4.Faculty 5.Staff");
        System.out.print("Menu : ");
        Scanner menuInput = new Scanner(System.in);
        int menu = menuInput.nextInt();
        if(menu == 1) //Preson
        {
            
            System.out.println("Preson");
            System.out.print("Name : ");
            Scanner nameP_ = new Scanner(System.in);
            String nameP = nameP_.nextLine();
            System.out.print("Address : ");
            Scanner addP_ = new Scanner(System.in);
            String addP = addP_.nextLine();
            System.out.print("Phone Number : ");
            Scanner phoneNumP_ = new Scanner(System.in);
            String phoneNumP = phoneNumP_.nextLine();
            System.out.print("Email Address : ");
            Scanner emailP_ = new Scanner(System.in);
            String emailP = emailP_.nextLine();
            
            Preson P1 = new Preson(nameP,addP,phoneNumP,emailP);
            System.out.println(P1.toString());
            
        } else if (menu == 2) //Student
        {  
            System.out.println("Student");
            System.out.print("Name : ");
            Scanner nameS_ = new Scanner(System.in);
            String nameS = nameS_.nextLine();
            System.out.print("Address : ");
            Scanner addS_ = new Scanner(System.in);
            String addS = addS_.nextLine();
            System.out.print("Phone Number : ");
            Scanner phoneNumS_ = new Scanner(System.in);
            String phoneNumS = phoneNumS_.nextLine();
            System.out.print("Email Address : ");
            Scanner emailS_ = new Scanner(System.in);
            String emailS = emailS_.nextLine();
            System.out.println("1.Freshman 2.Sophomore 3.Junior 4.Senior");
            System.out.print("Status : ");
            Scanner statusS_ = new Scanner(System.in);
            int statusS = statusS_.nextInt();
            
            Student S1 = new Student(statusS,nameS,addS,phoneNumS,emailS);
            System.out.println(S1.toString());  
        
        } else if (menu == 3) //Employee
        {    
            System.out.println("Employee");
            System.out.print("Name : ");
            Scanner nameE_ = new Scanner(System.in);
            String nameE = nameE_.nextLine();
            System.out.print("Address : ");
            Scanner addE_ = new Scanner(System.in);
            String addE = addE_.nextLine();
            System.out.print("Phone Number : ");
            Scanner phoneNumE_ = new Scanner(System.in);
            String phoneNumE = phoneNumE_.nextLine();
            System.out.print("Email Address : ");
            Scanner emailE_ = new Scanner(System.in);
            String emailE = emailE_.nextLine();
            System.out.print("Office : ");
            Scanner OfficeE_ = new Scanner(System.in);
            String OfficeE = OfficeE_.nextLine();
            System.out.print("Salary : ");
            Scanner salaryE_ = new Scanner(System.in);
            int salaryE = salaryE_.nextInt();
            
            Employee E1 = new  Employee(OfficeE,salaryE,nameE,addE,phoneNumE,emailE);
            System.out.println(E1.toString());
        
        } else if (menu == 4) //Faculty
        {
            System.out.println("Faculty");
            System.out.print("Name : ");
            Scanner nameF_ = new Scanner(System.in);
            String nameF = nameF_.nextLine();
            System.out.print("Address : ");
            Scanner addF_ = new Scanner(System.in);
            String addF = addF_.nextLine();
            System.out.print("Phone Number : ");
            Scanner phoneNumF_ = new Scanner(System.in);
            String phoneNumF = phoneNumF_.nextLine();
            System.out.print("Email Address : ");
            Scanner emailF_ = new Scanner(System.in);
            String emailF = emailF_.nextLine();
            System.out.print("Office : ");
            Scanner OfficeF_ = new Scanner(System.in);
            String OfficeF = OfficeF_.nextLine();
            System.out.print("Salary : ");
            Scanner salaryF_ = new Scanner(System.in);
            int salaryF = salaryF_.nextInt();
            System.out.print("Office Hours : ");
            Scanner officeHourF_ = new Scanner(System.in);
            double officeHourF = officeHourF_.nextDouble();
            System.out.print("Rank : ");
            Scanner RankF_ = new Scanner(System.in);
            String RankF = RankF_.nextLine();
            
            Faculty F1 = new  Faculty(officeHourF,RankF,OfficeF,salaryF,nameF,addF,phoneNumF,emailF);
            System.out.println(F1.toString());
            
        } else if (menu == 5) //Staff
        {
            System.out.println("Employee");
            System.out.print("Name : ");
            Scanner names_ = new Scanner(System.in);
            String names = names_.nextLine();
            System.out.print("Address : ");
            Scanner adds_ = new Scanner(System.in);
            String adds = adds_.nextLine();
            System.out.print("Phone Number : ");
            Scanner phoneNums_ = new Scanner(System.in);
            String phoneNums = phoneNums_.nextLine();
            System.out.print("Email Address : ");
            Scanner emails_ = new Scanner(System.in);
            String emails = emails_.nextLine();
            System.out.print("Office : ");
            Scanner Offices_ = new Scanner(System.in);
            String Offices = Offices_.nextLine();
            System.out.print("Salary : ");
            Scanner salarys_ = new Scanner(System.in);
            int salarys = salarys_.nextInt();
            System.out.print("Title : ");
            Scanner titles_ = new Scanner(System.in);
            String titles = titles_.nextLine();
            
            Staff s1 = new  Staff(titles,Offices,salarys,names,adds,phoneNums,emails);
            System.out.println(s1.toString());
            
        } else System.out.println("Menu is incorrect");
    }
    
}
