package Unit2.JavaCore.IOStreamsFilesSerialize;

public class GameProgressSaver {
    public static void main(String[] args) {
        GameProgress save1 = new GameProgress(100, 4, 46, 185.6);
        GameProgress save2 = new GameProgress(45, 2, 12, 13.2);
        GameProgress save3 = new GameProgress(12, 6, 76, 319.1);

        String savegamesDirectory = "D:\\Games(for netology homework)\\savegames";

        Installer.createFile(savegamesDirectory, "save1.dat");
        Installer.createFile(savegamesDirectory, "save2.dat");
        Installer.createFile(savegamesDirectory, "save3.dat");

        save1.saveGame("D:\\Games(for netology homework)\\savegames\\save1.dat");
        save2.saveGame("D:\\Games(for netology homework)\\savegames\\save2.dat");
        save3.saveGame("D:\\Games(for netology homework)\\savegames\\save3.dat");

        Installer.createFile("D:\\Games(for netology homework)\\savegames", "savings.zip");

        String[] archiveFilesNames = {"save1.dat", "save2.dat", "save3.dat"};
        GameProgress.archiveFiles("D:\\Games(for netology homework)\\savegames\\savings.zip", archiveFilesNames,
                                         "D:\\Games(for netology homework)\\savegames\\save1.dat",
                                         "D:\\Games(for netology homework)\\savegames\\save2.dat",
                                         "D:\\Games(for netology homework)\\savegames\\save3.dat");

        Installer.deleteFile("D:\\Games(for netology homework)\\savegames\\save1.dat");
        Installer.deleteFile("D:\\Games(for netology homework)\\savegames\\save2.dat");
        Installer.deleteFile("D:\\Games(for netology homework)\\savegames\\save3.dat");
    }


}
