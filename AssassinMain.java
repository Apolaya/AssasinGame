import java.util.Iterator;
import java.util.*;
import java.io.*;
import javax.naming.InvalidNameException;
import java.util.*;
public class AssassinMain {
    public static void main(String [] args) throws InvalidNameException , FileNotFoundException{

        
        AssassinManager game = new AssassinManager();
        AssassinNode text = readFile();
        game.runGame(text);
        
    
    }
    public static AssassinNode readFile()throws FileNotFoundException{
        File text = new File("/Users/apolaya/Documents/namesText/names.txt");
        AssassinNode linkyFile = new AssassinNode();
        Scanner read = new Scanner(text);
        
        while (read.hasNextLine()){
            String temp = read.nextLine();
            linkyFile.add(temp);
         }
         
         return linkyFile;



    }
    
}           
                
                
            
            
     
            
           
               

              
  
