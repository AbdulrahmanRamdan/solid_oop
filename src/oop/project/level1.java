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
public class level1 extends level {
     Scanner scanner=new Scanner(System.in);
level1(){
this.explain="That level depends on explaining an initial part of the course, and it will be passed when you pass the three tests, and they are three questions for each test."; 
this.display_level_explain();}
public void display_level_explain(){
System.out.println(this.explain);
}
    @Override
    public void full_data() {
     System.out.println("If you want to amend and add any additional explanation, please enter it in full");
     this.explain=scanner.next();
    }

    @Override
    public boolean result(boolean v) {
        if(v==true){
        this.result="passed to level2";
        System.out.println(this.result);}
         return v;   
    }

    @Override
    public void quiz1() {
        int counter=0;
        int choise=0;
        System.out.println("choise the correct answer");
        System.out.println("The ..... includes a set of command-line tools for compiling and running your java code including a copy of the JRE ");
        System.out.println("1-JDK      2-JRE        3-TVM"); 
        choise=scanner.nextInt();
        if(choise==1){
        counter++;
        }
        System.out.println("TDK=JRE+......... ");
        System.out.println("1-tool      2-devalopent tool        3-JVM"); 
        choise=scanner.nextInt();
        if(choise==2){
        counter++;
        }
        System.out.println("JRE=......+libraryclasses ");
        System.out.println("1-TVM      2-JRE        3-JVM"); 
        choise=scanner.nextInt();
        if(choise==3){
        counter++;
        }
        
        if(counter>=2){
        System.out.println("quiz 1 is passed");
        System.out.print("the result is :");
        System.out.print(counter);
        System.out.print("/3");System.out.println();
        this.quiz2();}
        else{
         System.out.println("you should study hard and try again");}
            
    }    

    @Override
    public void quiz2() {
            int counter=0;
        int choise=0;
        System.out.println("choise the correct answer");
        System.out.println("The..... includes the JVM, code libraries and components that are necessary for running programs that are written in java language.  ");
        System.out.println("1-JDK      2-JRE        3-TVM"); 
        choise=scanner.nextInt();
        if(choise==2){
        counter++;
        }
        System.out.println("...... is the heart of the java language “write once, run anywhere");
        System.out.println("1-tool      2-toolbox        3-JVM"); 
        choise=scanner.nextInt();
        if(choise==3){
        counter++;
        }
        System.out.println("The ..... is a piece of software written specifically for a particular platform.");
        System.out.println("1-TVM      2-JRE        3-JVM"); 
        choise=scanner.nextInt();
        if(choise==3){
        counter++;
        }
        if(counter>=2){
        System.out.println("quiz 1 is passed");
        System.out.print("the result is :");
        System.out.print(counter);
        System.out.print("/3");System.out.println();
        this.quiz3();}
          else{
         System.out.println("you should study hard and try again");}
        
    }

    @Override
    public void quiz3() {
      int counter=0;
        int choise=0;
        System.out.println("choise the correct answer");
        System.out.println("The main reason for using packages is to guarantee the uniqueness of class names in the same package.");
        System.out.println("1-pacakage      2-class        3-varible"); 
        choise=scanner.nextInt();
        if(choise==1){
        counter++;
        }
        System.out.println("to horizontal tab and screen space use ......");
        System.out.println("1-/n      2-/t        3-/$"); 
        choise=scanner.nextInt();
        if(choise==2){
        counter++;
        }
        System.out.println("to shows value with a certain format use ......");
        System.out.println("1-System.out.println       2-System.out.printf        3-System.out.print"); 
        choise=scanner.nextInt();
        if(choise==2){
        counter++;
        }
        if(counter>=2){
        System.out.println("quiz 1 is passed");
        System.out.print("the result is :");
        System.out.print(counter);
        System.out.print("/3");System.out.println();
        this.result(true);}
          else{
         System.out.println("you should study hard and try again");}
        } 
    }
    

