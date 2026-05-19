
interface Bicycle_1{
    void changeCadence(int newValue);
    void changeGear(int newValue);
    void speedUp(int increment);
    void speedDown(int decrement);
}

class Bicycle implements Bicycle_1{
    int cadence=0;
    int speed=0;
    int gear=1;
    public void changeCadence(int newValue){
        cadence=newValue;
    }
    public void changeGear(int newValue){
        gear=newValue;
    }
    public void speedUp(int increment){
        speed=speed+increment;
    }
    public void speedDown(int decrement){
        speed=speed-decrement;
    }
    void printStates(){
        System.out.println("cadence:"+cadence+" speed:"+speed+" gear:"+ gear);
    }
}

/*
This class doesnot contain the main() method because it is not a complete application.
It is just the blueprint for bicycles that might be used in an application.
*/

class BicycleDemo{
    public static void main(String[] ags){
        //create 2 different bicycle objects
        Bicycle bike1= new Bicycle();
        Bicycle bike2= new Bicycle();
        //Invoke methods on these objects
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(20);
        bike2.changeGear(3);
        bike2.printStates();

        MountainBike mb1=new MountainBike();
        mb1.changeCadence(60);
        mb1.speedUp(40);
        mb1.changeGear(2);
        mb1.changeHandlePos(-1);
        mb1.printStates();
    }
}

class MountainBike extends Bicycle{
    int handlePos=0;
    void changeHandlePos(int newPos){
        handlePos=newPos;
    }
    void printStates(){
        System.out.println("Cadence: "+cadence+" Gear: "+ gear+" speed: "+speed+" Handle Position: "+handlePos);
    }
}

