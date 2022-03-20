package Unit1.JavaBasics.JavaCollections.ArraysList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> listOfTasks = new ArrayList<>();

        while (true) {
            System.out.println("Select task and insert number." +
                    "\n1.Add new task." +
                    "\n2.Show task list." +
                    "\n3.Delete task" +
                    "\n4.Insert 0 to escape.");

            int insertedNum = Integer.parseInt(scan.nextLine());

            if (insertedNum == 0) {
                break;
            }

            switch (insertedNum) {
                case 1:
                    String newTask = scan.nextLine();
                    listOfTasks.add(newTask);
                    break;
                case 2:
                    //////////////////var1/////////////////////

//                    int num = 1;
//                    for (String task : listOfTasks) {
//                        System.out.println(num + "." +  task + ".");
//                        num++;
//                    }

                    //////////////////var2/////////////////////


//                    Iterator<String> iterator = listOfTasks.iterator();
//                    int num = 1;
//                    while(iterator.hasNext()){
//                        String s = iterator.next();
//                        System.out.println(num + "." +  s + ".");
//                        num++;
//                    }

                    /////////////////var3/////////////////////////

                    for (int i = 0; i < listOfTasks.size(); i++) {
                        System.out.println((i + 1) + "." + listOfTasks.get(i) + ".");
                    }
                    break;
                case 3:
                    int deleteTask = Integer.parseInt(scan.nextLine());
                    listOfTasks.remove(deleteTask - 1);
                    break;
            }

        }

    }
}
