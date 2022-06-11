public class Action {

    public String name1;
    public String name2;
    public String name3;

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public void syoubu(){
        System.out.println("じゃんけんの最初は" + name1);
        System.out.println(name1 + "は、" + name2 + "に勝ち！" +
                name3 + "に負ける。");
        System.out.println(name2 + "は、" + name3 + "に勝ち！" +
                name1 + "に負ける。");
        System.out.println(name3 + "は、" + name1 + "に勝ち！" +
                name2 + "に負ける。");
    }
}
