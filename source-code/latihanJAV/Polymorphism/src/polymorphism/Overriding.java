
package polymorphism;
public class Overriding {
    public void nilai() {
        System.out.print("Nilai nya adalah ... ");
    }
    
}

class NilaiMaksimal1 extends Overriding {
    @Override
    public void nilai () {
        System.out.print('\n'+"\nNilai Maksimalnya adalah ");
    }
}

class NilaiMinimal1 extends Overriding {
    @Override
    public void nilai () {
        System.out.print('\n'+"\nNilai Minimalnya adalah ");
    }
}

class Jumlah1 extends Overriding {
    @Override
    public void nilai () {
        System.out.print('\n'+"\nJumlah nya adalah ");
    }
}