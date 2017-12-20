import java.awt.*;


public class Character {

  private int charPositionX;
  private int charPositionY;

  public Character(Graphics graphics, int charPositionX, int charPositionY) {
    PositionedImage cica = new PositionedImage("Graphics/cica_100.png");
    cica.draw(graphics, charPositionX, charPositionY);
  }

  public int getCharPositionX() {
    return charPositionX;
  }

  public int getCharPositionY() {
    return charPositionY;
  }

  public void setCharPositionX(int charPositionX) {
    this.charPositionX = charPositionX;
  }

  public void setCharPositionY(int charPositionY) {
    this.charPositionY = charPositionY;
  }
}
