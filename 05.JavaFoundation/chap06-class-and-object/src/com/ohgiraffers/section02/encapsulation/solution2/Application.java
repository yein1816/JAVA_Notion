package com.ohgiraffers.section02.encapsulation.solution2;

public class Application {
    public static void main(String[] args) {

        /* Children 클래스의 필드를 name -> nickname으로 변경하면 setName, getChildren 메소드 내의 코드는 변경이 필요하다.
        *  하지만 사용자의 호출 코드는 변경하지 않아도 된다. 따라서 유지보수성이 향상 된다. */
        Children children1 = new Children();
        children1.setName("강희영");
        children1.setAge(7);
        /* 필드에 private 접근 제한자를 붙였기 때문에 직접 접근하려고 하면 compile error 발생 */
//        children1.nickname = "강희영";
//        children1.age = -7;

        /* 캡슐화는 유지보수성을 증가시키기 위해 팔드의 직접 접근을 제한하고
        *  public 메소드를 이용해 간접적으로 접근하여 사용할 수 있도록 만든 기술이다.
        *  클래스 작성 시 특별한 목적이 아닌 이상 캡슐화가 기본 원칙으로 사용 되고 있다.*/

        Children children2 = new Children();
        children2.setName("이상인");
        children2.setAge(-9);

        Children children3 = new Children();
        children3.setName("김동현");
        children3.setAge(5);

        System.out.println(children1.getChildren());
        System.out.println(children2.getChildren());
        System.out.println(children3.getChildren());
    }




}
