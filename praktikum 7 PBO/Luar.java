public class Luar {
  String namaLuar = "Luar";

  public class Dalam {
    String namaDalam = "Dalam";
    String namaLuar = "DalamLuar";
   
    public void tampilkanInfo() {
      System.out.println(Luar.this.namaLuar);
      System.out.println(namaDalam);
    }
  }
  public static void main(String []args) {
  Luar luar = new Luar();
  Luar.Dalam dalam  = luar.new Dalam();
  dalam.tampilkanInfo();
  } 
}

