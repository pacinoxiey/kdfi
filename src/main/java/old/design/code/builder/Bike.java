package old.design.code.builder;

import old.design.code.builder.part.IFrame;
import old.design.code.builder.part.ISeat;
import old.design.code.builder.part.ITire;

/**
 * @author xiey
 * @version  2019/7/12 16:01
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
