package abstractClasses;

public abstract class GameCalculater {
	/* - şimdi senaryo da bu hesaplayı ben bütün ortak claslara yazdım hepsinde var ama burda default bi sonuç yapmıyorum ve sonuç olarak 
	 *   bu şekilde abstract olarak tanımlayınca bu methodu bütün herkes override etmek zorunda oluyo kendi hesaplasını yazıyor.
	 * - abstract metod yapabilmek için abstract class olmak zorunda 
	 * - abstract classın içinde illaki abstract metod olmak zorunda değil 
	 * - abstract classlar new lenemez yani yapılabilir ama içindeki abstract method varsa onlarıda override etmemizi ister bu yüzden tercih edilmez.
	 *  */
	
	public abstract void calculate();
	
	public final void gameOver() {
		System.out.println("Game Over :( ");
	}
}
