public class Phone {
    private String currentCall;

    public Phone() {
        this.currentCall = "";
    }

    public void makeCall(String number) {
        this.currentCall = number;
        System.out.println("Calling: " + number);
    }

    public void endCall() {
        System.out.println("Ending call with: " + currentCall);
        this.currentCall = "";
    }

    public void answerCall() {
        System.out.println("Answering call.");
    }

    public void rejectCall() {
        System.out.println("Rejecting call.");
        this.currentCall = "";
    }

    public String getCurrentCall() {
        return currentCall;
    }
}
