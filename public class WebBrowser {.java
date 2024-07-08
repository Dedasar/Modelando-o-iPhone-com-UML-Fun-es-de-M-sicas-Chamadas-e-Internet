public class WebBrowser {
    private String currentURL;

    public WebBrowser() {
        this.currentURL = "";
    }

    public void navigateTo(String url) {
        this.currentURL = url;
        System.out.println("Navigating to: " + url);
    }

    public void refresh() {
        System.out.println("Refreshing: " + currentURL);
    }

    public void goBack() {
        System.out.println("Going back to the previous page.");
    }

    public void goForward() {
        System.out.println("Going forward to the next page.");
    }

    public String getCurrentURL() {
        return currentURL;
    }
}
