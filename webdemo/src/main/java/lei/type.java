package lei;

public class type {
    private int typeid;
    private String typename;

    @Override
    public String toString() {
        return "type{" +
                "typeid=" + typeid +
                ", typename='" + typename + '\'' +
                '}';
    }

    public int getTypeid() {
        return typeid;
    }

    public void setTypeid(int typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }
}
