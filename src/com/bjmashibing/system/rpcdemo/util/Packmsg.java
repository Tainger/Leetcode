package com.bjmashibing.system.rpcdemo.util;

import com.bjmashibing.system.rpcdemo.rpc.protocol.MyContent;
import com.bjmashibing.system.rpcdemo.rpc.protocol.Myheader;

/**
 * @author: 马士兵教育
 * @create: 2020-07-19 20:47
 */
public class Packmsg {

    Myheader header;
    MyContent content;

    public Myheader getHeader() {
        return header;
    }

    public void setHeader(Myheader header) {
        this.header = header;
    }

    public MyContent getContent() {
        return content;
    }

    public void setContent(MyContent content) {
        this.content = content;
    }

    public Packmsg(Myheader header, MyContent content) {
        this.header = header;
        this.content = content;
    }
}
