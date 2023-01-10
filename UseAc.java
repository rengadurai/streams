package collection3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseAc {

	public static void main(String[] args) {
		
		ArrayList<Ac> acs = new ArrayList<>();
		acs.add(new Ac("Tata", "White", 1.5f, false, 25000));
		acs.add(new Ac("BlueStar", "Blue", 2f, false, 22000));
		acs.add(new Ac("LG", "White", 1.5f, true, 30000));
		acs.add(new Ac("Samsung", "Red", 2.0f, true, 32000));
		acs.add(new Ac("Voltas", "Gray", 2.5f, true, 35000));
		acs.add(new Ac("WhirlPool", "Orange", 3.0f, true, 45000));
		
		List<Ac> highCapacity = acs.stream().filter(x -> x.getCapacity()>1.5f).collect(Collectors.toList());
		highCapacity.forEach(x->System.out.println(x));
		
		System.out.println();
		
		List<Ac> lowPrice = acs.stream().filter(x -> x.getPrice()<35000).collect(Collectors.toList());
		lowPrice.forEach(x->System.out.println(x));
		
		Map<Integer, Ac> highPrice = acs.stream().filter(x -> x.getPrice()>30000).collect(Collectors.toMap(x->x.getPrice(), y->y));
		for(Integer x : highPrice.keySet()) {
			System.out.println(x);
		}
	
		System.out.println();
		
		List<Ac> prices = acs.stream().sorted(Comparator.comparingInt(Ac::getPrice)).collect(Collectors.toList());
		prices.forEach(x -> System.out.println(x));
		
		
		
		
	}

}
