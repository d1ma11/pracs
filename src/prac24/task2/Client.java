package prac24.task2;

public class Client {
    private Chair chair;

    public void sit() {
        System.out.println("Client's sitting on the "
                + chair.getType().toLowerCase()
                + ". Nonsense!");
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
