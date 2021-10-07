package com.dytedance.design.actionpattern.state.findtable;

import com.dytedance.design.actionpattern.state.State;

import static com.dytedance.design.actionpattern.state.State.*;

/**
 * @author jiazhiyuan
 * @date 2021/10/2 9:54 上午
 */
public class MarioStateMachine {
    private int score;
    private State currentState;

    private static final State[][] transitionTable = {{SUPER, CAPE, FIRE, SMALL}, {SUPER, CAPE, FIRE, SMALL}, {CAPE, CAPE, CAPE, SMALL}, {FIRE, FIRE, FIRE, SMALL}};

    private static final int[][] actionTable = {           {+100, +200, +300, +0},           {+0, +200, +300, -100},           {+0, +0, +0, -200},           {+0, +0, +0, -300}   };

    public MarioStateMachine() {
        this.score = 0;
        this.currentState = State.SMALL;
    }

    public void obtainMushRoom() {
        executeEvent(Event.GOT_MUSHROOM);
    }

    public void obtainCape() {
        executeEvent(Event.GOT_CAPE);
    }

    public void obtainFireFlower() {
        executeEvent(Event.GOT_FIRE);
    }

    public void meetMonster() {
        executeEvent(Event.MET_MONSTER);
    }

    private void executeEvent(Event event) {
        int stateValue = currentState.getValue();
        int eventValue = event.getValue();
        this.currentState = transitionTable[stateValue][eventValue];
        this.score = actionTable[stateValue][eventValue];
    }

    public int getScore() {
        return this.score;
    }

    public State getCurrentState() {
        return this.currentState;
    }
}



    
