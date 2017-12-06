public class dojo {
   int initialTX;
   int initialTY;
   int lightX;
   int lightY;

   int diffX= initialTX - lightX;
   int diffY= initialTY - lightY;


//AMIKOR CSAK EGY IRÁNYBA KELL MENNI
   if (initialTX ==lightX && initialTY != lightY) { //egy függőleges vonalban vannak
     if (diffY < 0) { // ilyenkor van a light feljebb
       System.out.println("N");
     }
     else if (diffY > 0) { // ilyenkor van a light lejjebb

     }
  }
   else if(initialTY == lightY && initialTX != lightX ) {
     if (diffX >0) { //a light jobbra van
       System.out.println("E");
     }
    if (diffX <0) { //a light balra van
      System.out.println("W");
    }
  }


 //AMIKOR TÖBB IRÁNYBA
  else if (initialTX != lightX && initialTY != lightY)

  {

    if (diffY < 0 && diffX < 0) {
      if (Math.abs(diffX) > Math.abs(diffY)) {
        for (int i = 0; i < Math.abs(diffX) - Math.abs(diffY); i++) {
          System.out.println("E");
        }
        for (int i = 0; ; i++) {
          System.out.println("SE");
        }
      } else if (Math.abs(diffX) < Math.abs(diffY)) {
        for (int i = 0; i < Math.abs(diffY) - Math.abs(diffX); i++) {
          System.out.println("S");
        }
        for (int i = 0; ; i++) {
          System.out.println("SE");
        }
      }
    } else if (diffY > 0 && diffX < 0) {
      if (Math.abs(diffX) > Math.abs(diffY)) {
        for (int i = 0; i < Math.abs(diffX) - Math.abs(diffY); i++) {
          System.out.println("E");
        }
        for (int i= 0; ; i++) {System.out.println("NE");}
      } else if (Math.abs(diffX) < Math.abs(diffY)) {
        for (int i = 0; i < Math.abs(diffY) - Math.abs(diffX); i++) {
          System.out.println("N");
        }
        for (int i= 0; ; i++) {System.out.println("NE");}
      }
    }





    else if (diffY > 0 && diffX > 0) {
      if (Math.abs(diffX) > Math.abs(diffY)) {
        for (int i = 0; i < Math.abs(diffX) - Math.abs(diffY); i++) {
          System.out.println("W");
        }
        for (int i = 0; ; i++) {
          System.out.println("NW");
        }
      } else if (Math.abs(diffX) < Math.abs(diffY)) {
        for (int i = 0; i < Math.abs(diffY) - Math.abs(diffX); i++) {
          System.out.println("N");
        }
        for (int i = 0; ; i++) {
          System.out.println("NW");
        }
      }
    }
    else if (diffY < 0 && diffX > 0) {
      if (Math.abs(diffX) > Math.abs(diffY)) {
        for (int i = 0; i < Math.abs(diffX) - Math.abs(diffY); i++) {
          System.out.println("W");
        }
        for (int i= 0; ; i++) {System.out.println("SW");}
      } else if (Math.abs(diffX) < Math.abs(diffY)) {
        for (int i = 0; i < Math.abs(diffY) - Math.abs(diffX); i++) {
          System.out.println("S");
        }
        for (int i= 0; ; i++) {System.out.println("SW");}
      }
  }

}
