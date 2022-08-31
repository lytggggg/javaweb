package lei;

import java.sql.Date;

public class dingjian {
    private int id;
    private int qiaoliaoKaID;
    private String name;
    private String cheak_person;
    private Date date;

    @Override
    public String toString() {
        return "dingjian{" +
                "id=" + id +
                ", qiaoliaoKaID=" + qiaoliaoKaID +
                ", name='" + name + '\'' +
                ", cheak_person='" + cheak_person + '\'' +
                ", date=" + date +
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

    public String getCheak_person() {
        return cheak_person;
    }

    public void setCheak_person(String cheak_person) {
        this.cheak_person = cheak_person;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
