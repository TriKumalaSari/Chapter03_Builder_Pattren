public class Main {

    public static void main(String[] args) {

        // Build a Robot with all properties using setters
        Robot robot1 = new Robot();
        robot1.setShield("Energy Shield");
        robot1.setGun("Plasma Cannon");
        robot1.setSword("Vibroblade");
        robot1.setBrainchip("AI Core v3.0");
        System.out.println("Robot 1 details:\n" + robot1.toString());

        // Build a Robot with RobotBuilder using fluent interface
        Robot robot2 = new RobotBuilder()
                .shield("Titanium Alloy")
                .gun("Laser Rifle")
                .sword(null)  // Set sword to null
                .brainchip("Military Grade Processor")
                .getResult();
        System.out.println("\nRobot 2 details:\n" + robot2.toString());

        System.out.println("\n \n");

        // Membuat objek ComputerSetBuilder
        ComputerSetBuilder builder = new ComputerSetBuilder();

        // Mengatur nilai atribut-atribut dari objek ComputerSet menggunakan builder
        builder.keyboard("Standard Keyboard");
        builder.mouse("Optical Mouse");
        builder.speaker("Stereo Speaker");
        builder.monitor("LED Monitor");

        // Mendapatkan objek ComputerSet yang telah dibangun
        ComputerSet computerSet = builder.getResult();

        // Mengakses nilai atribut-atribut dari objek ComputerSet
        System.out.println("Keyboard: " + computerSet.getKeyboard());
        System.out.println("Mouse: " + computerSet.getMouse());
        System.out.println("Speaker: " + computerSet.getSpeaker());
        System.out.println("Monitor: " + computerSet.getMonitor());

System.out.println("\n \n");
S
// Kelas Utama untuk menguji pola builder
Rumah rumah = new RumahBuilder()
                        .setTipe("Villa")
                        .setKamarTidur(4)
                        .setKamarMandi(3)
                        .setPunyaGarasi(true)
                        .setPunyaTaman(true)
                        .build();

                // Menampilkan informasi tentang objek Rumah yang telah dibangun
                System.out.println("Rumah yang telah dibangun:");
                System.out.println(rumah);
        }
}