package Mapper;

import lei.*;
import org.apache.ibatis.annotations.*;

import java.lang.ref.SoftReference;
import java.util.Date;
import java.util.List;

public interface UserMapper {
    @Select("SELECT * FROM `技术评估表` where time BETWEEN #{start} AND #{end}")
    List<jishupinggu> sousuojishupinggu(@Param("start") String start, @Param("end") String end);

    @Select("select * from 日常巡检表 where qiaoliaoKaID = #{id}")
    cheak sousuo1(int id);

    @Select("select * from 常规定检表 where qiaoliaoKaID = #{id}")
    changguidingjian sousuo2(int id);

    @Select("select * from 定期巡检表 where qiaoliaoKaID = #{id}")
    dingjian sousuo3(int id);

    @Insert("insert into type values (null,#{typename})")
    void typeadd(type s);


    @Select("select * from type")
    List<type> selecttype();


    @Select("SELECT * FROM `技术评估表`")
    List<jishupinggu> selectjishupinggu();


    @Select("select * from tb_user where username=#{username} and password=#{password} and type=#{type}")
    User selectUser(@Param("username") String username, @Param("password") String password, @Param("type") String type);

    @Select("SELECT * FROM `桥梁资料卡`")
    List<Qiao> selectQiao();

    @Select("SELECT * FROM `一般资料表`")
    List<Qiao1> selectQiao1();

    @Select("select * from tb_user")
    List<User> selectuser();

    @Select("select * from 上部结构表")
    List<Qiao2> selectQiao2();

    @Select("SELECT `下部结构表`.ID, `下部结构表`.qiaoliaoKaID, `桥台表`.qiaotaixing_shi, `桥台表`.qiaotai_number, `桥台表`.qiaotai_biaogao, `桥墩表`.qiaodunxing_shi, `桥墩表`.qiaodun_number, `桥墩表`.qiaodun_biaogao FROM`下部结构表`INNER JOIN`桥台表`ON `下部结构表`.qiaotai_bianhao = `桥台表`.ID INNER JOIN`桥墩表`ON `下部结构表`.qiaodun_bianhao = `桥墩表`.ID")
    List<Qiao3> selectQiao3();

    @Select("select * from 附属工程表")
    List<Qiao4> selectQiao4();

    @Select("select * from 附挂管线表")
    List<Qiao5> selectQiao5();

    @Select("select * from 日常巡检表")
    List<cheak> selectCheak();

    @Select("select * from 城市桥梁日常巡检表 where qiaoliaoKaID=#{id}")
    List<xunjian> selectXunjian(int id);

    @Select("select jianchaxiang as product,count(jianchaxiang) as xiangmu from 城市桥梁日常巡检表 GROUP BY jianchaxiang")
    List<tongji> selectTongji();

    @Select("select jianchaxiang as name,count(jianchaxiang) as value from 城市桥梁日常巡检表 GROUP BY jianchaxiang")
    List<tongji2> selectTongji2();

    @Select("SELECT \t distinct `必查项`.must FROM\t`必查项`\tINNER JOIN\ttype_and_must\tON \t\t`必查项`.id = type_and_must.mustid\tINNER JOIN\ttype\tON \t\ttype_and_must.typeid = type.id\tINNER JOIN\t`选查项`\tINNER JOIN\ttype_and_nomust\tON \t\t`选查项`.id = type_and_nomust.nomust AND\t\ttype.id = type_and_nomust.typeid\t\twhere type.typename=\"斜拉桥\"")
    List<must> selectMust();

    @Select("SELECT DISTINCT\t`选查项`.noMust FROM\t`必查项`\tINNER JOIN\ttype_and_must\tON \t\t`必查项`.id = type_and_must.mustid\tINNER JOIN\n" +
            "type\tON \t\ttype_and_must.typeid = type.id\tINNER JOIN\t`选查项`\tINNER JOIN\ttype_and_nomust\tON \t\t`选查项`.id = type_and_nomust.nomust AND\t\ttype.id = type_and_nomust.typeid WHERE\ttype.typename = \"斜拉桥\"")
    List<noMust> selectnoMust();

    @Select("SELECT \t distinct `必查项`.must FROM\t`必查项`\tINNER JOIN\ttype_and_must\tON \t\t`必查项`.id = type_and_must.mustid\tINNER JOIN\ttype\tON \t\ttype_and_must.typeid = type.id\tINNER JOIN\t`选查项`\tINNER JOIN\ttype_and_nomust\tON \t\t`选查项`.id = type_and_nomust.nomust AND\t\ttype.id = type_and_nomust.typeid\t\twhere type.typename=\"拱桥\"")
    List<must> selectMust2();

    @Select("SELECT DISTINCT\t`选查项`.noMust FROM\t`必查项`\tINNER JOIN\ttype_and_must\tON \t\t`必查项`.id = type_and_must.mustid\tINNER JOIN\n" +
            "type\tON \t\ttype_and_must.typeid = type.id\tINNER JOIN\t`选查项`\tINNER JOIN\ttype_and_nomust\tON \t\t`选查项`.id = type_and_nomust.nomust AND\t\ttype.id = type_and_nomust.typeid WHERE\ttype.typename = \"拱桥\"")
    List<noMust> selectnoMust2();

    @Select("SELECT \t distinct `必查项`.must FROM\t`必查项`\tINNER JOIN\ttype_and_must\tON \t\t`必查项`.id = type_and_must.mustid\tINNER JOIN\ttype\tON \t\ttype_and_must.typeid = type.id\tINNER JOIN\t`选查项`\tINNER JOIN\ttype_and_nomust\tON \t\t`选查项`.id = type_and_nomust.nomust AND\t\ttype.id = type_and_nomust.typeid\t\twhere type.typename=\"梁式桥\"")
    List<must> selectMust3();

    @Select("SELECT DISTINCT\t`选查项`.noMust FROM\t`必查项`\tINNER JOIN\ttype_and_must\tON \t\t`必查项`.id = type_and_must.mustid\tINNER JOIN\n" +
            "type\tON \t\ttype_and_must.typeid = type.id\tINNER JOIN\t`选查项`\tINNER JOIN\ttype_and_nomust\tON \t\t`选查项`.id = type_and_nomust.nomust AND\t\ttype.id = type_and_nomust.typeid WHERE\ttype.typename = \"梁式桥\"")
    List<noMust> selectnoMust3();

    @Select("SELECT \t distinct `必查项`.must FROM\t`必查项`\tINNER JOIN\ttype_and_must\tON \t\t`必查项`.id = type_and_must.mustid\tINNER JOIN\ttype\tON \t\ttype_and_must.typeid = type.id\tINNER JOIN\t`选查项`\tINNER JOIN\ttype_and_nomust\tON \t\t`选查项`.id = type_and_nomust.nomust AND\t\ttype.id = type_and_nomust.typeid\t\twhere type.typename=\"悬索桥\"")
    List<must> selectMust4();

    @Select("SELECT DISTINCT\t`选查项`.noMust FROM\t`必查项`\tINNER JOIN\ttype_and_must\tON \t\t`必查项`.id = type_and_must.mustid\tINNER JOIN\n" +
            "type\tON \t\ttype_and_must.typeid = type.id\tINNER JOIN\t`选查项`\tINNER JOIN\ttype_and_nomust\tON \t\t`选查项`.id = type_and_nomust.nomust AND\t\ttype.id = type_and_nomust.typeid WHERE\ttype.typename = \"悬索桥\"")
    List<noMust> selectnoMust4();

    @Select("select * from url")
    List<url> selecturl();

    @Insert("insert into 常规定检表 values(null,#{qiaoliaoKaID},#{name},#{dingjian_name},#{zhuangkuang},#{reason},#{sugestion},#{state},#{nexttime})")
    void addchangguidingian(changguidingjian changguidingjian);

    @Select("SELECT * FROM `常规定检表`")
    List<changguidingjian> selectchangguidingjian();

    @Select("SELECT * FROM `定期巡检表`")
    List<dingjian> selectdingjian();

    @Select("SELECT\t`定期巡检表`.`name`, \t`结构状态记录表`.* FROM\t`结构状态记录表`\tINNER JOIN\t`定期巡检表`\tON \t\t`结构状态记录表`.qiaoliaoKaID = `定期巡检表`.qiaoliaoKaID\t\twhere `定期巡检表`.qiaoliaoKaID=#{id}")
    List<jiegouzhuangtaijilu> selectjiegouzhuangtaijilu(int id);

    @Select("SELECT\t`定期巡检表`.`name`, \t`特殊构件信息表`.*FROM\t`特殊构件信息表`\tINNER JOIN\t`定期巡检表`\tON \t\t`特殊构件信息表`.qiaoliaoKaID = `定期巡检表`.qiaoliaoKaID\t\twhere `定期巡检表`.qiaoliaoKaID=#{id}")
    List<teshugoujianxinxi> selectteshugoujianxinxi(int id);

    @Select("SELECT * FROM url ORDER BY ABS(#{wd} - `wd`) LIMIT 1")
    url selecturl1(String wd);

    @Insert("insert into 技术评估表 (id,time,qiaoliaoKaID,name,qiaomianscore,qiaodunscore,shangqiaolianjiescore) values(null,#{time},#{qiaoliaoKaID},#{name},#{qiaomianscore},#{qiaodunscore},#{shangqiaolianjiescore})")
    void addjishupinggu(jishupinggu j);

    @Insert("insert into `桥梁资料卡`(qiaoliaoKaID,qiaoliaoBianID,place,name,Road_place,kua_yue,deng_ji) values(#{qiaoliaoKaID},null,#{place},#{name},#{Road_place},#{kua_yue},#{deng_ji})")
    void addQiao(Qiao qiao);

    @Insert("insert into `一般资料表`(ID,jianshe_danwei,jiancheng_date,area,length,width,qiaoliaoKaID) values(null,#{jianshe_danwei},#{jiancheng_date},#{area},#{length},#{width},#{qiaoliaoKaID})")
    void addQiao1(Qiao1 qiao1);

    @Insert("insert into `上部结构表`(ID,zhuliang_xingshi,zhuliang_chicun,zhuliang_number,hengliang_xingshi,qiaoliaoKaID) values(null,#{zhuliang_xingshi},#{zhuliang_chicun},#{zhuliang_number},#{hengliang_xingshi},#{qiaoliaoKaID})")
    void addQiao2(Qiao2 qiao2);

    @Insert("insert into 桥台表 values (null,#{qiaotaixing_shi},#{qiaotai_number},#{qiaotai_biaogao},#{qiaoliaoKaID})")
    void addQiao3_1(Qiao3 qiao3);

    @Insert("insert into 桥墩表 values (null,#{qiaodunxing_shi},#{qiaodun_number},#{qiaodun_biaogao},#{qiaoliaoKaID})")
    void addQiao3_2(Qiao3 qiao3);

    @Insert("insert into `附属工程表`(ID,jishuikou_chicun,jishuikou_number,xieshuiguan_chicun,xieshuiguan_number,qiaoliaoKaID) values(null,#{jishuikou_chicun},#{jishuikou_number},#{xieshuiguan_chicun},#{xieshuiguan_number},#{qiaoliaoKaID})")
    void addQiao4(Qiao4 qiao2);

    @Insert("insert into 附挂管线表 values(null,#{jishui_guan},#{ranqi_guan},#{dianli_guan},#{tongxin_dianlan},#{qiaoliaoKaID})")
    void addQiao5(Qiao5 qiao5);

    @Insert("insert into 城市桥梁日常巡检表 values(null,#{state},#{bad},#{chengdu},#{weizhi},#{beizhu},#{qiaoliaoKaID},#{jianchaxiang},#{yanghu_danwei},#{cheak_person},null,curdate())")
    void addXunJian(xunjian xunjian);

    @Insert("insert into 日常巡检表 values(null,#{qiaoliaoKaID},#{name},#{yanghu_danwei},#{cheak_person},null,curdate())")
    void addCheak(cheak cheak);

    @Select("SELECT * FROM `桥梁资料卡` where qiaoliaoKaID=#{id}")
    Qiao selectQiaoByid(int id);

    @Select("SELECT * FROM `桥梁资料卡` where qiaoliaoKaID=#{id}")
    List<Qiao> selectQiaoByid1(int id);


    @Select("SELECT * FROM `一般资料表` where qiaoliaoKaID=#{id}")
    Qiao1 selectQiao1Byid(int id);

    @Select("SELECT * FROM `上部结构表` where qiaoliaoKaID=#{id}")
    Qiao2 selectQiao2Byid(int id);

    @Select("SELECT `下部结构表`.ID, `下部结构表`.qiaoliaoKaID, `桥台表`.qiaotaixing_shi, `桥台表`.qiaotai_number, `桥台表`.qiaotai_biaogao, `桥墩表`.qiaodunxing_shi, `桥墩表`.qiaodun_number, `桥墩表`.qiaodun_biaogao FROM`下部结构表`INNER JOIN`桥台表`ON `下部结构表`.qiaotai_bianhao = `桥台表`.ID INNER JOIN`桥墩表`ON `下部结构表`.qiaodun_bianhao = `桥墩表`.ID where 下部结构表.qiaoliaoKaID=#{id}")
    Qiao3 selectQiao3Byid(int id);

    @Select("select * from 附属工程表 where qiaoliaoKaID=#{id}")
    Qiao4 selectQiao4Byid(int id);

    @Select("select * from 附挂管线表 where qiaoliaoKaID=#{id}")
    Qiao5 selectQiao5Byid(int id);

    @Select("select * from 日常巡检表 where qiaoliaoKaID=#{id}")
    cheak selectCheakByid(int id);

    @Select("select * from 技术评估表 where qiaoliaoKaID=#{id}")
    jishupinggu selectjishupingguByid(int id);
/*
@Update("update tb_user")
void updateuser(@Param("username") String username,@Param("type") String type,@Param("sex") String sex,@Param("name") String name,@Param("date") Date date,@Param("tel") String tel,@Param("state") boolean state);
*/
    @Select("select * from 技术评估表 where qiaoliaoKaID=#{id}")
    List<jishupinggu> selectjishupingguByid1(int id);

    @Select("SELECT\n" +
            "\t`桥梁资料卡`.qiaoliaoKaID,\n" +
            "\t`一般资料表`.jianshe_danwei,\n" +
            "\t`一般资料表`.jiancheng_date,\n" +
            "\t`一般资料表`.area,\n" +
            "\t`一般资料表`.length,\n" +
            "\t`一般资料表`.width,\n" +
            "\t`上部结构表`.zhuliang_xingshi,\n" +
            "\t`上部结构表`.zhuliang_chicun,\n" +
            "\t`上部结构表`.zhuliang_number,\n" +
            "\t`上部结构表`.hengliang_xingshi,\n" +
            "\t`桥台表`.qiaotaixing_shi,\n" +
            "\t`桥台表`.qiaotai_number,\n" +
            "\t`桥墩表`.qiaodunxing_shi,\n" +
            "\t`桥墩表`.qiaodun_number,\n" +
            "\t`附属工程表`.jishuikou_chicun,\n" +
            "\t`附属工程表`.jishuikou_number,\n" +
            "\t`附属工程表`.xieshuiguan_chicun,\n" +
            "\t`附属工程表`.xieshuiguan_number,\n" +
            "\t`附挂管线表`.jishui_guan,\n" +
            "\t`附挂管线表`.ranqi_guan,\n" +
            "\t`附挂管线表`.dianli_guan,\n" +
            "\t`附挂管线表`.tongxin_dianlan \n" +
            "FROM\n" +
            "\t`桥梁资料卡`\n" +
            "\tINNER JOIN `上部结构表` ON `桥梁资料卡`.top_jiegou_ID = `上部结构表`.ID\n" +
            "\tINNER JOIN `下部结构表` ON `桥梁资料卡`.down_jiegou_ID = `下部结构表`.ID\n" +
            "\tINNER JOIN `桥台表` ON `下部结构表`.qiaotai_bianhao = `桥台表`.ID\n" +
            "\tINNER JOIN `桥墩表` ON `下部结构表`.qiaodun_bianhao = `桥墩表`.ID\n" +
            "\tINNER JOIN `附属工程表` ON `桥梁资料卡`.fu_shu_gongcheng_ID = `附属工程表`.ID\n" +
            "\tINNER JOIN `附挂管线表` ON `桥梁资料卡`.fu_gua_guan_xian_ID = `附挂管线表`.ID\n" +
            "\tINNER JOIN `一般资料表` ON `桥梁资料卡`.yibanziliao_ID = `一般资料表`.ID \n" +
            "WHERE\n" +
            "\t`桥梁资料卡`.qiaoliaoKaID = #{id}")
    big selectall(int id);

    @Update("update `桥梁资料卡` set qiaoliaoKaID=#{qiaoliaoKaID},place=#{place},name=#{name},Road_place=#{Road_place},deng_ji=#{deng_ji},kua_yue=#{kua_yue} where qiaoliaoKaID=#{id}")
    void updateQiao(@Param("qiaoliaoKaID") int qiaoliaoKaID, @Param("place") String place, @Param("name") String name, @Param("Road_place") String Road_place, @Param("deng_ji") String deng_ji, @Param("kua_yue") String kua_yue, @Param("id") int id);

    @Update("update `一般资料表` set jianshe_danwei=#{jianshe_danwei},jiancheng_date=#{jiancheng_date},area=#{area},length=#{length},width=#{width} where qiaoliaoKaID=#{qiaoliaoKaID}")
    void updateQiao1(@Param("jianshe_danwei") String jianshe_danwei, @Param("jiancheng_date") Date jiancheng_date, @Param("area") float area, @Param("length") float length, @Param("width") float width, @Param("qiaoliaoKaID") int qiaoliaoKaID);

    @Update("update `上部结构表` set zhuliang_xingshi=#{zhuliang_xingshi},zhuliang_chicun=#{zhuliang_chicun},zhuliang_number=#{zhuliang_number},hengliang_xingshi=#{hengliang_xingshi} where qiaoliaoKaID=#{id}")
    void updateQiao2(@Param("zhuliang_xingshi") String zhuliang_xingshi, @Param("zhuliang_chicun") String zhuliang_chicun, @Param("zhuliang_number") Integer zhuliang_number, @Param("hengliang_xingshi") String hengliang_xingshi, @Param("id") int id);

    @Update("update 桥台表 set qiaotaixing_shi =#{qiaotaixing_shi},qiaotai_number=#{qiaotai_number},qiaotai_biaogao=#{qiaotai_biaogao} where qiaoliaoKaID=#{id}")
    void updateQiao3_1(@Param("qiaotaixing_shi") String qiaotaixing_shi, @Param("qiaotai_number") Integer qiaotai_number, @Param("qiaotai_biaogao") float qiaotai_biaogao, @Param("id") int id);

    @Update("update 桥墩表 set qiaodunxing_shi =#{qiaodunxing_shi},qiaodun_number=#{qiaodun_number},qiaodun_biaogao=#{qiaodun_biaogao} where qiaoliaoKaID=#{id}")
    void updateQiao3_2(@Param("qiaodunxing_shi") String qiaodunxing_shi, @Param("qiaodun_number") Integer qiaodun_number, @Param("qiaodun_biaogao") float qiaodun_biaogao, @Param("id") int id);

    @Update("update 附属工程表 set jishuikou_chicun=#{jishuikou_chicun},jishuikou_number=#{jishuikou_number},xieshuiguan_chicun=#{xieshuiguan_chicun},xieshuiguan_number=#{xieshuiguan_number} where qiaoliaoKaID=#{id}")
    void updateQiao4(@Param("jishuikou_chicun") String jishuikou_chicun, @Param("jishuikou_number") Integer jishuikou_number, @Param("xieshuiguan_chicun") String xieshuiguan_chicun, @Param("xieshuiguan_number") Integer xieshuiguan_number, @Param("id") int id);

    @Update("update 附挂管线表 set jishui_guan=#{jishui_guan},ranqi_guan=#{ranqi_guan},dianli_guan=#{dianli_guan},tongxin_dianlan=#{tongxin_dianlan} where qiaoliaoKaID=#{id}")
    void updateQiao5(@Param("jishui_guan") String jishui_guan, @Param("ranqi_guan") String ranqi_guan, @Param("dianli_guan") String dianli_guan, @Param("tongxin_dianlan") String tongxin_dianlan, @Param("id") int id);

    @Update("update 技术评估表 set qiaoliaoKaID=#{qiaoliaoKaID},name=#{name},totalscore=#{qiaomianscore}*0.25+#{qiaodunscore}*0.25+#{shangqiaolianjiescore}*0.5, qiaomianscore=#{qiaomianscore},qiaodunscore=#{qiaodunscore},shangqiaolianjiescore=#{shangqiaolianjiescore},time=#{time} where qiaoliaoKaID=#{id}")
    void updatejishupinggu(@Param("qiaoliaoKaID") int qiaoliaoKaID, @Param("name") String name, @Param("qiaomianscore") double qiaomianscore, @Param("qiaodunscore") double qiaodunscore, @Param("shangqiaolianjiescore") double shangqiaolianjiescore, @Param("time") Date time, @Param("id") int id);

    @Delete("delete from 桥梁资料卡 where qiaoliaoKaID=#{id}")
    void deleteQiao(int id);

    @Delete("delete from 技术评估表 where qiaoliaoKaID=#{id}")
    void deletejishupinggu(int id);

    @Delete("delete from 日常巡检表 where qiaoliaoKaID=#{id}")
    void deletexunjianjilu(int id);

    @Delete("delete from 常规定检表 where qiaoliaoKaID=#{id}")
    void deletechanggui(int id);

    @Delete("delete from 定期巡检表 where qiaoliaoKaID=#{id}")
    void deletejiegou(int id);


}
