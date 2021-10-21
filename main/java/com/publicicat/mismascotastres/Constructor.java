package com.publicicat.mismascotastres;

public class Constructor {

    private String name;
    private String desc;
    private String email;
    private int votes;
    private int pic;

    public Constructor (String name, String desc, String email, int votes, int pic) {
        this.name = name;
        this.desc = desc;
        this.votes = votes;
        this.pic = pic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }
}
