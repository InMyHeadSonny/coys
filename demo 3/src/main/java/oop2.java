//다음과 같은 실행결과를 얻도록 student클래스에 생성자와 info()를 추가하시오.

class oop2 {
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
        int totalScore = koreanScore + mathScore + englishScore;
        double averageScore = (double) totalScore / 3;

        return "이름: " + name +
                "\n학년: " + grade +
                "\n반: " + classNum +
                "\n국어 점수: " + koreanScore +
                "\n수학 점수: " + mathScore +
                "\n영어 점수: " + englishScore +
                "\n도합 점수: " + totalScore +
                "\n평균 점수: " + averageScore ;
    }
}