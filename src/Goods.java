package src;

import java.util.ArrayList;

public class Goods extends Menu { //public class Goods(자식) / extends Menu(부모) = Goods는 Menu에 상속
    int price; //price(변수-가격)을 int(소수점 아닌 숫자 형태)로 쓸거다

    Goods(String name, String description, int price) {
        super(name, description);  //Menu에서 name과 description를 부모 생성자(super)로 불러옴
        this.price = price; //price를 this로 해주기(정확하게 이해가 아직도 안되지만... 생성자(this)로 객체화...? 어쨌든 해야하는 걸로 인식)
    }

    int getprice() {
        return price; //getprice으로 price를 반환 = price을 getprice에 넣어주기?!
    }

}
