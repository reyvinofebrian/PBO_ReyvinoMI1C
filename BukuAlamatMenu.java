/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PINO
 */
public class BukuAlamatMenu {
     public static void main(String[] args) {
        BukuAlamatData operasional = new BukuAlamatData();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("MENU UTAMA:");
            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Semua Data");
            System.out.println("3. Update Data");
            System.out.println("4. Hapus Data");
            System.out.print("Pilih (1-4): ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Indeks (0-4): ");
                    int idx = input.nextInt(); input.nextLine();
                    
                    BukuAlamat baru = new BukuAlamat();
                    System.out.print("Nama   : "); baru.setNama(input.nextLine());
                    System.out.print("Alamat : "); baru.setAlamat(input.nextLine());
                    System.out.print("Nomor  : "); baru.setNomor(input.nextLine());
                    System.out.print("Email  : "); baru.setEmail(input.nextLine());
                    
                    operasional.insert(baru, idx);
                    break;

                case 2:
                    operasional.view();
                    break;

                case 3:
                    System.out.print("Indeks mana yang mau diupdate? ");
                    int idxUp = input.nextInt(); input.nextLine();
                    
                    BukuAlamat updateData = new BukuAlamat();
                    System.out.print("Nama Baru   : "); updateData.setNama(input.nextLine());
                    System.out.print("Alamat Baru : "); updateData.setAlamat(input.nextLine());
                    System.out.print("Nomor Baru  : "); updateData.setNomor(input.nextLine());
                    System.out.print("Email Baru  : "); updateData.setEmail(input.nextLine());
                    
                    operasional.update(updateData, idxUp);
                    break;

                case 4:
                    System.out.print("Indeks mana yang mau dihapus? ");
                    int idxDel = input.nextInt();
                    operasional.delete(idxDel);
                    break;
                    
                default:
                    System.out.println("Pilihan tidak tersedia.");
            }
        } while (pilihan != 5);
    }
}

