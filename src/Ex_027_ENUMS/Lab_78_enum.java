package Ex_027_ENUMS;

public enum Lab_78_enum {


    vwo("https://app.vwo.com"),
    katalon("https://katalon.com"),
    google("https://google.com");

    private String url;

    Lab_78_enum(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
