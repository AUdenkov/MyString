package Conver;

public class BaseConverter {
    private int temp;

    public BaseConverter(int temp) {
        this.temp = temp;
    }

    public double ConvertKelvin() {
        return temp + 273.15;
    }

    public double ConvertFarengeit() {
        return (temp*9/5)+32;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
}
