package prac6.task10;

public class Computer {
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    private Brands brand;
    private int price;

    Computer(Brands brand, Monitor monitor, Processor processor, Memory memory, int price) {
        this.monitor = monitor;
        this.processor = processor;
        this.memory = memory;
        this.price = price;
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }
}

