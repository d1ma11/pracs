package prac4_1.task4;

public class Tester {
    public static void main(String[] args){
        double[][] arr1 = {{1,2}, {3,4}};
        double[][] arr2 = {{4,3}, {2,1}};
        Matrix m1 = new Matrix(2,2, arr1);
        Matrix m2 = new Matrix(2,2, arr2);
        System.out.println(m1.sum(m2));
        System.out.println(m1.mult(m2));
        System.out.println(m2.numMult(3));
    }
}