package cycletask;

public class WhileCycleExample {

//    My solution:
    public void trainWhileCycle() {
        int i = 0;
        String stringWithValues = "";
        while (i < 21) {
            stringWithValues = stringWithValues + i++ + " ";
        }
        System.out.println(stringWithValues);
    }

//    Solution from IDEA:
//    public void trainWhile() {
//        int i = 0;
//        StringBuilder stringWithValues = new StringBuilder();
//        while (i < 21) {
//            stringWithValues.append(i++).append(" ");
//        }
//        System.out.println(stringWithValues);
//    }
}
