
package javacar;

/**
 *
 * @author ken.wagner
 */
public class JavaCar {

    int maxSpeedMph = 150;
    int maxSpeedKph = 200;
    double zeroToSixty = 9.5; //zeroto60times.com and estimated for sedan
    int maxHP = 300;
    double startingPrice = 33560; //Kelly Blue book
    String nameOfCar = "Average Car";
	
    
    public void printVariables() {
        System.out.println("Car Model: " + nameOfCar);
        System.out.println("It has a maximum speed of: " + maxSpeedMph + " Mph");
        System.out.println("Maximum speed in Metric: " + maxSpeedKph + " Kph");
        System.out.println("Zero to Sixty: " + zeroToSixty + " Mph");
        System.out.println("horsepower: " + maxHP);
        System.out.println("You have to spend at least: $" + startingPrice);
        
    } 
    
    public void fastCar1() { 
String nameOfCar = "Hennessey Venom GT"; 
int maxSpeedMph = 270; 
int maxSpeedKph = 435; 
double zeroToSixty = 2.5; 
int maxHP = 1244; 
double startingPrice = 1000000; 
}
public void fastCar2() { 
String nameOfCar = "Bugatti Veyron Super Sport"; 
int maxSpeedMph = 268; 
int maxSpeedKph = 431; 
double zeroToSixty = 2.4; 
int maxHP = 1200; 
double startingPrice = 2400000; 
}
public void fastCar3() { 
String nameOfCar = "Koenigsegg Agera R"; 
int maxSpeedMph = 260; 
int maxSpeedKph = 418; 
double zeroToSixty = 2.9; 
int maxHP = 1099; 
double startingPrice = 1600000; 
}
public void fastCar4() { 
String nameOfCar = "SSC Ultimate Aero"; 
int maxSpeedMph = 257; 
int maxSpeedKph = 413; 
double zeroToSixty = 2.7; 
int maxHP = 1183; 
double startingPrice = 654400; 
}
public void fastCar5() { 
String nameOfCar = "9ff GT9-R"; 
int maxSpeedMph = 257; 
int maxSpeedKph = 413; 
double zeroToSixty = 2.9; 
int maxHP = 1120; 
double startingPrice = 695000; 
}
public void fastCar6() { 
String nameOfCar = " Saleen S7 Twin-Turbo"; 
int maxSpeedMph = 248; 
int maxSpeedKph = 399; 
double zeroToSixty = 2.8; 
int maxHP = 750; 
double startingPrice = 555000; 
}
public void fastCar7() { 
String nameOfCar = " Koenigsegg CCX"; 
int maxSpeedMph = 245; 
int maxSpeedKph = 394; 
double zeroToSixty = 3.2; 
int maxHP = 806; 
double startingPrice = 545568; 
}
public void fastCar8() { 
String nameOfCar = " McLaren F1"; 
int maxSpeedMph = 240; 
int maxSpeedKph = 386; 
double zeroToSixty = 3.2; 
int maxHP = 627; 
double startingPrice = 970000; 
}
public void fastCar9() { 
String nameOfCar = " Zenvo ST1"; 
int maxSpeedMph = 233; 
int maxSpeedKph = 374; 
double zeroToSixty = 2.9; 
int maxHP = 1104; 
double startingPrice = 1225000; 
}
public void fastCar10() { 
String nameOfCar = " Pagani Huayra"; 
int maxSpeedMph = 230; 
int maxSpeedKph = 370; 
double zeroToSixty = 3; 
int maxHP = 720; 
double startingPrice = 1273500; 
}
public void fastCar11() { 
String nameOfCar = " Gumpert Apollo"; 
int maxSpeedMph = 225; 
int maxSpeedKph = 362; 
double zeroToSixty = 3; 
int maxHP = 650; 
double startingPrice = 450000; 
}
public void fastCar12() { 
String nameOfCar = " Noble M600"; 
int maxSpeedMph = 225; 
int maxSpeedKph = 362; 
double zeroToSixty = 3.7; 
int maxHP = 650; 
double startingPrice = 330000; 
}

     public static void main(String[] args) {
        // TODO code application logic here
        JavaCar someCar = new JavaCar();
        System.out.println("Family Car:");
        someCar.printVariables();
        JavaCar speedCar = someCar;
        speedCar.fastCar1();
        speedCar.printVariables();
        speedCar.fastCar2();
        speedCar.fastCar3();
        speedCar.fastCar4();
        speedCar.fastCar5();
        speedCar.fastCar6();
        speedCar.fastCar7();
        speedCar.fastCar8();
        speedCar.fastCar9();
        speedCar.fastCar10();
        speedCar.fastCar11();
        speedCar.fastCar12();
    }
}