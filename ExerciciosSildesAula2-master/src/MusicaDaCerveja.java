
public class MusicaDaCerveja {
	public static void main(String[] args) {
		int cervejas = 99;
		
		while (cervejas != 0) {
			System.out.println(cervejas + " cervejas no freezer\nPego uma garrafa, passo pra frente\nAgora são " + 			(cervejas - 1) + " cervejas no freezer.");
			cervejas -= 1;
		}
	}
}
