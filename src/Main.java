public class Main {
    public static void main(String[] args) {

        Action action = new Action();

        action.setName1("グー");
        action.setName2("チョキ");
        action.setName3("パー");

        action.syoubu();
        System.out.println("勝ちor負けと、あいこがある。");

    }
}
