package lei;

import java.sql.Date;

public class xunjian {
    private Integer ID;
    private Integer qiaoliaoKaID;
    private String state;
    private String bad;
    private Integer chengdu;
    private String weizhi;
    private String beizhu;
    private String jianchaxiang;
    private String yanghu_danwei;
    private String cheak_person;
    private String jindu;
    private java.sql.Date cheak_date;

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

    public String getYanghu_danwei() {
        return yanghu_danwei;
    }

    public void setYanghu_danwei(String yanghu_danwei) {
        this.yanghu_danwei = yanghu_danwei;
    }

    public String getJianchaxiang() {
        return jianchaxiang;
    }

    public void setJianchaxiang(String jianchaxiang) {
        this.jianchaxiang = jianchaxiang;
    }

    public Integer getID() {
        return ID;
    }

    public Integer getQiaoliaoKaID() {
        return qiaoliaoKaID;
    }

    public void setQiaoliaoKaID(Integer qiaoliaoKaID) {
        this.qiaoliaoKaID = qiaoliaoKaID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getBad() {
        return bad;
    }

    public void setBad(String bad) {
        this.bad = bad;
    }

    public Integer getChengdu() {
        return chengdu;
    }

    public void setChengdu(Integer chengdu) {
        this.chengdu = chengdu;
    }

    public String getWeizhi() {
        return weizhi;
    }

    public void setWeizhi(String weizhi) {
        this.weizhi = weizhi;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }



    @Override
    public String toString() {
        return "lei.xunjian{" +
                "ID=" + ID +
                ", qiaoliaoKaID=" + qiaoliaoKaID +
                ", state='" + state + '\'' +
                ", bad='" + bad + '\'' +
                ", chengdu=" + chengdu +
                ", weizhi='" + weizhi + '\'' +
                ", beizhu='" + beizhu + '\'' +
                '}';
    }
}
