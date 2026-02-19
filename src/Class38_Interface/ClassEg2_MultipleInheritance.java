package Class38_Interface;
class Dad1 {
    public void getPocketMoney() {
        System.out.println("Pocket money from Dad");
    }
}

class Mom1 {
    public void getPocketMoney() {
        System.out.println("Pocket money from Mom");
    }
}

//class Child extends Dad, Mom // --- Multiple inheritance with class in NOT Allowed

class Child1 extends Dad1{

}

public class ClassEg2_MultipleInheritance {
    static void main(String[] args) {
        Child1 c = new Child1();
        c.getPocketMoney();
    }

}
