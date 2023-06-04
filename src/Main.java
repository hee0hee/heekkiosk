package src;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Menu> menuList = new ArrayList<>();
        //new ArrayList<>() 자동완성 안돼서 고침!!! + ctrl+alt+v 누르면 위와 같게 나옴
        //<Menu> menuList는 클래스 등에 맞게 수정
        Menu 원조 = new Menu("원조 빽스치노", "원조커피의 시원한 변신~! 매력만점 커피 빽스치노");
        Menu 딸기 = new Menu("딸기 빽스치노", "상큼한 국산딸기와 우유가 블렌딩된 완전딸기 빽스치노");
        Menu 초코 = new Menu("초코 빽스치노", "초콜릿을 함께 블렌딩하여 더욱 진한 맛의 빽스치노");
        Menu 녹차 = new Menu("녹차 빽스치노", "100% 국내산 녹차를 사용하여 부드럽고 진한 맛의 빽스치노!");
        Menu 쿠키 = new Menu("쿠키 크런치 빽스치노", "달콤한 쿠키 크런치가 듬뿍 들어간 빽스치노");
        //메뉴에 이런 것들이 있다 (메뉴리스트에 넣을거다)

        menuList.add(원조);
        menuList.add(딸기);
        menuList.add(초코);
        menuList.add(녹차);
        menuList.add(쿠키);
        //메뉴리스트에 add 넣는다!

        //System.out.println(menuList); -> 주소값이 나온다

        System.out.println("빽다방에 오신 것을 환영합니다");
        System.out.println("메뉴를 골라 번호를 입력해주세요");
        System.out.println();

        System.out.println("[ PAIK'S MENU ]");
        //menuList.for -> for문으로 자동완성
        for (int i = 0; i < menuList.size(); i++) {
            Menu menu = menuList.get(i);

            System.out.println((i+1) + ". " + menu.name + " | " + menu.description);
        }
            
        }

    }
