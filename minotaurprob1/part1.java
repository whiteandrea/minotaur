
import java.util.Random;

class Guests extends Thread{
    public void run(){

    }
}



public class part1 {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        
        //number of guests 
        int n = 100;

        //arrays to mark guests and to mark visits
        Guests[] guestArr = new Guests[n];
        boolean[] visited = new boolean[n];

        int count = n;

        while(true){
            if(count == 0){
                finished(n, guestArr, visited);
                break;
            }


            int guestToVisit = rand.nextInt(n);
            if(visited[guestToVisit] == false){
                //this guest has not visited
                count -=1;
                visited[guestToVisit] = true;

                Guests guest = new Guests();

                guestArr[guestToVisit] = guest; 
                guestArr[guestToVisit].start();
            } 
            
            System.out.println("Guest " + guestToVisit + " is visiting");
            
        }

        

    }

    public static void finished(int n, Guests guestArr[], boolean visited[]){
        //stop all threads and check that everyone has visited. 
        for(int i = 0; i<n;i++){
            if(visited[i]){
                System.out.println("Guest " + i + " has visited");
                guestArr[i].stop();
            }
            else{
                System.out.println("Guest " + i + " has not visited");
            }
        }
    }
}
