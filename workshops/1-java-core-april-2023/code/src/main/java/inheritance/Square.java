package inheritance;

import objects.Rectangle;

public class Square extends Rectangle {
    @Override
    public double calculatePerimeter(){
        return sides * length;
//      return getSides() * getLength();
    }
    public void print(String whatever){
        System.out.println("I am a " + whatever);
    }
}
