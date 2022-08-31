package lei;

public class teshugoujianxinxi {
    private int id;
    private int qiaoliaoKaID;
    private String name;
    private String bujian;
    private String goujianname;
    private int goujianid;
    private String zhushi;
    private String imgid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "teshugoujianxinxi{" +
                "id=" + id +
                ", qiaoliaoKaID=" + qiaoliaoKaID +
                ", bujian='" + bujian + '\'' +
                ", goujianname='" + goujianname + '\'' +
                ", goujianid=" + goujianid +
                ", zhushi='" + zhushi + '\'' +
                ", imgid='" + imgid + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQiaoliaoKaID() {
        return qiaoliaoKaID;
    }

    public void setQiaoliaoKaID(int qiaoliaoKaID) {
        this.qiaoliaoKaID = qiaoliaoKaID;
    }

    public String getBujian() {
        return bujian;
    }

    public void setBujian(String bujian) {
        this.bujian = bujian;
    }

    public String getGoujianname() {
        return goujianname;
    }

    public void setGoujianname(String goujianname) {
        this.goujianname = goujianname;
    }

    public int getGoujianid() {
        return goujianid;
    }

    public void setGoujianid(int goujianid) {
        this.goujianid = goujianid;
    }

    public String getZhushi() {
        return zhushi;
    }

    public void setZhushi(String zhushi) {
        this.zhushi = zhushi;
    }

    public String getImgid() {
        return imgid;
    }

    public void setImgid(String imgid) {
        this.imgid = imgid;
    }
}
