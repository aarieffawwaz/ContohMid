
public class Kegiatan {
	private String namaKegiatan, prioritas, deadline;
	
	public Kegiatan (String namaKegiatan, String prioritas, String deadline) {
		this.namaKegiatan = namaKegiatan;
		this.prioritas = prioritas;
		this.deadline = deadline;
	}

	public String getNamaKegiatan() {
		return namaKegiatan;
	}

	public String getPrioritas() {
		return prioritas;
	}

	public String getDeadline() {
		return deadline;
	}
	
	public void lakukan() {
		if(prioritas.equals("Tinggi")) {
			System.out.println("Lakukan " + namaKegiatan + " sekarang!");
		}
		
	}
}
