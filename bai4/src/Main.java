import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("== Math Class ==");
        int absoluteValue = Math.abs(-10);
        System.out.println("Absolute value of -10: " + absoluteValue);
        double powerValue = Math.pow(2, 3);
        System.out.println("2 raised to the power of 3: " + powerValue);
        double sqrtValue = Math.sqrt(16);
        System.out.println("Square root of 16: " + sqrtValue);
        int maxValue = Math.max(5, 10);
        System.out.println("Max of 5 and 10: " + maxValue);
        double randomValue = Math.random();
        System.out.println("Random value between 0.0 and 1.0: " + randomValue);
        System.out.println("\n== ArrayList Class (java.util.ArrayList) ==");
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("ArrayList after add(): " + list);
        String fruit = list.get(1);
        System.out.println("Element at index 1: " + fruit);
        list.remove(2);
        System.out.println("ArrayList after remove(): " + list);
        int size = list.size();
        System.out.println("Size of ArrayList: " + size);
        boolean contains = list.contains("Apple");
        System.out.println("Does list contain 'Apple'? " + contains);
        System.out.println("\n== HashMap Class (java.util.HashMap) ==");
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        System.out.println("HashMap after put(): " + map);
        String value = map.get(2);
        System.out.println("Value for key 2: " + value);
        map.remove(3);
        System.out.println("HashMap after remove(): " + map);
        boolean hasKey = map.containsKey(1);
        System.out.println("Does map contain key 1? " + hasKey);
        int mapSize = map.size();
        System.out.println("Size of HashMap: " + mapSize);
        System.out.println("\n== LinkedList Class (java.util.LinkedList) ==");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Horse");
        System.out.println("LinkedList after add(): " + linkedList);
        linkedList.addFirst("Bird");
        System.out.println("LinkedList after addFirst(): " + linkedList);
        linkedList.removeLast();
        System.out.println("LinkedList after removeLast(): " + linkedList);
        String firstElement = linkedList.getFirst();
        System.out.println("First element: " + firstElement);
        int linkedListSize = linkedList.size();
        System.out.println("Size of LinkedList: " + linkedListSize);
        System.out.println("\n== Calendar Class (java.util.Calendar) ==");
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        System.out.println("Current year: " + year);
        calendar.set(Calendar.YEAR, 2025);
        System.out.println("Year after set(): " + calendar.get(Calendar.YEAR));
        calendar.add(Calendar.MONTH, 2);
        System.out.println("Month after adding 2 months: " + (calendar.get(Calendar.MONTH) + 1));
        System.out.println("Current time: " + calendar.getTime());
        int maxDayOfWeek = calendar.getMaximum(Calendar.DAY_OF_WEEK);
        System.out.println("Maximum value of DAY_OF_WEEK: " + maxDayOfWeek);
        System.out.println("\n== Collections Class (java.util.Collections) ==");
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(3);
        intList.add(9);
        intList.add(1);
        Collections.sort(intList);
        System.out.println("List after sort(): " + intList);
        Collections.reverse(intList);
        System.out.println("List after reverse(): " + intList);
        Collections.shuffle(intList);
        System.out.println("List after shuffle(): " + intList);
        int max = Collections.max(intList);
        System.out.println("Max element in list: " + max);
        int min = Collections.min(intList);
        System.out.println("Min element in list: " + min);
    }
}