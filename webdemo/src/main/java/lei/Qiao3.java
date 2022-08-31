package lei;

public class Qiao3 {
    private Integer ID;
    private Integer qiaoliaoKaID;
    private String qiaotaixing_shi;
    private Integer qiaotai_number;
    private float qiaotai_biaogao;
    private String qiaodunxing_shi;
    private Integer qiaodun_number;
    private float qiaodun_biaogao;

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

    public String getQiaotaixing_shi() {
        return qiaotaixing_shi;
    }

    public void setQiaotaixing_shi(String qiaotaixing_shi) {
        this.qiaotaixing_shi = qiaotaixing_shi;
    }

    public Integer getQiaotai_number() {
        return qiaotai_number;
    }

    public void setQiaotai_number(Integer qiaotai_number) {
        this.qiaotai_number = qiaotai_number;
    }

    public float getQiaotai_biaogao() {
        return qiaotai_biaogao;
    }

    public void setQiaotai_biaogao(float qiaotai_biaogao) {
        this.qiaotai_biaogao = qiaotai_biaogao;
    }

    public String getQiaodunxing_shi() {
        return qiaodunxing_shi;
    }

    public void setQiaodunxing_shi(String qiaodunxing_shi) {
        this.qiaodunxing_shi = qiaodunxing_shi;
    }

    public Integer getQiaodun_number() {
        return qiaodun_number;
    }

    public void setQiaodun_number(Integer qiaodun_number) {
        this.qiaodun_number = qiaodun_number;
    }

    public float getQiaodun_biaogao() {
        return qiaodun_biaogao;
    }

    public void setQiaodun_biaogao(float qiaodun_biaogao) {
        this.qiaodun_biaogao = qiaodun_biaogao;
    }

    @Override
    public String toString() {
        return "lei.Qiao3{" +
                "ID=" + ID +
                ", qiaoliaoKaID=" + qiaoliaoKaID +
                ", qiaotaixing_shi='" + qiaotaixing_shi + '\'' +
                ", qiaotai_number=" + qiaotai_number +
                ", qiaotai_biaogao=" + qiaotai_biaogao +
                ", qiaodunxing_shi='" + qiaodunxing_shi + '\'' +
                ", qiaodun_number=" + qiaodun_number +
                ", qiaodun_biaogao=" + qiaodun_biaogao +
                '}';
    }
}
