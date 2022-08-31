package lei;

public class jiegouzhuangtaijilu {
    private int id;
    private int qiaoliaoKaID;
    private String bujian;
    private String goujianname;
    private int goujianid;
    private String state;
    private String badtype;
    private String badchengdu;
    private String badplace;
    private String qinshitype;
    private int imgid;
    private String beizhu;

    @Override
    public String toString() {
        return "jiegouzhuangtaijilu{" +
                "id=" + id +
                ", qiaoliaoKaID=" + qiaoliaoKaID +
                ", bujian='" + bujian + '\'' +
                ", goujianname='" + goujianname + '\'' +
                ", goujianid=" + goujianid +
                ", state='" + state + '\'' +
                ", badtype='" + badtype + '\'' +
                ", badchengdu='" + badchengdu + '\'' +
                ", badplace='" + badplace + '\'' +
                ", qinshitype='" + qinshitype + '\'' +
                ", imgid=" + imgid +
                ", beizhu='" + beizhu + '\'' +
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getBadtype() {
        return badtype;
    }

    public void setBadtype(String badtype) {
        this.badtype = badtype;
    }

    public String getBadchengdu() {
        return badchengdu;
    }

    public void setBadchengdu(String badchengdu) {
        this.badchengdu = badchengdu;
    }

    public String getBadplace() {
        return badplace;
    }

    public void setBadplace(String badplace) {
        this.badplace = badplace;
    }

    public String getQinshitype() {
        return qinshitype;
    }

    public void setQinshitype(String qinshitype) {
        this.qinshitype = qinshitype;
    }

    public int getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }
}
