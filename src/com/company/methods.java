package com.company;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;


public class methods {
    public boolean isUser(String username) throws IOException {
        FileReader data = new FileReader("D:\\data.txt");
        Scanner scan = new Scanner(data);
        String fileContent = "";
        int counter = lineCounter();
        for (int i = 0; i < counter; i++) {
            fileContent = fileContent.concat(scan.nextLine());
            if (fileContent.equals(username)) {
                data.close();
                return true;
            } else {
                i += 10;
                for (int j = 0; j < 10; j++) {
                    fileContent = fileContent.concat(scan.nextLine());
                }
            }
            fileContent = "";
        }
        return false;
    }

    public boolean checkUser(String username, String password) throws IOException {
        FileReader data = new FileReader("D:\\data.txt");
        Scanner scan = new Scanner(data);
        String fileContent = "";
        int counter = lineCounter();
        for (int i = 0; i < counter; i++) {
            fileContent = fileContent.concat(scan.nextLine());
            if (fileContent.equals(username)) {
                fileContent = "";
                fileContent = fileContent.concat(scan.nextLine());
                if (fileContent.equalsIgnoreCase(password)) {
                    data.close();
                    return true;
                } else {
                    data.close();
                    return false;
                }
            } else {
                i += 10;
                for (int j = 0; j < 10; j++) {
                    fileContent = fileContent.concat(scan.nextLine());
                }
            }
            fileContent = "";
        }
        return false;
    }

    public void saveUser(String username, String password, String fullname, String age, String sexuality, String country, String favSport, String favArt, String favFood, String morale, String nature) throws IOException {
        FileReader data = new FileReader("D:\\data.txt");
        Scanner scan = new Scanner(data);
        String fileContent = "";
        while (scan.hasNextLine()) {
            fileContent = fileContent.concat(scan.nextLine() + "\n");
        }
        data.close();
        FileWriter writer = new FileWriter("D:\\data.txt");
        fileContent = fileContent.concat(username + "\n" + password + "\n" + fullname + "\n" + age + "\n" + sexuality + "\n" + country + "\n" + favFood + "\n" + favSport + "\n" + favArt + "\n" + morale + "\n" + nature);
        writer.write(fileContent);
        writer.close();
    }

    public String[] getInformation(String username) throws IOException {
        String[] infoArray = new String[9];
        FileReader data = new FileReader("D:\\data.txt");
        Scanner scan = new Scanner(data);
        String fileContent = "";
        int counter = lineCounter();
        for (int i = 0; i < counter; i++) {
            fileContent = fileContent.concat(scan.nextLine());
            if (fileContent.equals(username)) {
                fileContent = "";
                fileContent = fileContent.concat(scan.nextLine());
                fileContent = "";
                for (int j = 0; j < 9; j++) {
                    fileContent = fileContent.concat(scan.nextLine());
                    infoArray[j] = fileContent;
                    fileContent = "";
                }
                i += 10;
            } else {
                i += 10;
                for (int j = 0; j < 10; j++) {
                    fileContent = fileContent.concat(scan.nextLine());
                }
                fileContent = "";
            }
        }
        data.close();
        return infoArray;
    }

    public int lineCounter() throws FileNotFoundException {
        File data = new File("D:\\data.txt");
        Scanner scanner = new Scanner(data);
        String stemp = "";
        int i = 0;
        while (scanner.hasNextLine()) {
            stemp = stemp.concat(scanner.nextLine());
            i++;
        }
        return i;
    }

    public int reportlineCounter() throws FileNotFoundException {
        File data = new File("D:\\report.txt");
        Scanner scanner = new Scanner(data);
        String stemp="";int i=0;
        while(scanner.hasNextLine()){
            stemp=stemp.concat(scanner.nextLine());
            i++;
        }
        return i ;
    }



    public String searchfavorites(String food, String sport, String art, String morale, String nature) throws FileNotFoundException {
        FileReader data = new FileReader("D:\\data.txt");
        Scanner scan = new Scanner(data);
        String fileContent = "";
        int counter = lineCounter();
        String username = "";
        String answer = "";
        String[] array = new String[5];
        for (int i = 0; i < counter; i += 11) {
            fileContent = fileContent.concat(scan.nextLine());
            username = fileContent;
            for (int j = 0; j < 5; j++) {
                fileContent = fileContent.concat(scan.nextLine());
            }
            for (int k = 0; k < 5; k++) {
                fileContent = "";
                fileContent = fileContent.concat(scan.nextLine());
                array[k] = fileContent;
            }
            if (array[0].equals(food) && array[1].equals(sport) && array[2].equals(art) && array[3].equals(morale) && array[4].equals(nature)) {
                fileContent = "";
                answer = answer.concat(username + "*");
                username = "";
            } else {
                fileContent = "";
            }
        }
        return answer;
    }

    public String deleteUserAndgetpassword(String username) throws IOException {
        String data = "";
        String password = "";
        FileReader fileReader = new FileReader("D:\\data.txt");
        Scanner scan = new Scanner(fileReader);
        String fileContent = "";
        while (scan.hasNextLine()) {
            fileContent = "";
            fileContent = fileContent.concat(scan.nextLine());
            if (fileContent.equals(username)) {
                fileContent = "";
                fileContent = fileContent.concat(scan.nextLine());
                password = fileContent;
                for (int i = 0; i < 9; i++) {
                    fileContent = fileContent.concat(scan.nextLine());
                }
            } else {
                data = data.concat(fileContent + "\n");
                fileContent = "";
                for (int i = 0; i < 10; i++) {
                    fileContent = fileContent.concat(scan.nextLine());
                    data = data.concat(fileContent + "\n");
                    fileContent = "";
                }
            }
        }
        fileReader.close();
        FileWriter fileWriter = new FileWriter("D:\\data.txt");
        fileWriter.write(data);
        fileWriter.close();
        return password;
    }

    public void deleteUser(String username) throws IOException {
        String data = "";
        FileReader fileReader = new FileReader("D:\\data.txt");
        Scanner scan = new Scanner(fileReader);
        String fileContent = "";
        while (scan.hasNextLine()) {
            fileContent = "";
            fileContent = fileContent.concat(scan.nextLine());
            if (fileContent.equals(username)) {
                fileContent = "";
                fileContent = fileContent.concat(scan.nextLine());
                for (int i = 0; i < 9; i++) {
                    fileContent = fileContent.concat(scan.nextLine());
                }
            } else {
                data = data.concat(fileContent + "\n");
                fileContent = "";
                for (int i = 0; i < 10; i++) {
                    fileContent = fileContent.concat(scan.nextLine());
                    data = data.concat(fileContent + "\n");
                    fileContent = "";
                }
            }
        }
        fileReader.close();
        FileWriter fileWriter = new FileWriter("D:\\data.txt");
        fileWriter.write(data);
        fileWriter.close();
        FileReader fileReader2 = new FileReader("D:\\report.txt");
        scan = new Scanner(fileReader2);
        fileContent="";
        data="";
        while (scan.hasNextLine()){
            fileContent=fileContent.concat(scan.nextLine());
            if (!fileContent.equals(username)){
                data=fileContent;
            }
            fileContent="";
        }
        fileReader2.close();
        FileWriter fileWriter2 = new FileWriter("D:\\report.txt");
        fileWriter2.write(data);
        fileWriter2.close();
    }

    public void changePassword(String username, String newpassword) throws IOException {
        FileReader fileReader = new FileReader("D:\\data.txt");
        Scanner scan = new Scanner(fileReader);
        String data = "";
        String fileContent = "";
        while (scan.hasNextLine()) {
            fileContent = fileContent.concat(scan.nextLine());
            if (fileContent.equals(username)) {
                data = data.concat(fileContent + "\n");
                fileContent = "";
                fileContent = fileContent.concat(scan.nextLine());
                fileContent = "";
                data = data.concat(newpassword + "\n");
                for (int i = 0; i < 9; i++) {
                    fileContent = fileContent.concat(scan.nextLine());
                    data = data.concat(fileContent + "\n");
                    fileContent = "";
                }
            } else {
                data = data.concat(fileContent + "\n");
                fileContent = "";
                for (int i = 0; i < 10; i++) {
                    fileContent = fileContent.concat(scan.nextLine());
                    data = data.concat(fileContent + "\n");
                    fileContent = "";
                }
            }
        }
        fileReader.close();
        FileWriter fileWriter = new FileWriter("D:\\data.txt");
        fileWriter.write(data);
        fileWriter.close();
    }

    public void report(String username) throws IOException {
        FileReader report = new FileReader("D:\\report.txt");
        Scanner scan = new Scanner(report);
        String filecontent="" , str = "";
        int counter = reportlineCounter();
        if (!isReported(username)) {
            for (int i = 0; i < counter; i++) {
                filecontent = filecontent.concat(scan.nextLine() + "\n");
            }
            filecontent = filecontent.concat(username);
            report.close();
            FileWriter report2 = new FileWriter("D:\\report.txt");
            report2.write(filecontent);
            report2.close();
            JOptionPane.showMessageDialog(null , "Reported!" , "Massage" , JOptionPane.WARNING_MESSAGE);

        }else{
            JOptionPane.showMessageDialog(null , "This account has already reported!" , "Massage" , JOptionPane.WARNING_MESSAGE);
        }
    }

    private boolean isReported(String username) throws IOException {
        FileReader data = new FileReader("D:\\report.txt");
        Scanner scan = new Scanner(data);
        String fileContent = "";
        int counter = reportlineCounter();
        for (int i=0 ; i<counter ; i++){
            fileContent=fileContent.concat(scan.nextLine());
            if (fileContent.equals(username)) {
                data.close();
                return true;
            } else {
                i+=10;
                for (int j = 0; j <10; j++) {
                    fileContent = fileContent.concat(scan.nextLine());
                }
            }
            fileContent="";
        }
        return false;
    }

    public String Getreports() throws IOException{
        FileReader fileReader = new FileReader("D:\\report.txt");
        Scanner scan = new Scanner(fileReader);
        String answer = "";
        String fileContent = "";
        while (scan.hasNextLine()){
            fileContent = "";
            fileContent = fileContent.concat(scan.nextLine());
            answer = answer.concat(fileContent + "*");
        }
        fileReader.close();
        return answer;
    }

    public void Request (String usernamestr,String username) throws IOException{
        FileWriter fileWriter = new FileWriter("D:\\requests.txt",true);
        fileWriter.write("username\n" + username + "\n" + usernamestr + "\n");
        fileWriter.close();
    }

    public String Getrequests (String username) throws IOException{
        FileReader fileReader = new FileReader("D:\\requests.txt");
        Scanner scan = new Scanner(fileReader);

        String str = "";
        String fileContent = "";
        while (scan.hasNextLine()){
            fileContent = "";
            fileContent = fileContent.concat(scan.nextLine());
            if (fileContent.equalsIgnoreCase("username")) {
                fileContent = "";
                fileContent = fileContent.concat(scan.nextLine());
                if (fileContent.equalsIgnoreCase(username)) {
                    fileContent = "";
                    fileContent = fileContent.concat(scan.nextLine());
                    str = str.concat(fileContent + "*");
                }
            }
        }
        fileReader.close();
        return str;
    }

    public  boolean Isfirend (String usernamestr,String username) throws IOException{
        FileReader fileReader = new FileReader("D:\\friends.txt");
        Scanner scan = new Scanner(fileReader);
        String str = "";
        String fileContent = "";
        Boolean b = false;
        while (scan.hasNextLine()){
            fileContent = "";
            fileContent = fileContent.concat(scan.nextLine());
            if (fileContent.equalsIgnoreCase("username")) {
                fileContent = "";
                fileContent = fileContent.concat(scan.nextLine());
                if (fileContent.equalsIgnoreCase(username)) {
                    fileContent = "";
                    fileContent = fileContent.concat(scan.nextLine());
                    if (fileContent.equalsIgnoreCase(usernamestr)){
                        b = true;
                    }
                }
            }
        }
        fileReader.close();
        if (b)
            return true;
        else
            return false;
    }

    public void Addtofriends (String usernamestr,String username) throws IOException{
        FileWriter fileWriter = new FileWriter("D:\\friends.txt",true);
        if (Isfirend(usernamestr,username)){
            JOptionPane.showMessageDialog(null,"This account is Repetition!");
        }
        else {
            fileWriter.write("username\n" + username + "\n" + usernamestr + "\n");
            JOptionPane.showMessageDialog(null , "Added to friends.");
        }
        fileWriter.close();
    }

    public String Getfriends (String username) throws IOException {
        FileReader fileReader = new FileReader("D:\\friends.txt");
        Scanner scan = new Scanner(fileReader);
        String str = "";
        String fileContent = "";
        while (scan.hasNextLine()){
            fileContent = "";
            fileContent = fileContent.concat(scan.nextLine());
            if (fileContent.equalsIgnoreCase("username")) {
                fileContent = "";
                fileContent = fileContent.concat(scan.nextLine());
                if (fileContent.equalsIgnoreCase(username)) {
                    fileContent = "";
                    fileContent = fileContent.concat(scan.nextLine());
                    str = str.concat(fileContent + "*");
                }
            }
        }
        fileReader.close();
        return str;
    }
}
