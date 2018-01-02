package music;

//The classes referenced should be in a package called main.java.music.
//
//We start with a base, abstract class Instrument.
//
//it reserves (e.g. protected) the name of the instrument
//it should provide a play() method.
//Next, we add another abstract class, StringedInstrument which extends Instrument. It
//
//introduces numberOfStrings and
//sound() method what's implementation is yet unknown
//but with the help of the sound() the play() method is fully implementable
//StingedInstrument has 3 descendants, namely:-
//
//Electric Guitar (6 strings, "Twang")
//Bass Guitar (4 strings, "Duum-duum-duum")
//Violin (4 strings, "Screech")
//The Workshop should be invoked by an App Class which is placed outer than the package:-


public abstract class Instrument {

  protected String name;


  public Instrument(String name) {
    this.name = name;
  }

  public Instrument() {
    this.name = "Instrument";
  }

  public void play() {
    System.out.println("You play the " + this.name + "... ");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
