/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorphism;

/**
 *
 * @author hachi
 */
public class Penyanyi {
    public void bernyanyi() {
        System.out.println("Karakteristik suara " + "masih luas");
    }
}

class PenyanyiJazz extends Penyanyi {
    @Override
    public void bernyanyi () {
        System.out.println("Bernyanyi dengan Genre POP");
    }
}

class Penyanyipop extends Penyanyi {
    @Override
    public void bernyanyi () {
        System.out.println("nyanyi dengan genre pop");
    }
}
class Penyanyirock extends Penyanyi {
    @Override
    public void bernyanyi () {
        System.out.println("nyanyi dengan genre rock");
    }
}
