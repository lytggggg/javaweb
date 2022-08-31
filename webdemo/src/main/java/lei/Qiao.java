package lei;

import java.sql.Date;

public class Qiao {
    private Integer qiaoliaoKaID;
    private Integer qiaoliaoBianID;
    private String place;
    private String name;
    private String Road_place;
    private String kua_yue;
    private String deng_ji;
    private Date data;

    @Override
    public String toString() {
        return "Qiao{" +
                "qiaoliaoKaID=" + qiaoliaoKaID +
                ", qiaoliaoBianID=" + qiaoliaoBianID +
                ", place='" + place + '\'' +
                ", name='" + name + '\'' +
                ", Road_place='" + Road_place + '\'' +
                ", kua_yue='" + kua_yue + '\'' +
                ", deng_ji='" + deng_ji + '\'' +
                ", data=" + data +
                '}';
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Integer getQiaoliaoKaID() {
        return qiaoliaoKaID;
    }

    public void setQiaoliaoKaID(Integer qiaoliaoKaID) {
        this.qiaoliaoKaID = qiaoliaoKaID;
    }

    public Integer getQiaoliaoBianID() {
        return qiaoliaoBianID;
    }

    public void setQiaoliaoBianID(Integer qiaoliaoBianID) {
        this.qiaoliaoBianID = qiaoliaoBianID;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoad_place() {
        return Road_place;
    }

    public void setRoad_place(String road_place) {
        Road_place = road_place;
    }

    public String getKua_yue() {
        return kua_yue;
    }

    public void setKua_yue(String kua_yue) {
        this.kua_yue = kua_yue;
    }

    public String getDeng_ji() {
        return deng_ji;
    }

    public void setDeng_ji(String deng_ji) {
        this.deng_ji = deng_ji;
    }




}
