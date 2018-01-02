package tilegame;

import static java.awt.Color.red;

import Display.Display;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;


//holds all the base code for the game
//need Runnable for threads
public class Game implements Runnable {

  public int width;
  public int height;
  public String title;

  private boolean running = false;

  private Display display;

  private Thread thread;

  private BufferStrategy bs;
  private Graphics g;


  public Game(String title, int width, int height) {
    this.width = width;
    this.height = height;
    this.title = title;

  }

  //initializing the display
  private void init() {
    display = new Display(title, width, height);
  }

  //this will update everything in the game
  private void update() {

  }

  //this will render everything in the game
  private void render() {
    //sets bs bufferstrategy variable equal to the bs of the canvas
    bs = display.getCanvas().getBufferStrategy();
    if (bs == null) {
      display.getCanvas().createBufferStrategy(3);
      //must return from this method to avoid errors
      return;
    }
    g = bs.getDrawGraphics();
    //Clear Screen
    g.clearRect(0, 0, width, height);
    //Draw here

    g.setColor(red);
    g.fillRect(10, 50, 40, 70);

    //end drawing
    //this is needed to make it work
    bs.show();
    g.dispose();
  }

  //need public void run for Runnable
  //run calls the init method
  public void run() {
    init();
    while (running) {
      //keeps updating and rendering over and over again
      update();
      render();
    }
    //if running becomes false it calls the stop method
    stop();
  }

  //starts up the thread
//synchronized- only used for threads when working with them dírectly
  public synchronized void start() {
    //initializing and starting the thread
    //thread.start() is calling the run() method
    //the majority of game code goes there
    //if running is already it returns, the code below doesn't get executed
    if (running) {
      return;
    }
    running = true;
    thread = new Thread(this);
    thread.start();
  }

  //stops thread safely
  public synchronized void stop() {
    if (!running) {
      return;
    }
    running = false;
    try {
      thread.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }


}
