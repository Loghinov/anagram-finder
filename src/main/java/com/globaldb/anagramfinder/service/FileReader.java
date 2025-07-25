package com.globaldb.anagramfinder.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    public  static List<String> readWords(String fileName){
        List<String> words = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new java.io.FileReader(fileName))){
            String line;
            while ((line =bufferedReader.readLine()) != null){
                if (!line.trim().isEmpty()){
                    words.add(line.trim());
                }
            }
        }catch (IOException e){
            System.out.println("Error to read file "+e.getMessage());
        }
        return words;
    }
}
