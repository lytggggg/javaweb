package lei;

import java.sql.Date;

public class jishupinggu {
    private int id;
    private Date time;
    private int qiaoliaoKaID;
    private String name;
    private double totalscore;
    private double  qiaomianscore;
    private double  qiaodunscore;
    private double  shangqiaolianjiescore;

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", time=" + time +
                ", qiaoliaoKaID=" + qiaoliaoKaID +
                ", name=" + name +
                ", totalscore=" + totalscore +
                ", qiaomianscore=" + qiaomianscore +
                ", diaodunscore=" + qiaodunscore +
                ", shangqiaolianjiescore=" + shangqiaolianjiescore +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
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

    public double getTotalscore() {
        return totalscore;
    }

    public void setTotalscore(double totalscore) {
        this.totalscore = totalscore;
    }

    public double getQiaomianscore() {
        return qiaomianscore;
    }

    public void setQiaomianscore(double qiaomianscore) {
        this.qiaomianscore = qiaomianscore;
    }

    public double getQiaodunscore() {
        return qiaodunscore;
    }

    public void setQiaodunscore(double qiaodunscore) {
        this.qiaodunscore = qiaodunscore;
    }

    public double getShangqiaolianjiescore() {
        return shangqiaolianjiescore;
    }

    public void setShangqiaolianjiescore(double shangqiaolianjiescore) {
        this.shangqiaolianjiescore = shangqiaolianjiescore;
    }
}
