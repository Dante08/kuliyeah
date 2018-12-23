package polymorphism;
public class Overload {
    public void Tampil (String max) {
        System.out.println(max);
    }
}

class NilaiMaksimal2 extends Overload {
    public void TampilMaksimal (int max) {
        System.out.println(max);
    }
}

class NilaiMinimal2 extends Overload {
    public void TampilMaksimal (float max) {
        System.out.println(max);
    }
}

class Jumlah2 extends Overload {
    public void TampilMaksimal (double max) {
        System.out.println(max);
    }
}