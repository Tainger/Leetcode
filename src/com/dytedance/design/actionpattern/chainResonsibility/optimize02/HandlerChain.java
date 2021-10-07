package com.dytedance.design.actionpattern.chainResonsibility.optimize02;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiazhiyuan
 * @date 2021/10/2 11:38 上午
 */
public class HandlerChain {

    private List<IHandler> handlers = new ArrayList<>();

    public void addHandler(IHandler iHandler) {
        handlers.add(iHandler);
    }

    public void handle() {
        for (IHandler handler : handlers) {
            boolean handle = handler.handle();

            if (!handle) {
                break;
            }

        }
    }
}



    
