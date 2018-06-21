import java.util.*;
import java.io.*;

public class FileExplorer{

    public static void makeCSV(ArrayList<File> allFiles){
        try {
            File n = new File("./data.csv");
            if(!n.exists()){
                n.createNewFile();
            }
            FileWriter fw = new FileWriter(n);
            String ans = "Name,Path\n";
            for(int i=0;i<allFiles.size();i++){
                ans += allFiles.get(i).getName();
                ans += ",";
                ans += allFiles.get(i).getPath();
                ans += "\n";
            }

            for(int i=0;i<ans.length();i++){
                fw.append(ans.charAt(i));
            }
            fw.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static ArrayList<File> myFiles(String name){
        try{
            ArrayList<File> allFiles = new ArrayList<>();
            File d = new File(name);
            File[] listOfDirectory = d.listFiles();
            System.out.println(listOfDirectory);
            if(listOfDirectory!=null){
                for(File newFile : listOfDirectory){
                    if(newFile.isFile()){
                        allFiles.add(newFile);
                    }else if(newFile.isDirectory()){
                        ArrayList<File> arr = new ArrayList<>(myFiles(newFile.toString()));
                        for(int i=0;i<arr.size();i++){
                            allFiles.add(arr.get(i));
                        }
                    }else{
                        System.out.println("File not found !");
                    }
                }
            }

            return allFiles;
        }catch(Exception e){
            System.out.println(e);
            return new ArrayList<File>();
        }

    }
    
    
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            File f = new File("./abc.txt");
            if(!f.exists()){
                f.createNewFile();
            }
            FileOutputStream fout = new FileOutputStream(f);
            System.out.print("Enter the number of paths : ");
            int n = sc.nextInt();
            System.out.print("Enter the paths to traverse : ");
            String line = "";
            for(int i=0;i<=n;i++){
                line += sc.nextLine();
                line += '\n';
            }
            for(int i=0;i<line.length();i++){
                fout.write(line.charAt(i));
            }
            String makeList;
            FileReader r = new FileReader(f);
            BufferedReader bin = new BufferedReader(r);
            while((makeList = bin.readLine())!=null){
                makeCSV(myFiles(makeList));
            }
            
            System.out.println("CSV file Created Success Fully !");
        }catch(Exception e){
            System.out.println(e);
        }

    }
}