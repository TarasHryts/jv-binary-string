package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        String temp = "";
        if (value == 0) {
            temp = "0";
        } else {
            while (value != 0) {
                temp = value % 2 + temp;
                value = value / 2;
            }
        }
        return temp;
    }
}
