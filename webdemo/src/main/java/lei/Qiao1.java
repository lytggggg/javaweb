package lei;

import java.sql.Date;

//一般资料表
public class Qiao1 {
    private Integer ID;
    private String jianshe_danwei;
    private java.sql.Date jiancheng_date;
    private float area;
    private float length;
    private float width;
    private Integer qiaoliaoKaID;

    public Integer getQiaoliaoKaID() {
        return qiaoliaoKaID;
    }

    public void setQiaoliaoKaID(Integer qiaoliaoKaID) {
        this.qiaoliaoKaID = qiaoliaoKaID;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getJianshe_danwei() {
        return jianshe_danwei;
    }

    public void setJianshe_danwei(String jianshe_danwei) {
        this.jianshe_danwei = jianshe_danwei;
    }

    public Date getJiancheng_date() {
        return jiancheng_date;
    }

    public void setJiancheng_date(Date jiancheng_date) {
        this.jiancheng_date = jiancheng_date;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "lei.Qiao1{" +
                "ID=" + ID +
                ", jianshe_danwei='" + jianshe_danwei + '\'' +
                ", jiancheng_date=" + jiancheng_date +
                ", area=" + area +
                ", length=" + length +
                ", width=" + width +
                ", qiaoliaoKaID=" + qiaoliaoKaID +
                '}';
    }


}
