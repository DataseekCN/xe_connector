package info.dataseek.xe_connector.utils;

import java.util.Random;

public class KeyUtil {

    /**
     * 生成随机唯一id
     * @return
     */
    public static String generateUniqueKey() {
        Random random = new Random();
        Integer a = random.nextInt(900_000) + 100_000;
        return System.currentTimeMillis() + String.valueOf(a);
    }
}
