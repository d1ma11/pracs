package prac24.task2;

public class Main {
    public static void main(String[] args) {

        ChairFactory chairFactory = new ChairFactory();

        FunctionalChair functionalChair = chairFactory.createFunctionalChair();
        MagicChair magicChair = chairFactory.createMagicChair();
        VictorianChair victorianChair = chairFactory.createVictorianChair(256);

        System.out.println(functionalChair.sum(2,5));
        magicChair.doMagic();
        System.out.println(victorianChair.getAge());

        Client client = new Client();
        client.setChair(magicChair);
        client.sit();
    }
}
