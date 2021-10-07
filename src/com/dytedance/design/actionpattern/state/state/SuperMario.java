package com.dytedance.design.actionpattern.state.state;

import com.dytedance.design.actionpattern.state.State;

/**
 * @author jiazhiyuan
 * @date 2021/10/2 10:08 上午
 */
public class SuperMario implements IMario{

    private MarioStateMachine stateMachine;

    public SuperMario(MarioStateMachine marioStateMachine) {
        this.stateMachine = marioStateMachine;
    }

    @Override
    public State getName() {
        return State.SUPER;
    }

    @Override
    public void obtainMushRoom() {

        //无状态
    }

    @Override
    public void obtainCape() {
        stateMachine.setCurrentState(new CapeMario(stateMachine));     stateMachine.setScore(stateMachine.getScore() + 200);
    }

    @Override
    public void obtainFireFlower() {
        stateMachine.setCurrentState(new FireMario(stateMachine));     stateMachine.setScore(stateMachine.getScore() + 300);
    }

    @Override
    public void meetMonster() {
        stateMachine.setCurrentState(new SmallMario(stateMachine));
        stateMachine.setScore(-100);
    }
}



    
