package com.dytedance.design.actionpattern.state.ifelse;

import com.dytedance.design.actionpattern.state.State;

/**
 * @author jiazhiyuan
 * @date 2021/10/2 9:34 上午
 */
public class MarioStateMachine {
    private int score;

    private State currentState;

    public MarioStateMachine(int score, State currentState) {
        this.score = score;
        this.currentState = currentState;
    }

    public void obtainMushRoom() {
        if (currentState.equals(State.SMALL)) {
            this.currentState = State.SMALL;
            this.score = 0;
        }
    }


    public void obtainCape() {
        if (currentState.equals(State.SMALL) || currentState.equals(State.SUPER)) {
            this.currentState = State.SUPER;
            this.score += 100;
        }

    }

    public void obtainFireFlower() {
        if (currentState.equals(State.SMALL) || currentState.equals(State.SUPER)) this.currentState = State.FIRE;
        this.score += 300;
    }

    public void meetMonster() {
        if (currentState.equals(State.SUPER)) {
            this.currentState = State.SMALL;
            this.score -= 100;
            return;
        }
        if (currentState.equals(State.CAPE)) {
            this.currentState = State.SMALL;
            this.score -= 200;
            return;
        }
        if (currentState.equals(State.FIRE)) {
            this.currentState = State.SMALL;
            this.score -= 300;
            return;
        }
    }


    public State getCurrentState() {
        return this.currentState;
    }

    public int getScore() {

        return this.score;
    }

}



    
