package hari.recyclerview;


public class Friend {
    private String no;
    private String name;
    private String from;

    public Friend(String name, String no, String from) {
        this.no = no;
        this.name = name;
        this.from = from;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}
