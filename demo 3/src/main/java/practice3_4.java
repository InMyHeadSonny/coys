public class practice3_4 {
    public static void main(String[] args) {
        int numOfApples = 123; // 사과의 개수
        int sizeOfBucket = 10; // 바구니의 크기
        int numOfBucket = (numOfApples / sizeOfBucket) + ((numOfApples % sizeOfBucket > 0) ? 1 : 0);  /* 모든 사과를 담는 데 필요한 바구니의 수 */
        System.out.println("필요한 바구니의 수 : " + numOfBucket);
    }
}
