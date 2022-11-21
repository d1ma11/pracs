package prac12;

public class PhoneNumber {
    private String code, city, triplet, quadruple;

    public PhoneNumber(String phone){
        if(phone.startsWith("8")){
            code = "+7";
        }else{
            code = phone.substring(0, phone.length()-10);
        }
        city = phone.substring(phone.length()-10, phone.length()-7);
        triplet = phone.substring(phone.length()-7, phone.length()-4);
        quadruple = phone.substring(phone.length()-4);
    }

    @Override
    public String toString() {
        return code + city + "-" + triplet + "-" + quadruple;
    }

    public static void main(String[] args) {
        System.out.println(new PhoneNumber("89174108831"));
        System.out.println(new PhoneNumber("+59154789121"));
        System.out.println(new PhoneNumber("+15494126795463"));
        System.out.println(new PhoneNumber("+165494265423"));
    }
}