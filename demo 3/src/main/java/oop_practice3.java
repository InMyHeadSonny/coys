class MyTv {
    private boolean IsPowerOn;
    private int channel;
    private int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1; // 수정: MIN_CHANNEL 이름 변경



    // 수정: 채널 및 볼륨을 설정하는 메서드 추가
    void setChannel(int newChannel) {
        if (newChannel >= MIN_CHANNEL && newChannel <= MAX_CHANNEL) {
            channel = newChannel;
        }
    }

    int getChannel() {
        return channel;
    }

    void setVolume(int newVolume) {
        if (newVolume >= MIN_VOLUME && newVolume <= MAX_VOLUME) {
            volume = newVolume;
        }
    }

    int getVolume() {
        return volume;
    }
}

public class oop_practice3 {
    public static void main(String[] args) {
        MyTv t = new MyTv();

        t.setChannel(10);
        System.out.println("CH: " + t.getChannel()); // 수정: println 문 오류 수정
        t.setVolume(20);
        System.out.println("VOL: " + t.getVolume()); // 수정: println 문 오류 수정
    }
}
