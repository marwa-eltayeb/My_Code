package carsimulator;

//Car is Auto
public class Car extends Auto{
    
        public Car(){
            System.out.println("Car will be constructed");
            this.setDoors(4);
            this.tires = new Tube[4];
            this.passengers = new Employee[4];
        }
        
        
        public Car(String s){
            super(s);
            System.out.println("Car with String");
        }
        
        
        public Car(String color, double temp, int year, int size){
            super(color, temp, year, size);  
        }
        
        
        
        private boolean safari;
     
        public void setSafari(boolean safari) {
        this.safari = safari;
        }

    
        public boolean isSafari() {
            return safari;
        }
        
        @Override
        public void accelerate(){
            super.accelerate();  // تزيد واحد
            if(this.isRunning){
                this.speed ++;   // تزيد واحد كمان
            }
        }
        
        
        @Override
        public void brake(){
            if(isRunning){
                speed = speed - 2;
            }
            System.out.println("Car is braked to speed " + this.speed);
        }
        
        
       
}
