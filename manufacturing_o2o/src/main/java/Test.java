import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class Test {


    public static void main(String[] args) {
//        Jedis jedis = new Jedis("39.108.229.47",6379);
//        String username = jedis.get("username");
//        System.out.println(username);
//
//        jedis.set("addr","北京");
//        System.out.println(jedis.get("addr"));

        JedisPoolConfig poolConfig = new JedisPoolConfig();
        poolConfig.setMaxIdle(30);
        poolConfig.setMinIdle(10);
        poolConfig.setMaxTotal(50);
        JedisPool pool = new JedisPool(poolConfig,"39.108.229.47",6379);
        Jedis jedis = pool.getResource();
        jedis.set("xxx","yyy");

        System.out.println(jedis.get("xxx"));
        jedis.close();
        pool.close();
    }
}
