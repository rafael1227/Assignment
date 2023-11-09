package Homework5;
class PersonalComputer {
	public void turnOn() {
        System.out.println("Turning on the computer.");
        System.out.println("Turning on the monitor.");
	}
}
class Computer {
    private String cpu;
    private String memory;
    private String hdd;
    private String color;
    private String power2;

    public Computer(String cpu, String memory, String hdd, String color, String power2) {
        this.cpu = cpu;
        this.memory = memory;
        this.hdd = hdd;
        this.color = color;
        this.power2 = power2;
    }
    
    public void turnOn() {
        System.out.println("Computer is turned on.");
    }
    
    public void printInfo() {
        System.out.println("The spec of the computer");
        System.out.println(" CPU: " + cpu);
        System.out.println(" Memory: " + memory);
        System.out.println(" HDD: " + hdd);
        System.out.println(" Color: " + color);
        System.out.println(" Power: " + power2);
    }
}	
class Monitor {
    private String size;
    private String color;
    private String power1;

    public Monitor(String size, String color, String power1) {
        this.size = size;
        this.color = color;
        this.power1 = power1;
    }

    public void printInfo() {
        System.out.println("The spec of the computer");
        System.out.println(" Size: " + size);
        System.out.println(" Color: " + color);
        System.out.println(" Power: " + power1);
    }
}

public class Homework5 {
    public static void main(String[] args) {
    	PersonalComputer pc = new PersonalComputer();
        Monitor monitor = new Monitor("32인치", "검은색", "45W");
        Computer computer = new Computer("Core i7", "32GB", "2TB", "흰색", "700W");
        
        pc.turnOn();
        computer.printInfo();
        monitor.printInfo();
    }
}