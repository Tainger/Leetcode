package com.main.preview;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author jiazhiyuan
 * @date 2021/12/6 9:22 下午
 */
public class Demo1 {
    public int minMeetingRooms(int[][] intervals) {
        if (intervals == null || intervals.length == 0)
            return 0;
        Arrays.sort(intervals, (v1, v2) -> (v1[0] - v2[0]));
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int meetingCount = 0;

        for (int[] meeting : intervals){
            while (!heap.isEmpty() && meeting[0] >= heap.peek()){
                heap.poll();
            }
            heap.add(meeting[1]);
            meetingCount = Math.max(meetingCount, heap.size());
        }
        return meetingCount;
    }

}


class Interval{

    public int start;

    public int  end;

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Interval{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}






    
