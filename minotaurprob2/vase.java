class GuestThread extends Thread{
    boolean roomOpen;
    GuestThread(boolean roomOpen){
        this.roomOpen = roomOpen;
    }

    public void run(){
        while(true){
            //keep trying until room is open
            if(roomOpen){
                roomOpen = false;
                System.out.println("viewed the vase");
                roomOpen = true;
                break;
            }
        }
       
    }
}

public class vase{
    static int n = 10;
    boolean roomOpen = true;
    boolean[] visited = new boolean[n];

    public static void main(String[] args) throws Exception {
  

        //guest threads
        GuestThread[] guestArr = new GuestThread[n];

        //System.out.println("going");
        for(int i = 0; i<n; i ++){
            String name ="" + i;
            System.out.println("Guest number " + i + " in the queue is attempting to enter");
            GuestThread guest = new GuestThread(true);
            guest.setName(name);
            guestArr[i] = guest;
            guestArr[i].start();

        }

        for(int i = 0; i< n;i++){
            guestArr[i].stop();
        }
    }

}