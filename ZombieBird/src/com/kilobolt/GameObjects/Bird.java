package com.kilobolt.GameObjects;

import com.badlogic.gdx.math.Vector2;

public class Bird {

  private Vector2 position;
  private Vector2 velocity;
  private Vector2 acceleration;
  
  private float rotation;
  private int width;
  private int height;
  
  public Bird() {
    // TODO Auto-generated constructor stub
  }
  
  public void update(float delta) {
    velocity.add(acceleration.cpy().scl(delta));
    
    if (velocity.y > 200) {
      velocity.y = 200;
    }
    
    position.add(velocity.cpy().scl(delta));
  }

  public void onClick() {
    velocity.y = -140;
  }
  
  public float getX() {
    return position.x;
  }
  
  public float getY() {
    return position.y;
  }
  
  public float getWidth() {
    return width;
  }
  
  public float getHeight() {
    return height;
  }
  
  public float getRotation() {
    return rotation;
  }
}
