package week7.task2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Task2 {
    
    public void NullPointer() throws NullPointerException {
    	String[] a = null;
        System.out.println(a.length);
    }
    public  void  ArrayIndex() throws  ArrayIndexOutOfBoundsException {
    	String[] b = new String[5];
        System.out.println(b[5]);
    }
    public  void ArthmeticException() throws  ArithmeticException{
        int c = 1/0;
        System.out.println(c);
    }
    public void ClassCast() throws ClassCastException{
        Object i = Integer.valueOf(3);
        String n = (String)i;
        System.out.println(n);
    }
    public void IOException() throws IOException{
        throw new IOException();    
    }
    public void FileNotFound() throws FileNotFoundException{
        throw  new FileNotFoundException();
    }
    public static void main(String[] args) {
        
        Task2 test = new Task2();
        
        try {
            test.NullPointer();
        }catch (Exception e){
            System.out.println(e.toString());
        }
        
        try {
            test.ArrayIndex();
        }catch (Exception e){
            System.out.println(e.toString());
        }
        
        try {
            test.ArthmeticException();
        }catch (Exception e){
            System.out.println(e.toString());
        }
        
        try {
            test.ClassCast();
        }catch (Exception e){
            System.out.println(e.toString());
        }
        
        try {
            test.IOException();
        }catch (Exception e){
            System.out.println(e.toString());
        }
        
        try {
            test.FileNotFound();
        }catch (Exception e){
            System.out.println(e.toString());
        }
        
    }
}