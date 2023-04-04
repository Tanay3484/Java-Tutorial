package SingletonPattern;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        //illegal construct
        //SingleObject object = new SingleObject();
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }
}