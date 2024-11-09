package basetask;

public class TrainMethodsIf {

    public int returnNewInt(int intNumber) {
        if (intNumber < 8) {
            return intNumber * 7;
        } else {
            return intNumber / 4;
        }
    }

    public long returnNewLong(long longNumber) {
        if (longNumber > 300) {
            return longNumber - 300;
        } else {
            return longNumber + 20;
        }
    }

    public String returnNewChar(char character) {
        if (character == 'g') {
            return character + "o";
        } else {
            return "o" + character;
        }
    }

    public float returnNewFloat(float floatNumber) {
        if (floatNumber == 0.67) {
            return floatNumber;
        } else {
            return floatNumber * 2;
        }
    }

    public double returnNewDouble(double doubleNumber) {
        if (doubleNumber > 30 && doubleNumber < 80) {
            return doubleNumber + 87;
        } else if (doubleNumber > 80 && doubleNumber < 400) {
            return doubleNumber - 87;
        } else if (doubleNumber > 400) {
            return doubleNumber / 4;
        } else {
            return doubleNumber;
        }
    }

    public void returnNewBoolean(boolean booleanValue) {
        if (booleanValue) {
            System.out.println("Я получил на вход значение истины");
        } else {
            System.out.println("Я получил на вход ложь");
        }
    }
}
