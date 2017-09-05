package carsimulator;


public class Vehicle {
    
    public int speed;
    private double gas;
    public double temp;
    public String color;
    public int year;
    public boolean isRunning;    
    
    //Vehicle has a driver
    public Employee driver;    //Reference to object  (Object Datatype)
    //Vehicle has passengers
    public Employee[] passengers;  //Array of employees ده بيكريت اربعة ريفرانس من نوع امبلوي 
    //Vehicle has tires    
    public Tube[] tires; //= new Tube[4];
        
    //Object Composition حاجة بتحتوي على حاجة
    //Car has passengers
    
    
    public Vehicle(){
        System.out.println("Vehicle is constructed");
    }
    public Vehicle(String s){
            System.out.println("Vehicle with String");
    }  
    public Vehicle(String color, double temp, int year, int size){
            
             this.passengers = new Employee[size];
               this.color = color;
               if(year < 2012){
                   this.gas = 30;
               }else{
                   this.gas = 50;
               }
               
               this.isRunning = false;
               this.speed = 0;
               this.temp = temp;
               this.year = year;
               
               //this.tires[0] = new Tube("Black",300);
               //this.tires[1] = new Tube("Black",300);
               //this.tires[2] = new Tube("Brown",350);
               //this.tires[3] = new Tube("Brown",350);
               //اوبجكت من نوع تيوب وحطه في ريفرانس تايرز اوف زيرو   
    }
    
    
    public boolean turnOn(){
        this.isRunning = true;
        this.gas--;      
        this.temp++;
            
        return isRunning;
    }
        
    public void turnOff(){
        isRunning = false;
    }

    public void accelerate(){
        if(isRunning){
            this.gas--;  
            this.speed++;
        }
    }
    
    //Overloading
    public void accelerate(int x){
        if(isRunning){
            gas--;  
            speed = speed + x;
        }
    }
        
        
    public void brake(){
        if(isRunning){
            speed--;
        }
        System.out.println("Vehicle is braked to speed " + speed);
    }

    /**
     * @return the gas
     */
    public double getGas() {
        return gas;
    }

    /**
     * @param gas the gas to set
     */
    public void setGas(double gas) {
        this.gas = gas;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}


