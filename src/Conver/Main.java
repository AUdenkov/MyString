package Conver;

public class Main {
    public static void main(String[] args) {
        BaseConverter baseConverter=new BaseConverter(100);
        System.out.println(baseConverter.ConvertKelvin());
        System.out.println(baseConverter.ConvertFarengeit());
    }
}
