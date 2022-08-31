package lei;

public class Qiao2 {
    private Integer ID;
    private String zhuliang_xingshi;
    private Integer zhuliang_number;
    private String zhuliang_chicun;
    private  String hengliang_xingshi;
    private Integer qiaoliaoKaID;

    public String getZhuliang_chicun() {
        return zhuliang_chicun;
    }

    public void setZhuliang_chicun(String zhuliang_chicun) {
        this.zhuliang_chicun = zhuliang_chicun;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getZhuliang_xingshi() {
        return zhuliang_xingshi;
    }

    public void setZhuliang_xingshi(String zhuliang_xingshi) {
        this.zhuliang_xingshi = zhuliang_xingshi;
    }

    public Integer getZhuliang_number() {
        return zhuliang_number;
    }

    public void setZhuliang_number(Integer zhuliang_number) {
        this.zhuliang_number = zhuliang_number;
    }

    public String getHengliang_xingshi() {
        return hengliang_xingshi;
    }

    public void setHengliang_xingshi(String hengliang_xingshi) {
        this.hengliang_xingshi = hengliang_xingshi;
    }

    public Integer getQiaoliaoKaID() {
        return qiaoliaoKaID;
    }

    public void setQiaoliaoKaID(Integer qiaoliaoKaID) {
        this.qiaoliaoKaID = qiaoliaoKaID;
    }

    @Override
    public String toString() {
        return "lei.Qiao2{" +
                "ID=" + ID +
                ", zhuliang_xingshi='" + zhuliang_xingshi + '\'' +
                ", zhuliang_number=" + zhuliang_number +
                ", zhuliang_chicun='" + zhuliang_chicun + '\'' +
                ", hengliang_xingshi='" + hengliang_xingshi + '\'' +
                ", qiaoliaoKaID=" + qiaoliaoKaID +
                '}';
    }
}
