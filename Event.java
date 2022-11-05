public class Event {
    Float Time;
    
    public enum Type {
        Arrival, Start_Service , Départure,
      }
    //constructur
    public Event(){


    }
    public Event(float Time){
        this.Time=Time;

    }
    //getters
    public float getTime(float Time) {
        return Time;
    }
    public Type getArrivalType() {
        return Type.Arrival;
    }
    public Type getStart_serviceType() {
        return Type.Start_Service;
    }
    public Type getDépartureType() {
        return Type.Départure;
    }
    //setters
    public void setTime(float   Time){
        this.Time=Time;
    }

}
