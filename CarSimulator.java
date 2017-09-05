package carsimulator;


public class CarSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Car c1 = new Car("red",30,2010,4);
        //Car c1 = new Car("red");
        System.out.println(c1.getDoors());
        //boolean b = c1.turnOn();
        c1.turnOn();
        c1.accelerate();
        c1.accelerate(10);
        c1.brake();  // spped from 4 to 2
        c1.moveBack();
        
        System.out.println(c1.temp);
        System.out.println(c1.isRunning);
        
        c1.turnOff();
        System.out.println(c1.isRunning);
        
        Bus b1 = new Bus();
        System.out.println(b1.getDoors());
        b1.turnOn();
        b1.accelerate();
        b1.accelerate();
        b1.brake();  //Speed from 2 to 1
        b1.moveBack();
        
        
        Motor m1 = new Motor();
        
        //Car c2 = new Car("Balck",30,2012,8);
        Car c2 = new Car();
        c2.turnOn();
        System.out.println(c2.temp);
        
        //Car c3 = new Car("Yellow",30,2011,10);
        Car c3 = new Car();
        //System.out.println(c3.color);
        
        
        Employee e1 = new Employee("Ahmed","Ali", 20, 1000);
        e1.mycar = c2;  //ايه عربية الموظف الاول
        c2.driver = e1; // اسمه ايه سواق العربية الاولى
        System.out.println(e1.mycar.color);
        System.out.println(c2.driver.firstName);
        
        Employee e2 = new Employee("Hassan","Zaki", 30, 2000);
        e1.mycar = c1;
        c1.driver = e1;
        
        //c1.passengers[0] = e1;
        //c1.passengers[3] = ;
        
        //c2.passengers[1] = e1;  // نفس الاوبجكت اكتر من ريفرانس يشاوروا عليه
        
        System.out.println(e1.getRaise(0.1));
        System.out.println(e2.firstName);
        
        
        /*
        c1.color="Red";
        c1.gas=20;
        c1.isRunning=false;
        c1.speed= 0;
        c1.temp=30; 
        */
        
    }
    
}
