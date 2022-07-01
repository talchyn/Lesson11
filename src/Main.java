public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setHit(50);
        boss.setProtection("Fire");
        System.out.println(boss.getHealth() + " " + boss.getHit() + " " + boss.getProtection());

    }
}