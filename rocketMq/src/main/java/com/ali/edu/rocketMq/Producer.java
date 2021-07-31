package com.ali.edu.rocketMq;


import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.LocalTransactionState;
import org.apache.rocketmq.client.producer.TransactionListener;
import org.apache.rocketmq.client.producer.TransactionMQProducer;
import org.apache.rocketmq.client.producer.TransactionSendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.common.message.MessageExt;

import javax.sound.midi.MetaMessage;

/**
 * @author jiazhiyuan
 * @date 2021/7/21 9:28 下午
 */
public class Producer {

    public static void main(String[] args) throws MQClientException {


        TransactionMQProducer producer = new TransactionMQProducer("xoxogp");

        producer.setNamesrvAddr("192.168.124.15:9876");


        producer.setTransactionListener(new TransactionListener() {
            @Override
            public LocalTransactionState executeLocalTransaction(Message message, Object o) {


                System.out.println("=======executeLocalTransaction");
                System.out.println("msg:"+ new String(message.getBody()));
                System.out.println("msg:"+ message.getTransactionId() );

                //执行本地事务
                return LocalTransactionState.UNKNOW;
            }

            @Override
            public LocalTransactionState checkLocalTransaction(MessageExt msg) {


                System.out.println("=======checkLocalTransaction");
                System.out.println("msg:"+ new String(msg.getBody()));
                System.out.println("msg:"+ msg.getTransactionId() );

                //Broker 端回调，检查事务


                //事务执行成功
                return  LocalTransactionState.UNKNOW;

                //等会儿
                //return LocalTransactionState.UNKNOW;
                //回滚消息
                //return LocalTransactionState.ROLLBACK_MESSAGE;


                //return null;
            }
        });


        producer.start();

        TransactionSendResult sendResult = producer.sendMessageInTransaction(new Message("xxoo001", "测试！ 这是事务消息".getBytes()), null);

        System.out.println("sendResult：" + sendResult );

       // producer.shutdown();

        System.out.println("已经停机");

    }




}



    
