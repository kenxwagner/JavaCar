
package javacar;

/**
 *
 * @author ken.wagner
 */
public class JavaCar {

     String nameOfCar = "Average Car";
    int maxSpeedMph = 150;
    int maxSpeedKph = 200;
    double zeroToSixty = 9.5; //zeroto60times.com and estimated for sedan
    int maxHP = 200;
    double startingPrice = 33560; //Kelly Blue book
   
	
    
    public void printVariables() {
        System.out.println("Car Model: " + nameOfCar);
        System.out.println("It has a maximum speed of: " + maxSpeedMph + " Mph");
        System.out.println("Maximum speed in Metric: " + maxSpeedKph + " Kph");
        System.out.println("Zero to Sixty: " + zeroToSixty + " Seconds");
        System.out.println("horsepower: " + maxHP);
        System.out.println("You have to spend at least: $" + startingPrice);
        
    } 
    
public void fastCar1() { 
nameOfCar = "Hennessey Venom GT"; 
maxSpeedMph = 270; 
maxSpeedKph = 435; 
zeroToSixty = 2.5; 
maxHP = 1244; 
startingPrice = 1000000; 
}
public void fastCar2() { 
 nameOfCar = "Bugatti Veyron Super Sport"; 
 maxSpeedMph = 268; 
 maxSpeedKph = 431; 
 zeroToSixty = 2.4; 
 maxHP = 1200; 
 startingPrice = 2400000; 
}
public void fastCar3() { 
 nameOfCar = "Koenigsegg Agera R"; 
 maxSpeedMph = 260; 
 maxSpeedKph = 418; 
 zeroToSixty = 2.9; 
 maxHP = 1099; 
 startingPrice = 1600000; 
}
public void fastCar4() { 
 nameOfCar = "SSC Ultimate Aero"; 
 maxSpeedMph = 257; 
 maxSpeedKph = 413; 
 zeroToSixty = 2.7; 
 maxHP = 1183; 
 startingPrice = 654400; 
}
public void fastCar5() { 
 nameOfCar = "9ff GT9-R"; 
 maxSpeedMph = 257; 
 maxSpeedKph = 413; 
 zeroToSixty = 2.9; 
 maxHP = 1120; 
 startingPrice = 695000; 
}
public void fastCar6() { 
 nameOfCar = " Saleen S7 Twin-Turbo"; 
 maxSpeedMph = 248; 
 maxSpeedKph = 399; 
 zeroToSixty = 2.8; 
 maxHP = 750; 
 startingPrice = 555000; 
}
public void fastCar7() { 
 nameOfCar = " Koenigsegg CCX"; 
 maxSpeedMph = 245; 
 maxSpeedKph = 394; 
 zeroToSixty = 3.2; 
 maxHP = 806; 
 startingPrice = 545568; 
}
public void fastCar8() { 
 nameOfCar = " McLaren F1"; 
 maxSpeedMph = 240; 
 maxSpeedKph = 386; 
 zeroToSixty = 3.2; 
 maxHP = 627; 
 startingPrice = 970000; 
}
public void fastCar9() { 
 nameOfCar = " Zenvo ST1"; 
 maxSpeedMph = 233; 
 maxSpeedKph = 374; 
 zeroToSixty = 2.9; 
 maxHP = 1104; 
 startingPrice = 1225000; 
}
public void fastCar10() { 
 nameOfCar = " Pagani Huayra"; 
 maxSpeedMph = 230; 
 maxSpeedKph = 370; 
 zeroToSixty = 3; 
 maxHP = 720; 
 startingPrice = 1273500; 
}
public void fastCar11() { 
 nameOfCar = " Gumpert Apollo"; 
 maxSpeedMph = 225; 
 maxSpeedKph = 362; 
 zeroToSixty = 3; 
 maxHP = 650; 
 startingPrice = 450000; 
}
public void fastCar12() { 
 nameOfCar = " Noble M600"; 
 maxSpeedMph = 225; 
 maxSpeedKph = 362; 
 zeroToSixty = 3.7; 
 maxHP = 650; 
 startingPrice = 330000; 
}

     public static void main(String[] args) {
        // TODO code application logic here
        JavaCar someCar = new JavaCar();
        System.out.println("Average Car:");
        someCar.printVariables();
        System.out.println();
                 
        someCar.fastCar2(); 
        someCar.printVariables(); 
        System.out.println(); 
        someCar.fastCar3(); 
        someCar.printVariables(); 
        System.out.println(); 
        someCar.fastCar4(); 
        someCar.printVariables(); 
        System.out.println(); 
        someCar.fastCar5(); 
        someCar.printVariables(); 
        System.out.println(); 
        someCar.fastCar6(); 
        someCar.printVariables(); 
        System.out.println(); 
        someCar.fastCar7(); 
        someCar.printVariables(); 
        System.out.println(); 
        someCar.fastCar8(); 
        someCar.printVariables(); 
        System.out.println(); 
        someCar.fastCar9(); 
        someCar.printVariables(); 
        System.out.println(); 
        someCar.fastCar10(); 
        someCar.printVariables(); 
        System.out.println(); 
        someCar.fastCar11(); 
        someCar.printVariables(); 
        System.out.println(); 
        someCar.fastCar12(); 
        someCar.printVariables(); 
        System.out.println(); 
    }
}