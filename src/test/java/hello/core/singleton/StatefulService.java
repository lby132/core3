package hello.core.singleton;

public class StatefulService {

    // private int price; //싱글톤은 상태를 유지하게 설계하면 안됨

    public int order(String name, int price) {
        System.out.println("name = " + name + " price = " + price);
    //    this.price = price;
        return price;
    }

//    public int getPrice() {
//        return price;
//    }

}
