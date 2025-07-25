package com.globaldb.anagramfinder.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class FileCreator {

    public static void createFile() {
        String fileName = "sample.txt";
        List<String> words = Arrays.asList("act", "cat", "tree", "race", "care", "acre", "bee");
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
            for (String word : words){
                writer.write(word);
                writer.newLine();
            }
            System.out.println("File: "+fileName+" was created");
        }catch (IOException e){
            System.out.println("Error while creating file: "+e.getMessage());
        }
    }
    public static void main(String[] args){
        createFile();
    }
}
