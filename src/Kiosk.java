package src;

import java.util.ArrayList;
import java.util.Map;

public class Kiosk {
    public static void main(String[] args) {
        Kiosk kiosk = new Kiosk();
    }

    private Map<String, ArrayList<Menu>> menus;
    private Map<String, ArrayList<Goods>> menuGoods;

    private void menuGoods() {
        ArrayList<Menu> menuList = new ArrayList<>();
        //new ArrayList<>() 자동완성 안돼서 고침!!! + ctrl+alt+v 누르면 위와 같게 나옴
        //<Menu> menuList는 클래스 등에 맞게 수정

        Menu juice = new Menu("음료", "퀄리티 높은 식자재를 사용하여 맛있는 음료를 제공합니다");
        Menu dessert = new Menu("디저트", "달콤 아이스크림부터 든든 브레드까지 다양하게 즐기세요");
        //메뉴에 이런 것들이 있다 (메뉴리스트에 넣을거다)

        menuList.add(juice);
        menuList.add(dessert);
        //메뉴리스트에 add 넣는다!

        //System.out.println(menuList); -> 주소값이 나온다

        ArrayList<Menu> juiceMenu = new ArrayList<>();
        Menu 원조B = new Goods("원조 빽스치노 Basic", "원조커피의 시원한 변신~! 매력만점 커피 빽스치노", 3800);
        Menu 원조S = new Goods("원조 빽스치노 Soft", "원조커피의 시원한 변신~! 매력만점 커피 빽스치노", 4300);
        Menu 딸기B = new Goods("딸기 빽스치노 Basic", "상큼한 국산딸기와 우유가 블렌딩된 완전딸기 빽스치노", 3800);
        Menu 딸기S = new Goods("딸기 빽스치노 Soft", "상큼한 국산딸기와 우유가 블렌딩된 완전딸기 빽스치노", 4300);
        Menu 초코B = new Goods("초코 빽스치노 Basic", "초콜릿을 함께 블렌딩하여 더욱 진한 맛의 빽스치노", 3800);
        Menu 초코S = new Goods("초코 빽스치노 Soft", "초콜릿을 함께 블렌딩하여 더욱 진한 맛의 빽스치노", 4300);
        Menu 녹차B = new Goods("녹차 빽스치노 Basic", "100% 국내산 녹차를 사용하여 부드럽고 진한 맛의 빽스치노!", 3800);
        Menu 녹차S = new Goods("녹차 빽스치노 Soft", "100% 국내산 녹차를 사용하여 부드럽고 진한 맛의 빽스치노!", 4300);
        Menu 쿠키B = new Goods("쿠키 크런치 빽스치노 Basic", "달콤한 쿠키 크런치가 듬뿍 들어간 빽스치노", 3800);
        Menu 쿠키S = new Goods("쿠키 크런치 빽스치노 Soft", "달콤한 쿠키 크런치가 듬뿍 들어간 빽스치노", 4300);
        juiceMenu.add(원조B);
        juiceMenu.add(원조S);
        juiceMenu.add(딸기B);
        juiceMenu.add(딸기S);
        juiceMenu.add(초코B);
        juiceMenu.add(초코S);
        juiceMenu.add(녹차B);
        juiceMenu.add(녹차S);
        juiceMenu.add(쿠키B);
        juiceMenu.add(쿠키S);
        //juiceMenu.add(new Goods("원조 빽스치노 Basic", "원조커피의 시원한 변신~! 매력만점 커피 빽스치노", 3800));

        ArrayList<Menu> dessertMenu = new ArrayList<>();
        Menu 크리미슈 = new Goods("크리미슈", "비스킷과 부드러운 크림의 환상 조합!", 2000);
        Menu 네모머핀 = new Goods("네모머핀", "초코칩이 들어있는 진한 초코 맛 머핀", 2500);
        Menu 사라다빵 = new Goods("사라다빵", "어린시절 빵집에서 사먹던 추억의 감자 사라다빵", 3500);
        Menu 소세지빵 = new Goods("소세지빵", "소시지에 치즈를 듬뿍 얹고 옥수수까지 더한 소세지빵", 3500);
        Menu 큰마들렌 = new Goods("큰마들렌", "약 13cm의 큰!마들렌, 촉촉하고 부드러운 플레인 맛으로 커피 메뉴와 함께 즐겨보세요", 2800);
        Menu 노말한소프트 = new Goods("노말한소프트", "입안에서 부드럽게 사르륵 녹는 마성의 아이스크림", 2000);
        Menu 아포가토 = new Goods("아포가토", "소프트 아이스크림과 코코아파우더를 곁들여 더욱 맛있는 더블 에스프레소", 3500);
        Menu 달고나크런치 = new Goods("달고나크런치", "바삭한 달고나와 부드러운 아이스크림이 잘 어울리는 달고나크런치", 2500);
        dessertMenu.add(크리미슈);
        dessertMenu.add(네모머핀);
        dessertMenu.add(사라다빵);
        dessertMenu.add(소세지빵);
        dessertMenu.add(큰마들렌);
        dessertMenu.add(노말한소프트);
        dessertMenu.add(아포가토);
        dessertMenu.add(달고나크런치);
        //dessertMenu.add(new Goods("크리미슈", "비스킷과 부드러운 크림의 환상 조합!", 2000));
    }
}
