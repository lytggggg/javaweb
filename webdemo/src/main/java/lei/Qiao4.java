package lei;

public class Qiao4 {
    private Integer ID;
    private Integer qiaoliaoKaID;
    private String jishuikou_chicun;
    private Integer jishuikou_number;
    private String xieshuiguan_chicun;
    private Integer xieshuiguan_number;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getQiaoliaoKaID() {
        return qiaoliaoKaID;
    }

    public void setQiaoliaoKaID(Integer qiaoliaoKaID) {
        this.qiaoliaoKaID = qiaoliaoKaID;
    }

    public String getJishuikou_chicun() {
        return jishuikou_chicun;
    }

    public void setJishuikou_chicun(String jishuikou_chicun) {
        this.jishuikou_chicun = jishuikou_chicun;
    }

    public Integer getJishuikou_number() {
        return jishuikou_number;
    }

    public void setJishuikou_number(Integer jishuikou_number) {
        this.jishuikou_number = jishuikou_number;
    }

    public String getXieshuiguan_chicun() {
        return xieshuiguan_chicun;
    }

    public void setXieshuiguan_chicun(String xieshuiguan_chicun) {
        this.xieshuiguan_chicun = xieshuiguan_chicun;
    }

    public Integer getXieshuiguan_number() {
        return xieshuiguan_number;
    }

    public void setXieshuiguan_number(Integer xieshuiguan_number) {
        this.xieshuiguan_number = xieshuiguan_number;
    }

    @Override
    public String toString() {
        return "lei.Qiao4{" +
                "ID=" + ID +
                ", qiaoliaoKaID=" + qiaoliaoKaID +
                ", jishuikou_chicun='" + jishuikou_chicun + '\'' +
                ", jishuikou_number=" + jishuikou_number +
                ", xieshuiguan_chicun='" + xieshuiguan_chicun + '\'' +
                ", xieshuiguan_number=" + xieshuiguan_number +
                '}';
    }
}
