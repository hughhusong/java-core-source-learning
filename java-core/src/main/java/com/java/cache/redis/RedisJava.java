package com.java.cache.redis;

import redis.clients.jedis.Jedis;

public class RedisJava {

	
	
	/* redis 缓存的问题 在Mysql中加上一层作为缓存，将数据存在内存中。 
	实现原理和hadoop中的namenode的实现一样，记日志的形式，每次重启的时候按照日志恢复。 dp中也是这种思想，空间换取时间。
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Connecting to Redis server on localhost
		Jedis jedis = new Jedis("10.137.12.12", 6379);

		System.out.println("Connection to server sucessfully");
		// check whether server is running or not
		System.out.println("Server is running: " + jedis.ping());

		jedis.set("tch", "sb");  //保存数据 有自己的数据类型
		// Get the stored data and print it
		System.out.println("tch:: " + jedis.get("tch"));  //获取数据 
		
		
	}

	
}
