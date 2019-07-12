package design.code.builder;

import design.code.builder.part.IFrame;
import design.code.builder.part.ISeat;
import design.code.builder.part.ITire;

/**
 * @author xiey
 * @date 2019/7/12 16:01
 * @description：
 */
public class Bike {

    private IFrame frame;
    private ISeat seat;
    private ITire tire;

    public IFrame getFrame() {
        return frame;
    }

    public void setFrame(IFrame frame) {
        this.frame = frame;
    }

    public ISeat getSeat() {
        return seat;
    }

    public void setSeat(ISeat seat) {
        this.seat = seat;
    }

    public ITire getTire() {
        return tire;
    }

    public void setTire(ITire tire) {
        this.tire = tire;
    }
}
