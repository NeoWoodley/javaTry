package calabashBrothers.beings;

import calabashBrothers.Maps;

/**
 * @ Author     ：Young
 * @ Description：蛇精
 */
public class Snake extends Monster implements CheeringUp{
    public Snake() {
        this.name="蛇精";
    }

    @Override
    public void selfIntroduction() {
        super.selfIntroduction();
        System.out.println("我是"+this.name);
    }

    @Override
    public void CheeringUp(Maps<Creature> maps, int x, int y) {
        if(maps.empty(x,y)){
            maps.getMaps().get(x).get(y).setContent(this);
        }
    }
}
