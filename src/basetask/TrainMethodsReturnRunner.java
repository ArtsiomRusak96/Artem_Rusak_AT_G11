package basetask;

public class TrainMethodsReturnRunner {

    public static void main(String[] args) {
        TrainMethodsReturn trainMethodsReturn = new TrainMethodsReturn();
        System.out.println("метод returnNewInt вернул " + trainMethodsReturn.returnNewInt(45));
        System.out.println("метод returnNewLong вернул " + trainMethodsReturn.returnNewLong(111));
        System.out.println("метод returnNewChar вернул " + trainMethodsReturn.returnNewChar('Q'));
        System.out.println("метод returnNewFloat вернул " + trainMethodsReturn.returnNewFloat(333.792f));
        System.out.println("метод returnNewDouble вернул " + trainMethodsReturn.returnNewDouble(0.123456));
        System.out.println("метод returnNewShort вернул " + trainMethodsReturn.returnNewShort((short) 142));
        System.out.println("метод returnNewByte вернул " + trainMethodsReturn.returnNewByte((byte) 41));
        System.out.println("метод returnNewBoolean вернул " + trainMethodsReturn.returnNewBoolean(false));
    }
}
