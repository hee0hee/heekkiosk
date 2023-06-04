package src;

public class Menu {
    String name; //name(변수-이름)을 String(글 형태)로 쓸거다
    String description; //description(변수-설명)을 String(글 형태)로 쓸거다

    Menu(String name, String description) {
        this.name = name;
        this.description = description;
        //name, description을 this로 해주기(정확하게 이해가 아직도 안되지만... 생성자(this)로 객체화...? 어쨌든 해야하는 걸로 인식)
    }

    String getName() {
        return name; //getName으로 name을 반환 = name를 getName에 넣어주기?!
    }

    String getDescription() {
        return description; //getDescription으로 description을 반환 =  description을 getDescription에 넣어주기?!
    }


}
