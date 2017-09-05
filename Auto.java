package carsimulator;

public class Auto extends Vehicle{
 
        private boolean airCondition;
        private int doors;
    
        public Auto(){
            System.out.println("Auto is constructed");
        }
        
        public Auto(String s){
            super(s);
            System.out.println("Auto with String");
        }
        
       
        public Auto(String color, double temp, int year, int size){
            super(color, temp, year, size);  
        }
       
        
        public boolean isAirCondition() {
            return airCondition;
        }


        public void setAirCondition(boolean airCondition) {
            this.airCondition = airCondition;
        }
        
        
        public void moveBack() {
            System.out.println("Auto is moving back");
        }

    
        public int getDoors() {
            return doors;
        }


        public void setDoors(int doors) {
            this.doors = doors;
        }

        
        
        
        
        












        
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
