package collection3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UseBus {

	public static void main(String[] args) {
		
		ArrayList<Bus> busses = new ArrayList<>();
		busses.add(new Bus("ABC Travels", "TN05B2056", "Jackson", 9874563210L, 52));
		busses.add(new Bus("TRA Travels", "TN45N2546", "Sam", 4567899365461L, 45));
		busses.add(new Bus("NRNA", "TN11K5565", "John", 9874563214L, 38));
		busses.add(new Bus("ABC Travels", "TN05U2056", "Jackson", 9874563210L, 45));
		busses.add(new Bus("RRR Travels", "TN15B5056", "Ramraj", 8874563210L, 55));
		busses.add(new Bus("KPN Travels", "TN01C2056", "William", 6674563210L, 58));
		busses.add(new Bus("Suriya Travels", "TN06B2857", "Jack", 7774563210L, 52));
		busses.add(new Bus("RID Travels", "TN45KL9056", "Rajan", 65494563210L, 60));
		busses.add(new Bus("NKP Travels", "TN62B2056", "Jaredson", 6578963210L, 52));
		busses.add(new Bus("NAM Travels", "TN05L3056", "Ramu", 6874563210L, 55));
		
		/*List<Bus> largeCapacityBusses = busses.stream().filter(x -> x.getNoOfSeats()>=52).collect(Collectors.toList());
		
		for(Bus x : largeCapacityBusses) {
			System.out.println(x);
		}
		
		long countLargeCapacityBusses = busses.stream().filter(x -> x.getNoOfSeats()>=52).count();
		System.out.println("largeCapacityBussesCount: " + countLargeCapacityBusses);
		
		List<String> travelsNames = busses.stream().filter(x -> x.getNoOfSeats()>=52).map(x -> x.getTravellerName()).collect(Collectors.toList());
		
		travelsNames.forEach(x -> System.out.println(x));
		
		
		
		List<String> busNos = busses.stream().filter(x -> x.getNoOfSeats()<=52).map(a->a.getBusNumber()).collect(Collectors.toList());
		busNos.forEach(x-> System.out.println(x));
		
		List<Long> mobileNos = busses.stream().filter(x -> x.getNoOfSeats()>52).map(a->a.getMobileNumber()).collect(Collectors.toList());
		mobileNos.forEach(x->System.out.println(x));*/
		
		/*Map<Integer, Bus> mapOfBus = busses.stream().filter(x-> x.getNoOfSeats()>52).collect(Collectors.toMap(y->y.getNoOfSeats(), z->z));
		mapOfBus.forEach((x,y)-> System.out.println(x+" : " + y));*/
		
		
		List<Bus> sortedList = busses.stream().sorted(Comparator.comparingInt(Bus :: getNoOfSeats)).collect(Collectors.toList());
		
		sortedList.forEach(x -> System.out.println(x));
		
		System.out.println();
		System.out.println("**********************************");
		System.out.println();

		List<Bus> sortedList2 = busses.stream().sorted(Comparator.comparing(Bus :: getTravellerName)).collect(Collectors.toList());
		sortedList2.forEach(x -> System.out.println(x));
		
		
		
	}

}
