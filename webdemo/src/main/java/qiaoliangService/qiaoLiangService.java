package qiaoliangService;

import Mapper.UserMapper;
import lei.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.util.List;

public class qiaoLiangService {

    public void updatejishupinggu(jishupinggu qiao, int id) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        userMapper.updatejishupinggu(qiao.getQiaoliaoKaID(),qiao.getName(),qiao.getQiaomianscore(),qiao.getQiaodunscore(),qiao.getShangqiaolianjiescore(),qiao.getTime(), id);

        sqlSession.commit();
        //2.5 释放资源
        sqlSession.close();
    }
    public jishupinggu selectjishupinggubyid(int id) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        jishupinggu qiao = userMapper.selectjishupingguByid(id);
        //2.5 释放资源
        sqlSession.close();
        return qiao;
    }
    public List<jishupinggu> selectjishupinggubyid1(int id) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        List<jishupinggu>  qiao = userMapper.selectjishupingguByid1(id);
        //2.5 释放资源
        sqlSession.close();
        return qiao;
    }
    public List<jishupinggu> selectjishupinggu() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        List<jishupinggu> qiao = userMapper.selectjishupinggu();
        //2.5 释放资源
        sqlSession.close();
        return qiao;
    }
    public List<teshugoujianxinxi> selectteshugoujianxinxi(int id) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        List<teshugoujianxinxi> qiao = userMapper.selectteshugoujianxinxi(id);
        //2.5 释放资源
        sqlSession.close();
        return qiao;
    }
    public List<jiegouzhuangtaijilu> selectjiegouzhuangtaijilu(int id) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        List<jiegouzhuangtaijilu> qiao = userMapper.selectjiegouzhuangtaijilu(id);
        //2.5 释放资源
        sqlSession.close();
        return qiao;
    }
    public void addchangguidingjian(changguidingjian changguidingjian) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        userMapper.addchangguidingian(changguidingjian);
        sqlSession.commit();
        //2.5 释放资源
        sqlSession.close();
    }
    public List<User> selectuser() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        List<User> qiao = userMapper.selectuser();
        //2.5 释放资源
        sqlSession.close();
        return qiao;
    }
    public cheak sousuo1(int id) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        cheak qiao = userMapper.sousuo1(id);
        //2.5 释放资源
        sqlSession.close();
        return qiao;
    }
    public changguidingjian sousuo2(int id) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        changguidingjian qiao = userMapper.sousuo2(id);
        //2.5 释放资源
        sqlSession.close();
        return qiao;
    }
    public dingjian sousuo3(int id) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        dingjian qiao = userMapper.sousuo3(id);
        //2.5 释放资源
        sqlSession.close();
        return qiao;
    }
    public List<jishupinggu> sousuojishupingu(String star ,String end) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        List<jishupinggu> qiao = userMapper.sousuojishupinggu(star,end);
        //2.5 释放资源
        sqlSession.close();
        return qiao;
    }

    public List<dingjian> selectdingjian() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        List<dingjian> qiao = userMapper.selectdingjian();
        //2.5 释放资源
        sqlSession.close();
        return qiao;
    }

    public List<changguidingjian> selectchangguidingjian() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        List<changguidingjian> qiao = userMapper.selectchangguidingjian();
        //2.5 释放资源
        sqlSession.close();
        return qiao;
    }
    public List<url> selecturl() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        List<url> qiao = userMapper.selecturl();
        //2.5 释放资源
        sqlSession.close();
        return qiao;
    }
    public url selecturls(String wd) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
      url qiao = userMapper.selecturl1(wd);
        //2.5 释放资源
        sqlSession.close();
        return qiao;
    }
    public List<Qiao> selectQiao() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        List<Qiao> qiao = userMapper.selectQiao();
        //2.5 释放资源
        sqlSession.close();
        return qiao;
    }

    public List<Qiao1> selectQiao1() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        List<Qiao1> qiao1 = userMapper.selectQiao1();

        //2.5 释放资源
        sqlSession.close();
        return qiao1;
    }

    public List<Qiao2> selectQiao2() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        List<Qiao2> qiao2 = userMapper.selectQiao2();
        //2.5 释放资源
        sqlSession.close();
        return qiao2;
    }

    public List<Qiao3> selectQiao3() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        List<Qiao3> qiao3 = userMapper.selectQiao3();
        //2.5 释放资源
        sqlSession.close();
        return qiao3;
    }

    public List<Qiao4> selectQiao4() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        List<Qiao4> qiao4 = userMapper.selectQiao4();
        //2.5 释放资源
        sqlSession.close();
        return qiao4;
    }

    public List<Qiao5> selectQiao5() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        List<Qiao5> qiao5 = userMapper.selectQiao5();
        //2.5 释放资源
        sqlSession.close();
        return qiao5;
    }

    public List<cheak> selectCheak() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        List<cheak> cheak = userMapper.selectCheak();
        //2.5 释放资源
        sqlSession.close();
        return cheak;
    }

    public List<xunjian> selectXunJian(int id) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        List<xunjian> xunjian = userMapper.selectXunjian(id);
        //2.5 释放资源
        sqlSession.close();
        return xunjian;
    }

    public List<tongji> selectTongji() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        List<tongji> tongji = userMapper.selectTongji();
        //2.5 释放资源
        sqlSession.close();
        return tongji;
    }
    public List<tongji2> selectTongji2() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        List<tongji2> tongji = userMapper.selectTongji2();
        //2.5 释放资源
        sqlSession.close();
        return tongji;
    }
    public void addjishupinggu(jishupinggu qiao) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        userMapper.addjishupinggu(qiao);
        sqlSession.commit();
        //2.5 释放资源
        sqlSession.close();

    }
    public void addQiao(Qiao qiao) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        userMapper.addQiao(qiao);
        sqlSession.commit();
        //2.5 释放资源
        sqlSession.close();

    }

    public void addQiao1(Qiao1 q) throws IOException {

        //2. 调用MyBatis完成查询
        //2.1 获取SqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        userMapper.addQiao1(q);
        //2.5 释放资源
        sqlSession.commit();
        //  userMapper.add_Qiao1(u.getJianshe_danwei(),u.getQiaoliaoKaID());
        sqlSession.close();
    }

    public void addQiao2(Qiao2 q) throws IOException {
        //2. 调用MyBatis完成查询
        //2.1 获取SqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        userMapper.addQiao2(q);
        //2.5 释放资源
        sqlSession.commit();
        //  userMapper.add_Qiao1(u.getJianshe_danwei(),u.getQiaoliaoKaID());
        sqlSession.close();
    }

    public void addQiao3(Qiao3 q) throws IOException {
        //2. 调用MyBatis完成查询
        //2.1 获取SqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        userMapper.addQiao3_1(q);
        userMapper.addQiao3_2(q);
        //2.5 释放资源
        sqlSession.commit();
        //  userMapper.add_Qiao1(u.getJianshe_danwei(),u.getQiaoliaoKaID());
        sqlSession.close();
    }

    public void addQiao4(Qiao4 q) throws IOException {
        //2. 调用MyBatis完成查询
        //2.1 获取SqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        userMapper.addQiao4(q);

        //2.5 释放资源
        sqlSession.commit();
        //  userMapper.add_Qiao1(u.getJianshe_danwei(),u.getQiaoliaoKaID());
        sqlSession.close();
    }

    public void addQiao5(Qiao5 q) throws IOException {
        //2. 调用MyBatis完成查询
        //2.1 获取SqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        userMapper.addQiao5(q);

        //2.5 释放资源
        sqlSession.commit();
        //  userMapper.add_Qiao1(u.getJianshe_danwei(),u.getQiaoliaoKaID());
        sqlSession.close();
    }

    public void addXunJian(xunjian x) throws IOException {
        //2. 调用MyBatis完成查询
        //2.1 获取SqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        userMapper.addXunJian(x);

        //2.5 释放资源
        sqlSession.commit();

        sqlSession.close();

    }

    public void addCheak(cheak cheak) throws IOException {
        //2. 调用MyBatis完成查询
        //2.1 获取SqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        userMapper.addCheak(cheak);

        //2.5 释放资源
        sqlSession.commit();

        sqlSession.close();
    }

    public void updateQiao(Qiao q, int id) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        userMapper.updateQiao(q.getQiaoliaoKaID(), q.getPlace(), q.getName(), q.getRoad_place(), q.getDeng_ji(), q.getKua_yue(), id);
        sqlSession.commit();
        //2.5 释放资源
        sqlSession.close();
    }

    public void updateQiao1(Qiao1 q, int id) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        userMapper.updateQiao1(q.getJianshe_danwei(), q.getJiancheng_date(), q.getArea(), q.getLength(), q.getWidth(), id);
        sqlSession.commit();
        //2.5 释放资源
        sqlSession.close();
    }

    public void updateQiao2(Qiao2 q, int id) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        userMapper.updateQiao2(q.getZhuliang_xingshi(), q.getZhuliang_chicun(), q.getZhuliang_number(), q.getHengliang_xingshi(), id);
        sqlSession.commit();
        //2.5 释放资源
        sqlSession.close();
    }

    public void updateQiao3(Qiao3 q, int id) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        userMapper.updateQiao3_1(q.getQiaotaixing_shi(), q.getQiaotai_number(), q.getQiaotai_biaogao(), id);
        userMapper.updateQiao3_2(q.getQiaodunxing_shi(), q.getQiaodun_number(), q.getQiaodun_biaogao(), id);
        sqlSession.commit();
        //2.5 释放资源
        sqlSession.close();
    }

    public void updateQiao4(Qiao4 q, int id) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        userMapper.updateQiao4(q.getJishuikou_chicun(), q.getJishuikou_number(), q.getXieshuiguan_chicun(), q.getXieshuiguan_number(), id);
        sqlSession.commit();
        //2.5 释放资源
        sqlSession.close();
    }

    public void updateQiao5(Qiao5 q, int id) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        userMapper.updateQiao5(q.getJishui_guan(), q.getRanqi_guan(), q.getDianli_guan(), q.getTongxin_dianlan(), id);
        sqlSession.commit();
        //2.5 释放资源
        sqlSession.close();
    }

    public void deleteQiao(int id) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        userMapper.deleteQiao(id);
        sqlSession.commit();
        //2.5 释放资源
        sqlSession.close();
    }
    public void deletejishupinggu(int id) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        userMapper.deletejishupinggu(id);
        sqlSession.commit();
        //2.5 释放资源
        sqlSession.close();
    }
    public void deletexunjianjilu(int id) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        userMapper.deletexunjianjilu(id);
        sqlSession.commit();
        //2.5 释放资源
        sqlSession.close();
    }
    public void deletechanggui(int id) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        userMapper.deletechanggui(id);
        sqlSession.commit();
        //2.5 释放资源
        sqlSession.close();
    }
    public void deletejiegou(int id) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 调用方法
        userMapper.deletejiegou(id);
        sqlSession.commit();
        //2.5 释放资源
        sqlSession.close();
    }


}
