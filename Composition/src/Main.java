//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2008","Dell","240W");
        Monitor theMonitor = new Monitor("27inch Beast", "Acer",27,"2540x1440");
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus",4,6,"v2.44");
        PersonalComputer thePC = new PersonalComputer("2008","Dell",theMonitor,theMotherboard,theCase);
//        thePC.getMonitor().drawPixelAt(10,10,"Red");
//        thePC.getMotherboard().loadProgram("Windows OS");
//        thePC.getComputerCase().pressPowerButton();
        thePC.powerUp();
    }

}