package com.kilobolt.GameWorld;

import com.kilobolt.GameObjects.Bird;
import com.kilobolt.GameObjects.ScrollHandler;
import com.kilobolt.ZBHelpers.AssetLoader;

public class GameWorld {

    private Bird bird;
    private ScrollHandler scroller;
    private boolean isAlive = true;
    
    public GameWorld(int midPointY) {
        bird = new Bird(33, midPointY - 5, 17, 12);
        // The grass should start 66 pixels below the midPointY
        scroller = new ScrollHandler(midPointY + 66);
    }

    public void update(float delta) {

        bird.update(delta);
        scroller.update(delta);

        if (scroller.collides(bird) && isAlive) {
            scroller.stop();
            AssetLoader.dead.play();
            isAlive = false;
        }
    }

    public Bird getBird() {
        return bird;

    }

    public ScrollHandler getScroller() {
        return scroller;
    }
}