package com.main.preview;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jiazhiyuan
 * @date 2021/12/6 9:22 下午
 */
public class Demo {
    public String getMostRepeat(String[] strs) {
        Map<String, Integer> record = new HashMap<>();
        String res = null;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < strs.length; i++) {
            if (!record.containsKey(strs[i])) {
                record.put(strs[i], 1);
            }else {
                Integer integer = record.get(strs[i]);
                integer ++;
                record.put(strs[i], integer);

                if(integer > max) {
                    max = integer;
                    res = strs[i];
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        String mostRepeat = demo.getMostRepeat(new String[]{"aa", "bbb", "aa", "bbb", "aa"});
        System.out.println(mostRepeat);
    }

//    //4. 编程实现一个本地流控算法，用于限制每一类业务请求的速率，比如每个user_id（keys）每10秒钟（duration）只能访问5次（times）。类信息如下，请填充空白部分：
//
//    public class RateLimiter {
//        private int duration;
//        private int times;
//
//        private Map<String, Config> requestConfig = new HashMap();
//
//        public RateLimit(int duration, int times) {
//            this.duration = duration;
//            this.times = times;
//        }
//        该方法
//        public boolean isLimit(String key) {
//            Config config = requestConfig.get(key);
////              	if(null == config) {
////                   Config config = new Config();
////                 }
////            		long count = config.getAtomicInteger().incrementAndGet();
////              	long nowTimeStamp = System.currentTimeMillis();
////              	config.get
//
////              	if(count > time && (nowTimeStamp - config.getTimeStamp)/1000 < duration) {
////                  	return false;
////                 }
//
//        }
//        // 每次业务请求之前调用
//
//    }
//
//// 	class Config{
//
////       private AtomicInteger counter;
//
////       private long timeStamp;
//
//
////     }



}






    
