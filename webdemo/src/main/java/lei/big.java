package lei;

import java.sql.Date;

public class big {
    private Integer ID;
    private String jianshe_danwei;
    private java.sql.Date jiancheng_date;
    private float area;
    private float length;
    private float width;


    private Integer qiaoliaoKaID;
   private String zhuliang_xingshi;
   private String zhuliang_chicun;
   private Integer zhuliang_number;
   private String hengliang_xingshi;

   private String qiaotaixing_shi;
   private Integer qiaotai_number;

    private String qiaodunxing_shi;
    private Integer qiaodun_number;

    private String jishui_guan;
    private String ranqi_guan;
    private String dianli_guan;
    private String tongxin_dianlan;

    private String jishuikou_chicun;
    private String xieshuiguan_chicun;
    private Integer jishuikou_number;
    private Integer xieshuiguan_number;


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

    public Integer getQiaoliaoKaID() {
        return qiaoliaoKaID;
    }

    public void setQiaoliaoKaID(Integer qiaoliaoKaID) {
        this.qiaoliaoKaID = qiaoliaoKaID;
    }

    public String getZhuliang_xingshi() {
        return zhuliang_xingshi;
    }

    public void setZhuliang_xingshi(String zhuliang_xingshi) {
        this.zhuliang_xingshi = zhuliang_xingshi;
    }

    public String getZhuliang_chicun() {
        return zhuliang_chicun;
    }

    public void setZhuliang_chicun(String zhuliang_chicun) {
        this.zhuliang_chicun = zhuliang_chicun;
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

    public String getJishuikou_chicun() {
        return jishuikou_chicun;
    }

    public void setJishuikou_chicun(String jishuikou_chicun) {
        this.jishuikou_chicun = jishuikou_chicun;
    }

    public String getXieshuiguan_chicun() {
        return xieshuiguan_chicun;
    }

    public void setXieshuiguan_chicun(String xieshuiguan_chicun) {
        this.xieshuiguan_chicun = xieshuiguan_chicun;
    }

    public Integer getJishuikou_number() {
        return jishuikou_number;
    }

    public void setJishuikou_number(Integer jishuikou_number) {
        this.jishuikou_number = jishuikou_number;
    }

    public Integer getXieshuiguan_number() {
        return xieshuiguan_number;
    }

    public void setXieshuiguan_number(Integer xieshuiguan_number) {
        this.xieshuiguan_number = xieshuiguan_number;
    }

    @Override
    public String toString() {
        return "lei.big{" +
                "ID=" + ID +
                ", jianshe_danwei='" + jianshe_danwei + '\'' +
                ", jiancheng_date=" + jiancheng_date +
                ", area=" + area +
                ", length=" + length +
                ", width=" + width +
                ", qiaoliaoKaID=" + qiaoliaoKaID +
                ", zhuliang_xingshi='" + zhuliang_xingshi + '\'' +
                ", zhuliang_chicun='" + zhuliang_chicun + '\'' +
                ", zhuliang_number=" + zhuliang_number +
                ", hengliang_xingshi='" + hengliang_xingshi + '\'' +
                ", qiaotaixing_shi='" + qiaotaixing_shi + '\'' +
                ", qiaotai_number=" + qiaotai_number +
                ", qiaodunxing_shi='" + qiaodunxing_shi + '\'' +
                ", qiaodun_number=" + qiaodun_number +
                ", jishui_guan='" + jishui_guan + '\'' +
                ", ranqi_guan='" + ranqi_guan + '\'' +
                ", dianli_guan='" + dianli_guan + '\'' +
                ", tongxin_dianlan='" + tongxin_dianlan + '\'' +
                ", jishuikou_chicun='" + jishuikou_chicun + '\'' +
                ", xieshuiguan_chicun='" + xieshuiguan_chicun + '\'' +
                ", jishuikou_number=" + jishuikou_number +
                ", xieshuiguan_number=" + xieshuiguan_number +
                '}';
    }
}

