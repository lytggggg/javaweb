package lei;

public class url {
    private String jd;
    private String wd;
    private String url;
private String name;
    @Override
    public String toString() {
        return "url{" +
                "jd='" + jd + '\'' +
                ", wd='" + wd + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    public String getJd() {
        return jd;
    }

    public void setJd(String jd) {
        this.jd = jd;
    }

    public String getWd() {
        return wd;
    }

    public void setWd(String wd) {
        this.wd = wd;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
