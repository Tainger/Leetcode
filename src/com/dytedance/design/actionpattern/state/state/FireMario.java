package com.dytedance.design.actionpattern.state.state;

import com.dytedance.design.actionpattern.state.State;

/**
 * @author jiazhiyuan
 * @date 2021/10/2 10:16 上午
 */
public class FireMario implements IMario{

    private  MarioStateMachine stateMachine;


    public FireMario(MarioStateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public State getName() {
        return State.FIRE;
    }

    @Override
    public void obtainMushRoom() {
        //  无状态
    }

    @Override
    public void obtainCape() {
        //   无状态
    }

    @Override
    public void obtainFireFlower() {
        //   无状态
    }

    @Override
    public void meetMonster() {
        stateMachine.setCurrentState(new SmallMario(stateMachine));
        stateMachine.setScore(-300);
    }
}



    
