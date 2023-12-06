class MyTv {
    private int currentChannel;
    private int prevChannel; // 추가: 이전 채널을 저장하는 변수
    private int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int newChannel) {
        if (newChannel >= MIN_CHANNEL && newChannel <= MAX_CHANNEL) {
            currentChannel = newChannel;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume >= MIN_VOLUME && newVolume <= MAX_VOLUME) {
            volume = newVolume;
        }
    }

    // 이전 채널로 이동하는 메서드
    public void gotoPrevChannel() {
        if (prevChannel != 0) { // 이전 채널이 기록되어 있을 때만 적용
            int temp = currentChannel;
            currentChannel = prevChannel;
            prevChannel = temp;
        }
    }

    // 채널 변경 시, 이전 채널을 갱신하는 메서드
    public void setChannel(int newChannel) {
        if (newChannel >= MIN_CHANNEL && newChannel <= MAX_CHANNEL) {
            prevChannel = currentChannel;
            currentChannel = newChannel;
        }
    }
}
