package lei;

public class Qiao5 {

    private Integer ID;
    private Integer qiaoliaoKaID;
    private String jishui_guan;
    private String ranqi_guan;
    private String dianli_guan;
    private String tongxin_dianlan;

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

    public String getJishui_guan() {
        return jishui_guan;
    }

    public void setJishui_guan(String jishui_guan) {
        this.jishui_guan = jishui_guan;
    }

    public String getRanqi_guan() {
        return ranqi_guan;
    }

    public void setRanqi_guan(String ranqi_guan) {
        this.ranqi_guan = ranqi_guan;
    }

    public String getDianli_guan() {
        return dianli_guan;
    }

    public void setDianli_guan(String dianli_guan) {
        this.dianli_guan = dianli_guan;
    }

    public String getTongxin_dianlan() {
        return tongxin_dianlan;
    }

    public void setTongxin_dianlan(String tongxin_dianlan) {
        this.tongxin_dianlan = tongxin_dianlan;
    }

    @Override
    public String toString() {
        return "lei.Qiao5{" +
                "ID=" + ID +
                ", qiaoliaoKaID=" + qiaoliaoKaID +
                ", jishui_guan=" + jishui_guan +
                ", ranqi_guan='" + ranqi_guan + '\'' +
                ", dianli_guan='" + dianli_guan + '\'' +
                ", tongxin_dianlan='" + tongxin_dianlan + '\'' +
                '}';
    }
}
