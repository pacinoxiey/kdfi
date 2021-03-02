package old.design.thread.immutableobject;

/**
 * @author xiey
 * @version 2019年6月10日 下午2:52:44
 */
public class OmcAgent extends Thread {

	@Override
	public void run() {
		boolean isTableModificationMsg = false;
		String updatedTableName = null;
		while (true) {
			// 省略其它代码
			/*
			 * 从与OMC连接的Socket中读取消息并进行解析, 解析到数据表更新消息后,重置MMSCRouter实例。
			 */
			if (isTableModificationMsg) {
				if ("MMSCInfo".equals(updatedTableName)) {
					MmscRouter.setInstance(new MmscRouter());
				}
			}
			// 省略其它代码
		}
	}
}
