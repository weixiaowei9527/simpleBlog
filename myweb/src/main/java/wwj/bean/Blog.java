package wwj.bean;

import java.util.Date;

public class Blog {
    private Integer wid;
    private String wtitle;
    private String wcontent;
    private Date wtime;
    public Blog() {
    }
    public Integer getWid() {
        return wid;
    }
    public void setWid(Integer wid) {
        this.wid = wid;
    }
    public String getWtitle() {
        return wtitle;
    }
    public void setWtitle(String wtitle) {
        this.wtitle = wtitle;
    }
    public String getWcontent() {
        return wcontent;
    }
    public void setWcontent(String wcontent) {
        this.wcontent = wcontent;
    }
    public Date getWtime() {
        return wtime;
    }
    public void setWtime(Date wtime) {
        this.wtime = wtime;
    }
    @Override
    public String toString() {
        return "WenZhang [wid=" + wid + ", wtitle=" + wtitle + ", wcontent=" + wcontent + ", wtime=" + wtime + "]";
    }
}
