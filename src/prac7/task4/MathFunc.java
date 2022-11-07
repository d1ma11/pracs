package prac7.task4;

class MathFunc implements MathCaclulable{
    @Override
    public long power(int value, int powValue) {
        long ans = 1;
        for(int i = 0; i < powValue; i++) {
            ans *= value;
        }
        return ans;
    }

    @Override
    public float abs(float re, float im) {
        return (float) Math.sqrt(re*re + im*im);
    }

    public static void main(String[] args) {
        MathCaclulable mc1 = new MathFunc();

        System.out.println(mc1.power(4,2));
        System.out.println(mc1.abs(1.3f,2.5f));
    }
}
