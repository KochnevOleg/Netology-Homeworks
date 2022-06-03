package Unit2.JavaCore.IOStreamsFilesSerialize;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class GameProgress implements Serializable {

    private static final long serialVersionUID = 123456789987654321L;

    private int health;
    private int weapons;
    private int level;
    private double distance;

    public GameProgress(int health, int weapons, int level, double distance) {
        this.health = health;
        this.weapons = weapons;
        this.level = level;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "GameProgress{" +
                "health=" + health +
                ", weapons=" + weapons +
                ", level=" + level +
                ", distance=" + distance +
                '}';
    }

    public void saveGame(String path) {
        try (FileOutputStream fos = new FileOutputStream(path);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void archiveFiles(String zipPath, String[] filenames, String... filePath) {
        try (FileOutputStream fos = new FileOutputStream(zipPath);
             ZipOutputStream zos = new ZipOutputStream(fos)) {

            for (int i = 0; i < filePath.length; i++) {
                FileInputStream fis = new FileInputStream(filePath[i]);
                ZipEntry ze = new ZipEntry(filenames[i]);

                zos.putNextEntry(ze);
                byte[] buffer = new byte[fis.available()];
                fis.read(buffer);
                zos.write(buffer);
                zos.closeEntry();
                fis.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
