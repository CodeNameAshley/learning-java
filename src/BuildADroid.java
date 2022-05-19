public class BuildADroid {
    String name;
    int batteryLevel;

    // Creating a droid
    public void Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }

    // Task method
    public void performTask(String task) {
        System.out.println(name + " is performing task: " + task);
        batteryLevel -= 10;
        System.out.println("Battery level: " + batteryLevel);
    }

    // Energy report method
    public void energyReport() {
        System.out.println("Codey's battery level is currently at " + batteryLevel);
    }

    // Exchange battery level
    public int energyTransfer(String droidTwo, String droidOne, int battery) {
        int addEnergy = batteryLevel + battery;
        System.out.println("Transferring " + battery + " energy from droid " + droidTwo + " to droid " + droidOne);
        int addCharge = batteryLevel + battery;
        return addCharge;
    }

    // Introducing the droid
    public String toString() {
        return "Hello, I'm the droid: " + name;
    }


    public static void main(String[] args){
        Droid droidOne = new Droid("Codey");
        Droid droidTwo = new Droid("Zack");
        // System.out.println(droidOne);
        droidOne.performTask("cooking!");
        droidTwo.energyTransfer("Zack", "Codey", 10);
        droidOne.energyReport();

    }
}
