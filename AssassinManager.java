import java.util.*;
public class AssassinManager {
    
    public void runPracticeGame(){
        Scanner input = new Scanner(System.in);
        LinkedList <String> linky = new LinkedList<String> (); 
        LinkedList <String> deathList = new LinkedList<String>();
        Iterator <String>  it = linky.iterator();
        
        linky.add("bob");
        linky.add("jonathan");
        linky.add("nerd");
        linky.add("angelo");
        linky.add("brian");

        

        Boolean run = true;
        
        int i = 0;
        while(run){
            
            int linkSize = linky.size() -1;
            
            if(i > linkSize){
                i = 0;
            }
            
            int j = i+1;
            String turn = linky.get(i);
            
            if (linkSize == 0){
                System.out.println(turn + " winner");
                run = false;
                break;
            }
            
            if (i == linkSize){
                 j = 0 ; 
            }   
                
            System.out.println(turn + " who you killin");
            String answer = input.next();
            
            System.out.println(i + " i size \n" + j + " j num  and \n" + linkSize + " linky size");
                   
            String nextPlayer = linky.get(j);
             
            if((answer).equalsIgnoreCase(nextPlayer)){
                System.out.println("nice kill");
                linky.remove(answer);
                deathList.add(answer);
                System.out.println(deathList + "death list");
                i++;
            }else{
                System.out.println("thats a miss.");
                i++;
            }
        }
    }
    public static void runGame(AssassinNode linky){
        Scanner input = new Scanner(System.in);
        //AssassinNode linky = new AssassinNode();
        AssassinNode deathList = new AssassinNode();
        
        linky.add("bob");
        linky.add("jonathan");
        linky.add("nerd");
        linky.add("angelo");
        linky.add("brian");

        

        Boolean run = true;
        
        int i = 0;
        while(run){
            
            int linkSize = linky.getSize() -1;
            
            if(i > linkSize){
                i = 0;
            }
            
            int j = i+1;
            String turn = linky.getStringAt(i);
            
            if (linkSize == 0){
                System.out.println(turn + " winner");
                run = false;
                break;
            }
            
            if (i == linkSize){
                 j = 0 ; 
            }   
                
            System.out.println(turn + " who you killin");
            String answer = input.next();
            if(answer.equals("-1")){
                run = false;
                break;
            }
            
            System.out.println(i + " i size \n" + j + " j num  and \n" + linkSize + " linky size");
                   
            String nextPlayer = linky.getStringAt(j);
             
            if((answer).equalsIgnoreCase(nextPlayer)){
                System.out.println("nice kill");
                linky.remove(answer);
                deathList.add(answer);
                System.out.println(deathList + " death list");
                i++;
            }else{
                System.out.println("thats a miss.");
                i++;
            }
        }

    }
}
    

