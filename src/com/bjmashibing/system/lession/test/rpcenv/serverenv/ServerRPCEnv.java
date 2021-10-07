package com.bjmashibing.system.lession.test.rpcenv.serverenv;

import com.bjmashibing.system.lession.test.discover.MyDiscover;
import com.bjmashibing.system.lession.test.rpcenv.DecodeHandler;
import com.bjmashibing.system.lession.test.service.Car;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.net.InetSocketAddress;

/**
 * @author: 马士兵教育
 * @create: 2020-07-18 11:38
 */
public class ServerRPCEnv {

    public static void startServer(){

        MyDiscover.register(Car.class,new InetSocketAddress("localhost",9090));

        NioEventLoopGroup boss = new NioEventLoopGroup(10);
        NioEventLoopGroup worker =  boss;

        ServerBootstrap sbs = new ServerBootstrap();
        ChannelFuture bind = sbs.group(boss, worker)
                .channel(NioServerSocketChannel.class)
                .option(ChannelOption.SO_RCVBUF,1024*1024)
                .childOption(ChannelOption.SO_RCVBUF,8192)
                .childHandler(new ChannelInitializer<NioSocketChannel>() {
                    @Override
                    protected void initChannel(NioSocketChannel ch) throws Exception {
//                        System.out.println("server accept cliet port: "+ ch.remoteAddress().getPort());
                        ChannelPipeline p = ch.pipeline();
                        p.addLast(new DecodeHandler());
                        p.addLast(new ServerRequestHandler());
                    }
                }).bind(new InetSocketAddress("localhost", 9090));
        try {
            bind.sync().channel().closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
