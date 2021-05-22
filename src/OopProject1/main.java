package OopProject1;

public class main {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();

        smartPhone.turnOn();
        smartPhone.turnOff();
        smartPhone.camera();
        smartPhone.playMusic();
        smartPhone.answer();
        smartPhone.hangUp();

        AdvancedPhone.IdPass ip = new AdvancedPhone.IdPass();
        ip.setId("Rockstar");
        ip.setPass(76543);
        System.out.println(ip.getId());
        System.out.println(ip.getPass());


    }

}
