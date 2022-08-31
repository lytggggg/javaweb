package lei;

import java.sql.Date;

public class changguidingjian {
    private int id;
    private int qiaoliaoKaID;
    private String name;
    private String dingjian_name;
    private String zhuangkuang;
    private String reason;
    private String sugestion;
    private String state;
    private Date nexttime;

    @Override
    public String toString() {
        return "changguidingjian{" +
                "id=" + id +
                ", qiaoliaoKaID=" + qiaoliaoKaID +
                ", name='" + name + '\'' +
                ", dingjian_name='" + dingjian_name + '\'' +
                ", zhuangkuang='" + zhuangkuang + '\'' +
                ", reason='" + reason + '\'' +
                ", sugestion='" + sugestion + '\'' +
                ", state='" + state + '\'' +
                ", nexttime=" + nexttime +
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDingjian_name() {
        return dingjian_name;
    }

    public void setDingjian_name(String dingjian_name) {
        this.dingjian_name = dingjian_name;
    }

    public String getZhuangkuang() {
        return zhuangkuang;
    }

    public void setZhuangkuang(String zhuangkuang) {
        this.zhuangkuang = zhuangkuang;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getSugestion() {
        return sugestion;
    }

    public void setSugestion(String sugestion) {
        this.sugestion = sugestion;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getNexttime() {
        return nexttime;
    }

    public void setNexttime(Date nexttime) {
        this.nexttime = nexttime;
    }
}
