package Class38_Interface;
interface Dad {
    default void getPocketMoneyFromDad() {
        System.out.println("Pocket money from Dad");
    }
}

interface Mom {
    default void getPocketMoneyFromMom() {
        System.out.println("Pocket money from Mom");
    }
}

class Child implements Dad, Mom{

}

public class InterfaceEg2_MultipleInheritance {
    static void main(String[] args) {
        Child c = new Child();
        c.getPocketMoneyFromDad();
        c.getPocketMoneyFromMom();
    }

}
