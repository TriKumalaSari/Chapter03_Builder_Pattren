public class Robot {

    private String shield, sword, gun, brainchip;

    /**
     * Deklarasikan konstruktor kosong yang mampu membuat bagian-bagian Robot dasar tanpa
     *      * menyimpulkan parameter yang terlalu panjang untuk mendeklarasikan suatu objek
     */
    public Robot() {
    }

    public String getShield() {

        return shield;
    }

    public void setShield(String shield) {

        this.shield = shield;
    }

    public String getSword() {

        return sword;
    }

    public void setSword(String sword) {

        this.sword = sword;
    }

    public String getGun() {

        return gun;
    }

    public void setGun(String gun) {

        this.gun = gun;
    }

    public String getBrainchip() {
        return brainchip;
    }

    public void setBrainchip(String brainchip) {

        this.brainchip = brainchip;
    }

    @Override
    public String toString() {
        return "Robot Properties"
                + "\n-----------"
                + "\nShield: " + getShield()
                + "\nGun: " + getGun()
                + "\nSword: " + getSword()
                + "\nBrain chip: " + getBrainchip();
    }

}

class RobotBuilder {
    private Robot robot;

    public RobotBuilder() {

        this(new Robot());
    }

    public RobotBuilder(Robot robot) {

        this.robot = robot;
    }

    public RobotBuilder shield(String shield) {
        robot.setShield(shield);
        return this;
    }

    public RobotBuilder gun(String gun) {
        robot.setGun(gun);
        return this;
    }
    public RobotBuilder sword(String sword) {
        robot.setSword(sword);
        return this;
    }
    public RobotBuilder brainchip(String brainchip) {
        robot.setBrainchip(brainchip);
        return this;
    }

    public Robot getResult() {

        return robot;
    }
}