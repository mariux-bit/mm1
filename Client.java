public class Client{
    int ID;
    Float TArrival;
    float TStart_Service; 
    float TService_Time;
     // constracter
     public Client( )
     {

     }
    public Client( int ID,Float TArrival,Float TStart_Service ,Float TService_Time)
    {
        this.ID=ID;
        this.TArrival=TArrival;
        this.TStart_Service= TStart_Service;
        this.TService_Time = TService_Time;
    }
    //the getters
    public int getID() {
        return ID;
    }
    public float getTArrival() {
        return TArrival;
    }
    public float getTStart_Service() {
        return TStart_Service;
    }
    public float getTService_Time() {
        return TService_Time;
    }
    // the setters
    public void setID(int ID) {
        this.ID =ID;
    }
    public void setTArrival(Float TArrival) {
        this.TArrival =TArrival;
    }
    public void setTStart_Service(Float TStart_Service) {
        this.TStart_Service=TStart_Service;
    }
    public void setTService_Time(Float TService_Time) {
        this.TService_Time=TService_Time;
    }
}