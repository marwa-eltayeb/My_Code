package carsimulator;

//Bus is Auto
public class Bus extends Auto{
  
    private String wcStatus;
    
    public Bus(){
            this.setDoors(3);
            this.tires = new Tube[6];
            this.passengers = new Employee[50];
    }

    /**
     * @return the wcStatus
     */
    public String getWcStatus() {
        return wcStatus;
    }

    /**
     * @param wcStatus the wcStatus to set
     */
    public void setWcStatus(String wcStatus) {
        this.wcStatus = wcStatus;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
