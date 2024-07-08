public class MusicPlayer {
    private String currentTrack;
    private int volume;

    public MusicPlayer() {
        this.currentTrack = "";
        this.volume = 20; 
    }

    public void play() {
        System.out.println("Playing track: " + currentTrack);
    }

    public void pause() {
        System.out.println("Pausing track: " + currentTrack);
    }

    public void skipForward() {
        System.out.println("Skipping to the next track.");
    }

    public void rewind() {
        System.out.println("Rewinding the track.");
    }

    public void adjustVolume(int level) {
        this.volume = level;
        System.out.println("Volume set to: " + volume);
    }

    public void setCurrentTrack(String currentTrack) {
        this.currentTrack = currentTrack;
    }
}
