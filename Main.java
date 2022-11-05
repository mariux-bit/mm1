import java.util.LinkedList;

public class Main {
    String server;

    void  Initialisation(){
        String server= "idle";
        float Tnow= 0;
        float Arrival_Time;
        float Service_Time;
    }
    void Parrival(){
        Client c = new Client();

        Mettre Client dans la Queue ;

        if (Server== "idle") { 
            Create_Event (type=Start_Service, time=Tnow) ; 
            
        }
        Create_Event (type=Arrival, time=Tnow+Arrival_Time) ; 

    }
    void PStart_Service(){

    }
    void PDeparture(){

    }
    void  Statistics(){


    }
    void Create_Event(){

    }
    void Get_Event(){

    }




    public static void main(String[] args) {

        Event e = new Event();

        LinkedList<Event> eventlist = new LinkedList<Event>();
        eventlist.add(e);

        Client c = new Client();

        LinkedList<Client> clientlist = new LinkedList<Client>();
        clientlist.add(c);
        
   
        
    }
    
}
