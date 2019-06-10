package design.code;
/**
* @author xiey
* @version 2017年10月30日 上午11:12:36
* @describe 工厂模式
*/
public interface  Device {
	void setModel(int model);
    int getModel();

    void setSize(int size);
    int getSize();
}
