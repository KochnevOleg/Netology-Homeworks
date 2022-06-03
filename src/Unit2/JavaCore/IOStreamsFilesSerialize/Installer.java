package Unit2.JavaCore.IOStreamsFilesSerialize;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Installer {
    public static void main(String[] args) {

        StringBuilder log = new StringBuilder();

        String rootDirectory = "D:\\Games(for netology homework)";
        String[] rootDirectoriesToCreate = {"src", "res", "temp", "savegames" };

        log.append("---Creating folders in ").append(rootDirectory).append(".---\n");
        log.append(createFolder(rootDirectory, rootDirectoriesToCreate));

        String srcDirectory = "D:\\Games(for netology homework)\\src";
        String[] srcDirectoriesToCreate = {"main", "test"};

        log.append("\n---Creating folders in ").append(srcDirectory).append(".---\n");
        log.append(createFolder(srcDirectory, srcDirectoriesToCreate));

        String resDirectory = "D:\\Games(for netology homework)\\res";
        String[] resDirectoriesToCreate = {"drawables", "vectors", "icons"};

        log.append("\n---Creating folders in ").append(resDirectory).append(".---\n");
        log.append(createFolder(resDirectory, resDirectoriesToCreate));

        String tempDirectory = "D:\\Games(for netology homework)\\temp";
        String mainDirectory = "D:\\Games(for netology homework)\\src\\main";

        log.append("\n---Creating files.--- \n");

        log.append(createFile(tempDirectory, "temp.txt"));
        log.append(createFile(mainDirectory, "Main.java"));
        log.append(createFile(mainDirectory, "Utils.java"));

        try {
            PrintWriter logs = new PrintWriter("D:\\Games(for netology homework)\\temp\\temp.txt");
            logs.write(String.valueOf(log));
            logs.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String createFolder(String rootDirectory, String[] directoriesToCreate) {
        StringBuilder log = new StringBuilder();
        for(String directory : directoriesToCreate) {
            File createdDirectory = new File(rootDirectory + "\\" + directory);
            boolean isCreate = createdDirectory.mkdir();
            if(isCreate) {
                log.append("Folder \"").append(directory).append("\" created successfully. \n");
            } else{
                log.append("Creating \"").append(directory).append("\" have been failed. \n");
            }
        }
        return log.toString();
    }

    static String createFile(String path, String fileName) {
        StringBuilder log = new StringBuilder();
        File createdFile = new File(path + "\\" + fileName);
        try {
            boolean isCreated = createdFile.createNewFile();
            if (isCreated){
                log.append("File \"").append(fileName).append("\" have been created. \n");
            } else {
                log.append("Creating \"").append(fileName).append("\" failed. \n");
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
        return log.toString();
    }

    static void deleteFile(String path) {
        File fileToDelete = new File(path);
        fileToDelete.delete();
    }
}
