package entity;


public class WebTestEntity {
    String url;
    String search;

    public WebTestEntity(String url, String search) {
        this.url = url;
        this.search = search;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    @Override
    public String toString() {
        return "WebTestEntity{" +
                "url='" + url + '\'' +
                ", search='" + search + '\'' +
                '}';
    }
}
