package day45_Exceptions;

import java.io.IOException;
import java.util.NoSuchElementException;

public class summary {
    public static void main(String[] args) {

        // Thread.sleep(3000);


        try {
            throw new IOException();  // checked

        } catch(Exception e){

        }


        System.out.println("Hello");

        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (RuntimeException a){

        }




        try {
            throw new ClassNotFoundException();
        } catch (Exception e ){

        }

        try {
            throw new NullPointerException();
        }catch(ArithmeticException a ){
            System.out.println("Arithmetic");
        }catch(ClassCastException a){
            System.out.println("Class Cast");
        }




        //  System.out.println("Completed");






    }}