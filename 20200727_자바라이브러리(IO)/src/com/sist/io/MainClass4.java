package com.sist.io;

import java.io.*;
import java.util.*;

/* FileInputStream,FileReader
 * FileOutputStream,FileWriter
 * BufferedReader,File
 * 
 * �ڹ����α׷�
 * �ڹ� �����α׷�(������)
 * =================������(����ó��)
 */

public class MainClass4 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      ObjectInputStream ois = null;
      try {
         ois = new ObjectInputStream(new FileInputStream("c:\\javaDev\\movie_tesn mt.txt"));
         ArrayList<Movie> list=(ArrayList<Movie>) ois.readObject();
         //���
         for(Movie e:list)
         {
            System.out.println(e.getMno()+" "+e.getTitle()+" "+e.getActor());
         }
      }catch (Exception e) 
      {
         //���� ó��
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