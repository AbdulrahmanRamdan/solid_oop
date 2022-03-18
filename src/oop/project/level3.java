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
public class level3 extends level{
    Scanner scanner=new Scanner(System.in);
    level3(){
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
        System.out.println("Types of Methods in Java except....... ");
        System.out.println("1-Main Method     2-Instance Method       3-class"); 
        choise=scanner.nextInt();
        if(choise==3){
        counter++;
        }
        System.out.println("...... is the entry point into the application. ");
        System.out.println("1-Main Method     2-Instance Method        3-constructor"); 
        choise=scanner.nextInt();
        if(choise==1){
        counter++;
        }
        System.out.println("........are methods which require an object of its class to be created before it can be called.");
        System.out.println("1-Instance methods      2-private methods       3-Memory allocation ."); 
        choise=scanner.nextInt();
        if(choise==1){
        counter++;
        }
          System.out.println("constructors They can be expect ");
        System.out.println("1-overreading     2-private        3-main"); 
        choise=scanner.nextInt();
        if(choise==3){
        counter++;
        }
          System.out.println("constructor They have no  ......");
        System.out.println("1-return tybe      2-prameter        3-metgods"); 
        choise=scanner.nextInt();
        if(choise==1){
        counter++;
        }
            System.out.println(".......method can access only static data");
        System.out.println("1-private      2-overroading        3-static  "); 
        choise=scanner.nextInt();
        if(choise==3){
        counter++;
        }
          System.out.println("A static method ......... refer to \"this\" or \"super\" keywords in anyway");
        System.out.println("1-cannot     2-can       3-abllay"); 
        choise=scanner.nextInt();
        if(choise==1){
        counter++;
        }
        if(counter>=4){
        System.out.println("quiz 1 is passed");
        System.out.print("the result is :");
        System.out.print(counter);
        System.out.print("/7");System.out.println();
        this.quiz2();}
          else{
         System.out.println("you should study hard and try again");} 
    }

    @Override
    public void quiz2() {
                 int counter=0;
        int choise=0;
        System.out.println("choise the correct answer");
       System.out.println("The main reason for using packages is to guarantee the uniqueness of class names in the same package.");
        System.out.println("1-pacakage      2-class        3-varible"); 
        choise=scanner.nextInt();
        if(choise==1){
        counter++;
        }
        System.out.println("Every object belongs to........");
        System.out.println("1-class     2-box        3-objects"); 
        choise=scanner.nextInt();
        if(choise==1){
        counter++;
       System.out.println("to shows value with a certain format use ......");
        System.out.println("1-System.out.println       2-System.out.printf        3-System.out.print"); 
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
        System.out.println("The ..... includes a set of command-line tools for compiling and running your java code including a copy of the JRE ");
        System.out.println("1-JDK      2-JRE        3-TVM"); 
        choise=scanner.nextInt();
        if(choise==1){
        counter++;
        }
           System.out.println("....... can be invoked by using class reference.");
        System.out.println("1-private methods     2- public methods       3-static methods"); 
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
        if(counter>=4){
        System.out.println("quiz 1 is passed");
        System.out.print("the result is :");
        System.out.print(counter);
        System.out.print("/7");System.out.println();
        this.quiz3();}
         else{
         System.out.println("you should study hard and try again");}
    }


    }

    @Override
    public void quiz3() {
        System.out.println("We want to apply the rectangular area in uml daigram with length, width, color privates and public function");
           int counter=0;
        int choise=0;
        System.out.println("choise the correct answer");
        System.out.println("the private lenght.. ");
        System.out.println("1- -lenght      2- +lenght      3- #lenght"); 
        choise=scanner.nextInt();
        if(choise==1){
        counter++;
        }
        System.out.println("the public function..");
        System.out.println("1- -function      2- #function        3- +function "); 
        choise=scanner.nextInt();
        if(choise==3){
        counter++;
        }
        System.out.println("to make protect variable");
        System.out.println("1- -     2- +      3- #"); 
        choise=scanner.nextInt();
        if(choise==3){
        counter++;
        }
        if(counter==3){
        System.out.println("quiz 1 is passed");
        System.out.print("the result is : passsed you finished the course");
        System.out.println();
        this.result(true);}
          else{
         System.out.println("you should study hard and try again");}
    }
}