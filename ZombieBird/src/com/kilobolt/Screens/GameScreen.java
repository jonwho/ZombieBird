package com.kilobolt.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.kilobolt.GameWorld.GameRenderer;
import com.kilobolt.GameWorld.GameWorld;

public class GameScreen implements Screen {

  private GameWorld world;
  private GameRenderer renderer;
  
  public GameScreen() {
    System.out.println("GameScreen Attached");
    
    world = new GameWorld();
    renderer = new GameRenderer(world);
  }

  @Override
  public void render(float delta) {
    world.update(delta);
    renderer.render();
    
  }

  @Override
  public void resize(int width, int height) {
    System.out.println("GameScreen - resizing");
    
  }

  @Override
  public void show() {
    System.out.println("GameScreen - show called");
    
  }

  @Override
  public void hide() {
    System.out.println("GameScreen - hide called");
    
  }

  @Override
  public void pause() {
    System.out.println("GameScreen - pause called");
    
  }

  @Override
  public void resume() {
    System.out.println("GameScreen - resume called");
    
  }

  @Override
  public void dispose() {
    // Left blank
    
  }

}
