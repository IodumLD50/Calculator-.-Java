public class CheckRoman {

    public static boolean chRoman(String numbers){
        RomanNumber[]romanNumbers = RomanNumber.values();
        for (int i=0; i < romanNumbers.length; i++) {
            if (numbers.equals(String.valueOf(romanNumbers[i]))){
                return true;
            }
        } return false;
    }

    public static boolean chArabian(String numbers){
        try {
            Integer.valueOf(numbers);
            return true;
        } catch (Exception e){
            return false;
        }
    }

}
