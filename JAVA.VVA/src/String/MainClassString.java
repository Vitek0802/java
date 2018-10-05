package String;

public class MainClassString {
    public static void main(String[] args) {


        String str1 = " Предложение один    Теперь предложение два     Предложение три";
        System.out.println(str1);

        String str2 = str1.replaceAll(" +", " ");
        System.out.println(str2);

        StringBuilder stringBuilder = new StringBuilder(str2);

        for (int i = 1; i < str2.length(); i++) {
            if (str2.charAt(i) >= 'A' && str2.charAt(i) <= 'Я') {
                stringBuilder.setCharAt(i - 1, '.');

            }
        }
        stringBuilder.deleteCharAt(0);
        stringBuilder.append('.');
        String string = stringBuilder.toString();
        string.substring(0, string.indexOf("."));

            StringBuilder stringBuilder1 = new StringBuilder(string);
//        char[] strArr = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '.'){
                stringBuilder1.insert(i + 1, ' ');
                string = stringBuilder1.toString();
            }
        }
        System.out.println(stringBuilder1.toString());

    }
}


