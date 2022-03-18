/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.project;
import java.util.*;
/**
 *
 * @author HOME
 */
public class student {
    String name;
    String user_name;
    String password;
    String educational_level;
    String level;
    public String comment;
    int id;
    int age;
    Scanner scanner=new Scanner(System.in);
    student(){this.level="level 1";}
    public void creat_acount(course course,level1 l1,level2 l2,level3 l3){
        System.out.println("enter your name :");
        this.name=scanner.next();
         System.out.println("enter your id :");
        this.id=scanner.nextInt();
         System.out.println("enter your age :");
        this.age=scanner.nextInt();
         System.out.println("enter your educational level :");
        this.educational_level=scanner.next();
         System.out.println("enter your user name you want to sign :");
        this.user_name=scanner.next();
        String p1,p2;
        while(true){
         System.out.println("enter your pass word :");
        p1=scanner.next();
        System.out.println("enter your confrim pass word :");
        p2=scanner.next();
        System.out.println("pass words are not same :");
        if(p1 == null ? p2 == null : p1.equals(p2)){break;} }
        this.password=p1;
        this.dis_play();
        this.sign_in(course,l1,l2,l3);
    }
    public void sign_in(course course,level1 l1,level2 l2,level3 l3){
    String ussr,pass;
    while(true){
    System.out.print("enter user name :");
    ussr=scanner.next();System.out.println();
    System.out.print("enter pass word :");
    pass=scanner.next();System.out.println();
    if((this.user_name == null ? ussr == null : this.user_name.equals(ussr))&&this.password.equals(pass)){
    System.out.println("signed successful");
    this.run_fun(course, l1, l2, l3);
    break;}}
    }
    public void dis_play(){
        System.out.print("the name is :");System.out.println(this.name);
        System.out.print("the id is :");System.out.println(this.id);
        System.out.print("the age is :");System.out.println(this.age);
        System.out.print("the educational level is :");System.out.println(this.educational_level);
        System.out.print("the user name is :");System.out.println(this.user_name);
        System.out.print("the password is :");System.out.println(this.password);
    }
    public void edit(){
        int edit_num;
        System.out.println("enter 1 to edit your name");
        System.out.println("enter 2 to edit your user name");
        System.out.println("enter 3 to edit your password");
        System.out.println("enter 4 to edit your educational_level");
        System.out.println("enter 5 to edit your id");
        System.out.println("enter 6 to edit your age");
        edit_num=scanner.nextInt();
        switch(edit_num){
            case 1:{
            this.name=scanner.next();
            break;}
            case 2:{
            this.user_name=scanner.next();
            break;}
            case 3:{
            this.password=scanner.next();
            break;}
            case 4:{
            this.educational_level=scanner.next();
            break;}
            case 5:{
            this.id=scanner.nextInt();
            break;}
             case 6:{
            this.age=scanner.nextInt();
            break;}}
         System.out.println("edited successful");
         this.dis_play();}  
     public void show_course_contant(course course){
         course.display();
     }
     public void veiw_statue_incourse(level1 l1,level2 l2,level3 l3){

this.level="level 1";
         System.out.print("statue inn course : ");System.out.println(this.level);
     }
     public void solve_quizes(level1 l1,level2 l2,level3 l3){
         if("level 1".equals(this.level)){
             l1.quiz1();
         }
         if("level 2".equals(this.level)){
             l2.quiz1();
         }
         if("level 3".equals(this.level)){
             l3.quiz1();
         }
     }
     public void send_comments(){
         
         System.out.println("enter your question crearly  .");
         this.comment=scanner.next();
         System.out.println("thank you .");
     }
     public void veiw_comments(){
         if(this.comment!=null){
         System.out.println("hallo sir i have a question");
         System.out.println(this.comment);}
     }
     public void run_fun(course course,level1 l1,level2 l2,level3 l3){
     System.out.println("enter 1 to View the course content.");
     System.out.println("enter 2 to View your statue in course.");
     System.out.println("enter 3 to View your data and edit.");
     System.out.println("enter 4 to solve quizesz.");
     System.out.println("enter 5 to send feed back and comments.");
      System.out.println("enter 6 to pass to menu");
     int i;
     i=scanner.nextInt();
     switch(i){ 
         case 1:{
         this.show_course_contant(course);
         this.run_fun(course, l1, l2, l3);
         break;
         }
         case 2:{
         this.veiw_statue_incourse(l1, l2, l3);
         this.run_fun(course, l1, l2, l3);
         break;
         }
         case 3:{
         this.dis_play();
         this.run_fun(course, l1, l2, l3);
         this.edit();
         break;
         }
         case 4:{
         this.solve_quizes(l1, l2, l3);
         this.run_fun(course, l1, l2, l3);
         break;
         }
         case 5:{
         this.send_comments();
         this.run_fun(course, l1, l2, l3);
         break;
         }
         default:{break;}
     };
     }

    
}
