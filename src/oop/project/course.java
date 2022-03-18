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
public class course {
 String course_name;
 int num_of_level;
 course(){
 this.course_name="oop matrial";
this.num_of_level=3; }
   Scanner scanner=new Scanner(System.in);
 public void edit_course_data(){
 System.out.print("enter couse name :");
 this.course_name=scanner.next();System.out.println();
 System.out.print("enter number of levels :");
 this.num_of_level=scanner.nextInt();System.out.println();
 }
 public void display(){
    System.out.print("the course name is:");System.out.println(this.course_name);
    System.out.print("the number of levels is:");System.out.println(this.num_of_level);
 }
}
