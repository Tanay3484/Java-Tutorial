package ProxyPattern;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("testimg.png");

        image.display();
        System.out.println("");

        image.display();
    }
}
