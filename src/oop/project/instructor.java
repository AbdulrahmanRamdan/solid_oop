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
public class instructor {
     Scanner scanner=new Scanner(System.in);
     String name;
     String username;
     String password;
     String  announcement;
     int age;
     instructor(){
     this.username="oop";
     this.password="12345";
     }
     public void sign_in(course course,level1 l1,level2 l2,level3 l3){
    String ussr,pass;
    while(true){
    System.out.print("enter user name :");
    ussr=scanner.next();System.out.println();
    System.out.print("enter pass word :");
    pass=scanner.next();System.out.println();
    if((this.username == null ? ussr == null : this.username.equals(ussr))&&this.password.equals(pass)){
    System.out.println("signed successful");
    this.run_funs(course, l1, l2, l3);
    break;}}
    }
     public void regester(course course,level1 l1,level2 l2,level3 l3){
       System.out.println("enter your name :");
        this.name=scanner.next();
         System.out.println("enter your age :");
        this.age=scanner.nextInt();
         System.out.println("enter your user name you want to sign :");
        this.username=scanner.next();
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
        this.sign_in(course, l1, l2, l3);
    }

    public void dis_play() {
        
        System.out.print("the name is :");System.out.println(this.name);
        System.out.print("the age is :");System.out.println(this.age);
        System.out.print("the user name is :");System.out.println(this.username);
        System.out.print("the password is :");System.out.println(this.password); }
    public void edit_course_contant(course course){
        course.edit_course_data();
    }
    public void add_announcement(){
    System.out.println("enter the  announcement");
    this.announcement=scanner.next();
    }
    public void publish_announcement(){
    if(this.announcement!=null){
    
         System.out.println("attination");
         System.out.println(this.announcement);
    }
    }
    public void edit_explain_levels(level1 l1,level2 l2,level3 l3){
    System.out.println("what level you want to edit 1 or 2 or 3");
    int choise;
    choise=scanner.nextInt();
    switch(choise){
        case 1:{
        l1.full_data();
        break;
        }
        case 2:{
        l2.full_data();
        break;
        }
        case 3:{
        l3.full_data();
        break;
        }
        default:{break;}
    }
    }
     public void run_funs(course course,level1 l1,level2 l2,level3 l3){
     
     System.out.println("enter 1 to regester.");
     System.out.println("enter 2 to edit explain levels.");
     System.out.println("enter 3 to View your data and edit.");
     System.out.println("enter 4 add announcement.");
     System.out.println("enter 5 to edit course contant");
     System.out.println("enter 6 to pass to menu");
     int i;
     i=scanner.nextInt();
     switch(i){ 
         case 1:{
         this.regester(course, l1, l2, l3);
         this.run_funs(course, l1, l2, l3);
         break;
         }
         case 2:{
         this.edit_explain_levels(l1, l2, l3);
         this.run_funs(course, l1, l2, l3);
         break;
         }
         case 3:{
         this.dis_play();
         this.regester(course, l1, l2, l3);
         this.run_funs(course, l1, l2, l3);
         break;
         }
         case 4:{
         this.add_announcement();
         this.run_funs(course, l1, l2, l3);
         break;
         }
         case 5:{
         this.edit_course_contant(course);
         this.run_funs(course, l1, l2, l3);
         break;
         }
         
         default:{break;}
     }
     }
}
