public class Main {
    public static void main(String[] args) {
        Main main = new Main();
//        String result =main.letterCapitalize("nEVER  gIVE uP");
//        System.out.println(result);
//
        String str = "nEVER  gIVE uP";
        String[] strarr = str.split(" ");
        System.out.println(strarr[6]);

    }

    public String letterCapitalize(String str) {
        // TODO:
        if (str.length() ==0) return "";
        str = str.replaceAll("\\s", " ");

        String [] strarr = str.split(" ");
        String result = "";


        for (int i =0; i < strarr.length; i++) {

            if (strarr[i].length() == 1) strarr[i] = String.valueOf(strarr[i].charAt(0)).toUpperCase();
            else if (strarr[i].equals(" ")) strarr[i] = strarr[i];

            else strarr[i] = String.valueOf(strarr[i].charAt(0)).toUpperCase() + strarr[i].substring(1);
        }

        result = String.join(" ", strarr);
        return result;
    }
}
