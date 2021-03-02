package old.design.thread.immutableobject;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author xiey
 * @version 2019年6月10日 下午2:33:56
 */
public final class MmscRouter {
    /**
     * 用volatile修饰，保证多线程环境下该变量的可见性
     */
    private static volatile MmscRouter instance = new MmscRouter();
    /**
     * 维护手机号码前缀到彩信中心之间的映射关系
     */
    private static Map<String, MmscInfo> routeMap;

    public MmscRouter() {
        // 将数据库表中的数据加载到内存，存为Map
        MmscRouter.routeMap = MmscRouter.retrieveRouteMapFromDB();
    }

    private static Map<String, MmscInfo> retrieveRouteMapFromDB() {
        Map<String, MmscInfo> map = new HashMap<String, MmscInfo>(16);
        // 省略其它代码
        return map;
    }

    public static MmscRouter getInstance() {

        return instance;
    }

    /**
     * 根据手机号码前缀获取对应的彩信中心信息
     *
     * @param msisdnPrefix 手机号码前缀
     * @return 彩信中心信息
     */
    public MmscInfo getMMSC(String msisdnPrefix) {
        return routeMap.get(msisdnPrefix);

    }

    /**
     * 将当前MMSCRouter的实例更新为指定的新实例
     *
     * @param newInstance 新的MMSCRouter实例
     */
    public static void setInstance(MmscRouter newInstance) {
        instance = newInstance;
    }

    private static Map<String, MmscInfo> deepCopy(Map<String, MmscInfo> m) {
        Map<String, MmscInfo> result = new HashMap<String, MmscInfo>();
        for (String key : m.keySet()) {
            result.put(key, new MmscInfo(m.get(key)));
        }
        return result;
    }

    public Map<String, MmscInfo> getRouteMap() {
        // 做防御性拷贝, 不可修改
        return Collections.unmodifiableMap(deepCopy(routeMap));
    }
}
