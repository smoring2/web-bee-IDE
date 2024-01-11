package webbee.redis;

import org.bee.webBee.DataStoreBase;

import java.util.Map;

/**
 * data 2017-04-22   00:19
 * E-mail   sis.nonacosa@gmail.com
 * @author sis.nonacosa
 */
public class RedisHash implements DataStoreBase {


    public boolean insert(String key, Map<String,String> value) {
        return Redis.create().hmset(key, value).equals("OK");
    }

    @Override
    public Object insert(Object value) {
        return null;
    }

    @Override
    public Object select() {
        return null;
    }


    public static RedisHash create(){
        return new RedisHash();
    }



}
