package composit;

import lombok.Data;

@Data
// 컴포지션
public class BurgerSet  {
	private Burger burger;
	private Potato potato;
	private Coke coke;
	
	public BurgerSet() {
		this(
				new Burger(),
				new Potato(),
				new Coke()
				);
	}
	
	public BurgerSet(Burger burger, Potato potato, Coke coke) {
		super();
		this.burger = burger;
		this.potato = potato;
		this.coke = coke;
	}
	
	

}
