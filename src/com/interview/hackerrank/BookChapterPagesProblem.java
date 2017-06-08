package com.interview.hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BookChapterPagesProblem {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       
        Integer numberOfChapters = 0;
        Integer maxNumberOfProblemsPerPage = 0;
        List<Integer> problemsPerChapter = new ArrayList<>();
        Map<Integer, Integer> chapterNumberPageMap = new HashMap<>();
        Integer totalPages = 0;
        String firstLine[] = new String[2]; 
        String secondLine[] = new String[2]; 
        Scanner sc = new Scanner(System.in);
        String lines[] = new String[2]; 
        
        //key -> pageNumber
        //Set contains problem numbers
        Map<Integer,Set<Integer>> pageMap = new HashMap<>();
        
        int count = 0;
        
        while(sc.hasNextLine()){
            lines[count] = sc.nextLine();
            System.out.println(lines[count]);
            count++;
        }
        
        firstLine = lines[0].split(" ");
        secondLine = lines[1].split(" ");
        
        numberOfChapters = Integer.parseInt(firstLine[0]);
        maxNumberOfProblemsPerPage = Integer.parseInt(firstLine[1]);
        
       for(int i = 0; i < secondLine.length; i++){
          // System.out.println(secondLine[i]);
           problemsPerChapter.add(Integer.parseInt(secondLine[i]));
       }
        
         
       for(int i = 0; i < numberOfChapters - 1; i++){
           int pagesPerChapter = 0;
           pagesPerChapter = problemsPerChapter.get(i)/maxNumberOfProblemsPerPage + 1;
           totalPages = totalPages + pagesPerChapter;
       }
      
        
        
        System.out.println(totalPages);
    }
}