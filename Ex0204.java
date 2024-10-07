public class Ex0204 {
    public static void main(String[] args) {
        Robot robita = new Robot(new Position(10, 20), "ロビタ");
        System.out.println("[Start]");
        Robot robitaMkII = robita;
        System.out.println("移動前の robita = " + robita);
        robita.moveX(10);
        System.out.println("移動後の robita = " + robita);
        System.out.println("robitaMkII = " + robitaMkII);
        System.out.println("[Goal]");
    }
}