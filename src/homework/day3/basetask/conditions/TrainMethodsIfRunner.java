package homework.day3.basetask.conditions;

public class TrainMethodsIfRunner {

    public static void main(String[] args) {
        TrainMethodsIf trainMethodsIf = new TrainMethodsIf();
        System.out.println(trainMethodsIf.returnNewInt(777888));
        System.out.println(trainMethodsIf.returnNewLong(9090909));
        System.out.println(trainMethodsIf.returnNewChar('k'));
        System.out.println(trainMethodsIf.returnNewFloat(61.76f));
        System.out.println(trainMethodsIf.returnNewDouble(278.331));
        trainMethodsIf.returnNewBoolean(false);
    }
}
