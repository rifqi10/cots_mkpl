/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hapid.cots;

/**
 *
 * @author denri
 */
public class Counter {
    private int value;

    public Counter() {
        this.clear();
    }

    public void clear() {
        value = 0;
    }

    public void add() {
        value++;
    }

    public void addBy(int num) {
        value += num;
    }

    public void subtract() {
        value--;
    }

    public void subtractBy(int num) {
        value -= num;
    }

    public void multiplyBy(int num) {
        value *= num;
    }

    public void triple() {
        value *= 3;
    }

    public void raiseToPower(int exponent) {
        value = (int) Math.pow(value, exponent);
    }

    public boolean isValueEven() {
        return value % 2 == 0;
    }

    public int getValue() {
        return value;
    }

}
