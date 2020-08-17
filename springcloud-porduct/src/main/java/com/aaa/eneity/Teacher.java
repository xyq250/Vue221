package com.aaa.eneity;

public class Teacher {
    private String tid;
    private String tname;
    private Integer posts;
    private Integer tstate;

    public Teacher(String tid, String tname, Integer posts, Integer tstate) {
        this.tid = tid;
        this.tname = tname;
        this.posts = posts;
        this.tstate = tstate;
    }

    public Teacher() {
    }

    public String getTid() {
        return tid;
    }

    public String getTname() {
        return tname;
    }

    public Integer getPosts() {
        return posts;
    }

    public Integer getTstate() {
        return tstate;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public void setPosts(Integer posts) {
        this.posts = posts;
    }

    public void setTstate(Integer tstate) {
        this.tstate = tstate;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid='" + tid + '\'' +
                ", tname='" + tname + '\'' +
                ", posts=" + posts +
                ", tstate=" + tstate +
                '}';
    }
}
