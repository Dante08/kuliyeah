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
class overload {
    public void tampil(String x) {
        System.out.println(x);
    }
}
class karakter extends overload{
    public void tampilkarakter(int x) {
        System.out.println(x);
    }
}
class integer extends overload {
    public void tampilkarakter(int x) {
        System.out.println(x);
    }
}
class koma extends overload {
    public void tampilkarakter(float x) {
        System.out.println(x);
    }
}