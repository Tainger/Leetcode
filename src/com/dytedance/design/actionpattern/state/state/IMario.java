package com.dytedance.design.actionpattern.state.state;


import com.dytedance.design.actionpattern.state.State;

//所有状态类
public interface IMario {
    State getName();


    //获得蘑菇
    void obtainMushRoom();
    //获得斗篷
    void obtainCape();
    //获得火花
    void obtainFireFlower();
    //遇见怪物
    void meetMonster();
}
