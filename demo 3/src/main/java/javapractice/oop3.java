package javapractice;

//연습문제 6-1에서 정의한 student클래스에 다음과 같이 정의된 두 개의 메서드 getTotal()과 getAverage 를 추가하시오

class oop3 {
    public static void main(String[] args) {
        Student s = new Student("홍길동", 1, 1, 100, 60, 76);

        String str = s.info();
        System.out.println(str);
    }
}

class Student{
    String name;
    int grade;
    int classNum;
    int koreanScore;
    int mathScore;
    int englishScore;
    public Student(String name, int grade, int classNum, int koreanScore, int mathScore, int englishScore) {
        this.name = name;
        this.grade = grade;
        this.classNum = classNum;
        this.koreanScore = koreanScore;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
    }

    // info() 메서드 추가
    public String info() {
        int getTotal = koreanScore + mathScore + englishScore;
        double getAverage = (float) getTotal / 3;
        String formattedAverage = String.format("%.1f", getAverage);

        return "이름: " + name +
                "\n학년: " + grade +
                "\n반: " + classNum +
                "\n국어 점수: " + koreanScore +
                "\n수학 점수: " + mathScore +
                "\n영어 점수: " + englishScore +
                "\n도합 점수: " + getTotal +
                "\n평균 점수: " + formattedAverage ;
    }
}