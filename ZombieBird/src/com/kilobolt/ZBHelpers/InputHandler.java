package com.kilobolt.ZBHelpers;

import com.badlogic.gdx.InputProcessor;
import com.kilobolt.GameObjects.Bird;

public class InputHandler implements InputProcessor {

  private Bird myBird;
  
  public InputHandler() {
    // TODO Auto-generated constructor stub
  }
  
  public InputHandler(Bird bird) {
    // myBird now represents the gameWorld's bird.
    myBird = bird;
  }

  @Override
  public boolean keyDown(int keycode) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean keyUp(int keycode) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean keyTyped(char character) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean touchDown(int x, int y, int pointer, int button) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean touchUp(int x, int y, int pointer, int button) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean touchDragged(int x, int y, int pointer) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean touchMoved(int x, int y) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean scrolled(int amount) {
    // TODO Auto-generated method stub
    return false;
  }

}
