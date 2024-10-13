package generic.ex1;

public class RowTypeMain {
    public static void main(String[] args) {
        // row type 권장하지 않음
//        GenericBox integerBox = new GenericBox(); 
         GenericBox<Object> integerBox = new GenericBox<>(); // 권장
        integerBox.set(10);
        Integer result = (Integer) integerBox.get(); //캐스팅 문제가 있다.
        System.out.println("result = " + result);
    }
}
