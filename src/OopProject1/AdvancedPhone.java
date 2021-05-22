package OopProject1;

abstract class AdvancedPhone implements Phone {
    public void turnOn() {
        System.out.println("turn on the Phone ");
    }

    public void turnOff() {
    }

    public static class IdPass {
        private String id;
        private int pass;

        public IdPass() {
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setPass(int pass) {
            this.pass = pass;
        }

        public int getPass() {
            return pass;
        }

        public String getId() {
            return id;
        }
    }
}
