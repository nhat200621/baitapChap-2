public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println("After append: " + sb);
        sb.insert(6, "Beautiful ");
        System.out.println("After insert: " + sb);
        sb.replace(6, 15, "Amazing");
        System.out.println("After replace: " + sb);
        sb.delete(6, 14);
        System.out.println("After delete: " + sb);
        sb.reverse();
        System.out.println("After reverse: " + sb);
        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Length: " + sb.length());
        System.out.println("Character at index 4: " + sb.charAt(4));
        sb.setCharAt(4, 'x');
        System.out.println("After setCharAt: " + sb);
        String sub = sb.substring(0, 5);
        System.out.println("Substring(0, 5): " + sub);
    }
}