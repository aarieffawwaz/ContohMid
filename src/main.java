import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<Kegiatan> listKegiatan = new ArrayList<Kegiatan>();
		
		int menu;
		do {
			menu = scan.nextInt();
			scan.nextLine();
			switch(menu) {
			case 1:
				String namaKegiatan, prioritas, deadline;
				
				
				do {
					System.out.println("Enter nama Kegiatan : ");
					namaKegiatan = scan.nextLine();		
				}while(namaKegiatan.length() < 5);
				
				do {
					System.out.println("Enter prioritas Kegiatan : ");
					prioritas = scan.nextLine();		
				}while(!prioritas.equals("Rendah") && prioritas.compareTo("Tinggi") != 0 && !prioritas.equals("Sedang"));
				
				do {
					System.out.println("Enter deadline Kegiatan : ");
					deadline = scan.nextLine();		
				}while(!deadline.matches("[0-9][0-9]/[0-9][0-9]/[0-9][0-9][0-9][0-9]"));
				
				listKegiatan.add(new Kegiatan(namaKegiatan,prioritas,deadline));
				break;
			case 2:
				for(int i = 0; i < listKegiatan.size(); i++) {
					System.out.println(listKegiatan.get(i).getNamaKegiatan());
					System.out.println(listKegiatan.get(i).getPrioritas());
					System.out.println(listKegiatan.get(i).getDeadline());
					listKegiatan.get(i).lakukan();
				}
				break;
			}
			
		}while(menu != 3);
	}

}
