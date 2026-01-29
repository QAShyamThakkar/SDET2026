package Class24_2DArray;

import java.io.File;

public class FileandFolder {
    static void main(String[] args) {

        File folder = new File("D:\\0 QA - Videos and Backup\\6. PersonalBatch2026\\1Java");

        File listOfFiles[] = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {

            System.out.println(listOfFiles[i].getName());

        }
    }
}


//Java Class 01 _ Intro and Installation
// Java Class 02 _ Data Types Identifiers and Variable