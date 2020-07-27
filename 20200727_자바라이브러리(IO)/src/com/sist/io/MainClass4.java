package com.sist.io;

import java.io.*;
import java.util.*;

/* FileInputStream,FileReader
 * FileOutputStream,FileWriter
 * BufferedReader,File
 * 
 * 자바프로그램
 * 자바 웹프로그램(스프링)
 * =================공통기반(예외처리)
 */

public class MainClass4 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      ObjectInputStream ois = null;
      try {
         ois = new ObjectInputStream(new FileInputStream("c:\\javaDev\\movie_tesn mt.txt"));
         ArrayList<Movie> list=(ArrayList<Movie>) ois.readObject();
         //출력
         for(Movie e:list)
         {
            System.out.println(e.getMno()+" "+e.getTitle()+" "+e.getActor());
         }
      }catch (Exception e) 
      {
         //에러 처리
         System.out.println(e.getMessage());
      }
      finally 
      {
         try {
            ois.close();
         } catch (Exception e2) {}
      }
   }

}