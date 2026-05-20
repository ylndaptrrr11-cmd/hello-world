public class PENGINAPAN {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // LOGIN
        String user, pass;

        System.out.println("PROGRAMMER BY : YOLANDA ");
        System.out.println("================================");

        System.out.print("UserID   : ");
        user = input.nextLine();

        System.out.print("Password : ");
        pass = input.nextLine();

        // KETENTUAN DATA
        String[] namaInstansi = new String[100];
        String[] tglKegiatan = new String[100];
        int[] lamaKegiatan = new int[100];
        int[] jumlahPengunjung = new int[100];
        char[] paket = new char[100];

        double[] bayar = new double[100];
        double[] dp = new double[100];
        double[] sisa = new double[100];
        

       