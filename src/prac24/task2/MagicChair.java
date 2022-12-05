package prac24.task2;

public class MagicChair extends Chair{
    public void doMagic() {
        System.out.println("Look around! Some magic just happened!");
    }

    @Override
    String getType() {
        return "Magic chair";
    }
}
