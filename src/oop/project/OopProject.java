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
public class OopProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
      run_main();
    }

    private static void run_main() {
         Scanner scanner=new Scanner(System.in);
        level1 l1=new level1();
         level2 l2=new level2();
          level3 l3=new level3();
          course course=new course();
          student s=new student();
          instructor i=new instructor();
          int c;
          System.out.println("if you student enter 1");
          System.out.println("if you instractor enter 2");
          c=scanner.nextInt();
          if(c==1){ 
              int a;
          System.out.println("if you want to creat acount enter 1");
          System.out.println("if you have acount  enter 2");
          a=scanner.nextInt();
          i.publish_announcement();
          if(a==1){s.creat_acount(course, l1, l2, l3);}
          if(a==2){s.sign_in(course, l1, l2, l3);}
          run_main();
          }
          if(c==2){
              s.veiw_comments();
          i.sign_in(course, l1, l2, l3);
           run_main();
    }  }
    
}
