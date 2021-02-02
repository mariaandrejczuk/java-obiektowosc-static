public class Generator {
    public static String text(int size) {
        String chars = "ajhskjhadasdasdfasdfsdfdfgfgdfgdfksjdfhdfg";

        int min = 0;  // 0 bo a(pierwszy znak) jest na zerowej pozycji
        int max = chars.length() - 1; //minus 1 bo idziemy po indeksach

        StringBuilder text = new StringBuilder();
        for (int i = 0; i < size; i++) {
            // losowanie znaku pojedynczego
            int index = (int) (Math.random() * (max - min + 1)) + min;
            char c = chars.charAt(index);

            text.append(c);
        }
        return text.toString();
    }
}
