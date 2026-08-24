public class Main {
    public static void main(String[] args) {
        try {
            Pilha<Integer> p = new Pilha<Integer>(3);

            p.guardeUmItem(10);
            p.guardeUmItem(20);
            p.guardeUmItem(30);

            System.out.println(p.getUmItem());
            System.out.println(p.removaUmItem());
            System.out.println(p.removaUmItem());
            System.out.println(p.removaUmItem());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
