package javapractice;

//다음의 코드에 정의된 변수들을 종류별로 구분해서 적으시오
public class oop5 {
    int kind;
    int num;

    static int width;
    static int height;

    oop5(int k, int n) {
        kind = k;
        num = n;
    }

    public static void main(String[] args) {
        oop5 card = new oop5(1,1);
    }
}

//클래스 변수 : width,height             인스턴스 변수 : kind,num                   지역변수 : card
