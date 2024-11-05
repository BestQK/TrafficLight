public class Light {
    private static final int RED_TIME = 15;
    private static final int GREEN_TIME = 10;
    private static final int YELLOW_TIME = 3;
    private String color;

    public Light() {
        color = "red";
    }

    public void changeColor() throws InterruptedException, MyException {
        switch (color) {
            case "red":
                for (int j = RED_TIME; j > 0; j--) {
                    Thread.sleep(1000);
                    System.out.println("当前灯：" + color + ", 倒计时：" + j);
                }
                color = "green";
                break;
            case "green":
                for (int j = GREEN_TIME; j > 0; j--) {
                    Thread.sleep(1000);
                    System.out.println("当前灯：" + color + "倒计时：" + j);
                }

                color = "yellow";
                break;
            case "yellow":
                for (int j = YELLOW_TIME; j > 0; j--) {
                    Thread.sleep(1000);
                    System.out.println("当前灯：" + color + "倒计时：" + j);
                }

                color = "red";
                break;
            default:
                throw new MyException("change color error");
        }
    }
}
