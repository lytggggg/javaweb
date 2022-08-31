package lei;

import java.sql.Date;

public class cheak {
    private Integer ID;
    private Integer qiaoliaoKaID;
    private String name;
    private String yanghu_danwei;
    private String cheak_person;
    private String jindu;
    private java.sql.Date cheak_date;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYanghu_danwei() {
        return yanghu_danwei;
    }

    public void setYanghu_danwei(String yanghu_danwei) {
        this.yanghu_danwei = yanghu_danwei;
    }

    public String getCheak_person() {
        return cheak_person;
    }

    public void setCheak_person(String cheak_person) {
        this.cheak_person = cheak_person;
    }

    public String getJindu() {
        return jindu;
    }

    public void setJindu(String jindu) {
        this.jindu = jindu;
    }

    public Date getCheak_date() {
        return cheak_date;
    }

    public void setCheak_date(Date cheak_date) {
        this.cheak_date = cheak_date;
    }

    @Override
    public String toString() {
        return "lei.cheak{" +
                "ID=" + ID +
                ", qiaoliaoKaID=" + qiaoliaoKaID +
                ", name='" + name + '\'' +
                ", yanghu_danwei='" + yanghu_danwei + '\'' +
                ", cheak_person='" + cheak_person + '\'' +
                ", jindu='" + jindu + '\'' +
                ", cheak_date=" + cheak_date +
                '}';
    }
}
