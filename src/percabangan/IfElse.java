package percabangan;

public class IfElse {
    public static void main(String[] args){
        double totalBelanja = 60000;
        double uangDiDompet = 30000;

        if(uangDiDompet<totalBelanja){
            System.out.println("Uang Tidak cukup, kurangi jajan anda");
        }else if (uangDiDompet>totalBelanja){
            double angsul = uangDiDompet-totalBelanja;
            System.out.println("Uang cukup, angsul : "+angsul);
        }else{
            System.out.println("Uang pas..Alhamdulilah..");
        }
    }
}