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
public class level2 extends level{
    Scanner scanner=new Scanner(System.in);
    level2(){
    this.explain="In that level, you will study another part of the course, and you will be tested on it, but we will increase the difficulty for you in the number of questions for each quiz, so that you can keep asking for one quiz, and you must pass it.";
   this.display_level_explain(); }
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
        this.result="passed to level3";
        System.out.println(this.result);}
         return v;   
    }
    @Override
    public void quiz1() {
         int counter=0;
        int choise=0;
        System.out.println("choise the correct answer");
        System.out.println("in Java, all arrays are .......... allocated ");
        System.out.println("1-ordinary      2-dynamically       3-inputs"); 
        choise=scanner.nextInt();
        if(choise==2){
        counter++;
        }
        System.out.println("...... exit the current loop it exists in.");
        System.out.println("1-tool      2-break;        3-cancel"); 
        choise=scanner.nextInt();
        if(choise==2){
        counter++;
        }
        System.out.println("Obtaining an array same steps process :");
        System.out.println("1- [2and3]     2-Variable declaration.       3-Memory allocation ."); 
        choise=scanner.nextInt();
        if(choise==1){
        counter++;
        }
          System.out.println("Memory allocation mean ......");
        System.out.println("1-allocated      2-Variable declaration.        3-Instantiating an Array"); 
        choise=scanner.nextInt();
        if(choise==3){
        counter++;
        }
          System.out.println("An unlabeled break and continue are the simple known control ......");
        System.out.println("1-structure      2-instructions        3-loop"); 
        choise=scanner.nextInt();
        if(choise==1){
        counter++;
        }
        if(counter>=3){
        System.out.println("quiz 1 is passed");
        System.out.print("the result is :");
        System.out.print(counter);
        System.out.print("/5");System.out.println();
        this.quiz2();}
         else{
         System.out.println("you should study hard and try again");}
    }

    @Override
    public void quiz2() {
                 int counter=0;
        int choise=0;
        System.out.println("choise the correct answer");
        System.out.println(".......are variable of type class.");
        System.out.println("1-objects      2-classes       3-inputs"); 
        choise=scanner.nextInt();
        if(choise==1){
        counter++;
        }
        System.out.println("Every object belongs to........");
        System.out.println("1-class     2-box        3-objects"); 
        choise=scanner.nextInt();
        if(choise==1){
        counter++;
        }
        System.out.println("..... is a set of objects ");
        System.out.println("1-classes     2-problem       3-Memory allocation ."); 
        choise=scanner.nextInt();
        if(choise==2){
        counter++;
        }
          System.out.println("objects telling each other what to do, by ........");
        System.out.println("1-class      2-compiler        3-massage"); 
        choise=scanner.nextInt();
        if(choise==3){
        counter++;
        }
          System.out.println("........Is a member function with the same name as the class.");
        System.out.println("1-method     2-data tybe         3-consturctor"); 
        choise=scanner.nextInt();
        if(choise==3){
        counter++;
        }
        if(counter>=3){
        System.out.println("quiz 1 is passed");
        System.out.print("the result is :");
        System.out.print(counter);
        System.out.print("/5");System.out.println();
        this.quiz3();}
          else{
         System.out.println("you should study hard and try again");}
    }

    @Override
    public void quiz3() {
                         int counter=0;
        int choise=0;
        System.out.println("choise the correct answer");
        System.out.println("...... skips the rest of the instructions inside the loop and go for the next iteration. ");
        System.out.println("1-continue      2-break      3-label break"); 
        choise=scanner.nextInt();
        if(choise==1){
        counter++;
        }
        System.out.println("..... exit from a specific loop that has the label.");
        System.out.println("1-label      2-labaled break;        3-cancel"); 
        choise=scanner.nextInt();
        if(choise==2){
        counter++;
        }
        System.out.println("statements are similar to goto statement ..........:");
        System.out.println("1- [2and3]     2-labeled break       3-labelcontinue ."); 
        choise=scanner.nextInt();
        if(choise==1){
        counter++;
        }
          System.out.println("............skips all the instructions in loops till reach the label.");
        System.out.println("1-break.     2-Variable declaration.        3-labeled continue"); 
        choise=scanner.nextInt();
        if(choise==3){
        counter++;
        }
          System.out.println("........is a kind of data type that you can define yourself.");
        System.out.println("1-pakadage      2-function        3-classs"); 
        choise=scanner.nextInt();
        if(choise==3){
        counter++;
        }
        if(counter>=3){
        System.out.println("quiz 1 is passed");
        System.out.print("the result is :");
        System.out.print(counter);
        System.out.print("/5");System.out.println();
        this.result(true);}
          else{
         System.out.println("you should study hard and try again");}
    }
    
}
