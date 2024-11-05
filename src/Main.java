public class Main {
    public static void main(String[] args) throws InterruptedException {
        Light light = new Light();
        while (true) {
            try {
                light.changeColor();
            } catch (MyException e) {
                System.out.println("变灯异常：" + e.getMessage());
            }
        }
    }

}
