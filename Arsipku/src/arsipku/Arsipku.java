package arsipku;
public class Arsipku implements Biodata, Nilai{
    public static void main(String[] args) {
        Arsipku ar = new Arsipku();
        ar.nama();
        ar.tempatLahir();
        ar.hobi();
        ar.agama();
        ar.bahasaIndonesia();
        ar.matematika();
    }

   public void nama(){
       System.out.println("Nama = Irfan Prasetyo");
   }
   
   public void tempatLahir(){
       System.out.println("Tempat Lahir = Jember");
   }
   
   public void hobi(){
       System.out.println("Hobi = Explore Indonesia");
   }
   
   public void agama(){
       System.out.println("Agama = 100");
   }
   
   public void bahasaIndonesia(){
       System.out.println("Bahasa Indonesia = 69");
   }
   
   public void matematika(){
       System.out.println("Matematika = 53");
   }
    
}
