package entity;


import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WebTestEntity that = (WebTestEntity) o;
        return Objects.equals(url, that.url) && Objects.equals(search, that.search);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, search);
    }
}
