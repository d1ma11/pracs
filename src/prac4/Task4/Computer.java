package prac4.Task4;

public class Computer {
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    private Brands brand;

    Computer(Processor processor, Memory memory, Monitor monitor, Brands brand) {
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
        this.brand = brand;
    }

    private static class Processor {
        private String processor;

        Processor(String processor) {
            this.processor = processor;
        }

        @Override
        public String toString() {
            return "processor='" + processor + '\'';
        }
    }

    private static class Memory {
        private String memory;
        private int capacity;

        Memory(String memory, int capacity) {
            this.memory = memory;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return "memory='" + memory + '\'' +
                    ", capacity=" + capacity;
        }
    }

    private static class Monitor {
        private String monitor;
        private int hertz;

        Monitor(String monitor, int hertz) {
            this.monitor = monitor;
            this.hertz = hertz;
        }

        @Override
        public String toString() {
            return "monitor='" + monitor + '\'' +
                    ", hertz=" + hertz;
        }
    }

    @Override
    public String toString() {
        return "Computer {" +
                "Processor: " + processor +
                ", \n\tMemory: " + memory +
                ", \n\tMonitor: " + monitor +
                ", \n\tBrand - " + brand +
                '}';
    }

    public static void main(String[] args) {
        Computer computer = new Computer(
                new Processor("Intel"),
                new Memory("Kingston", 1024),
                new Monitor("ASUS", 240),
                Brands.ASUS
        );

        System.out.println(computer);
    }
}

enum Brands {
    ASUS,
    APPLE,
    IBM,
    DELL,
}
