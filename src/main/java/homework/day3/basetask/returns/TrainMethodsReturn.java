package homework.day3.basetask.returns;

public class TrainMethodsReturn {

    public int returnNewInt(int intNumber) {
        return intNumber * 3;
    }

    public long returnNewLong(long longNumber) {
        return longNumber - 4;
    }

    public String returnNewChar(char character) {
        return "" + character + character;
    }

    public float returnNewFloat(float floatNumber) {
        return floatNumber / 2;
    }

    public double returnNewDouble(double doubleNumber) {
        return doubleNumber + 8;
    }

    public short returnNewShort(short shortNumber) {
        return (short) (shortNumber - 1);
    }

    public byte returnNewByte(byte byteNumber) {
        return (byte) (byteNumber * 2);
    }

    public boolean returnNewBoolean(boolean booleanValue) {
        return !booleanValue;
    }
}
