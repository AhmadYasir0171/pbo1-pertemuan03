package percabangan;

public class IfElse {
    public static void main(String[] args){
        double totalBelanja = 30000;
        double uangDiDompet = 60000;

        if(uangDiDompet<totalBelanja){
            System.out.println("Uang Tidak cukup, kurangi jajan anda");
        }else{
            System.out.println("Uang cukup, Berelaan lah");
        }
    }
}