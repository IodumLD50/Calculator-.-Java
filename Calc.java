public class Calc {
    public static String calc(String input) throws Exception {
        String[] strInput = input.split("[ ]");
        if (strInput.length != 3) {
            //если длина массива превышает более 3-х значений, выводим исключение.
            throw new Exception("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");}


        //Создал массив из римских цифр
        RomanNumber[] romanNumbers = RomanNumber.values();
        String operand1 = strInput[0];
        String operand2 = strInput[2];
        String operator = strInput[1];
        String result = "";


        if (CheckRoman.chRoman(operand1) && CheckRoman.chArabian(operand2) || CheckRoman.chArabian(operand1) && CheckRoman.chRoman(operand2)) {
            //если операнды содержат одновременно римские и арабские цифры, выводим исключение.
            throw new Exception("используются одновременно разные системы счисления");}

            //если оба операнда арабские, начинаем считать.
        if (CheckRoman.chArabian(operand1) && CheckRoman.chArabian(operand2)) {
            int num1 = Integer.valueOf(operand1);
            int num2 = Integer.valueOf(operand2);
            if (num1 > 10 || num1 < 1 || num2 > 10 || num2 < 1) {
                //если num < 1 и > 10, то выводим исключение.
                throw new Exception("Вводимые числа должны быть > 0 и < 10");}

            switch (operator) {
                case "+":
                    result = Integer.toString(num1 + num2);
                    break;
                case "-":
                    result = Integer.toString(num1 - num2);
                    break;
                case "*":
                    result = Integer.toString(num1 * num2);
                    break;
                case "/":
                    result = Integer.toString(num1 / num2);
                    break;
                default:
                    result = "Введен некорректный знак (+, -, /, *)";
            }
            return result;
        }

        //аналогично с арабскими
        if (CheckRoman.chRoman(operand1) && CheckRoman.chRoman(operand2)) {
            int num1 = RomanNumber.valueOf(operand1).getArabicNumber();
            int num2 = RomanNumber.valueOf(operand2).getArabicNumber();
            int resultRoman;
            if (num1 > 10 || num1 < 1 || num2 > 10 || num2 < 1) {
                throw new Exception("Введите число от 0 до 10");
            } else {

                switch (operator) {
                    case "+":
                        resultRoman = num1 + num2;
                        break;
                    case "-":
                        resultRoman = num1 - num2;
                        break;
                    case "*":
                        resultRoman = num1 * num2;
                        break;
                    case "/":
                        resultRoman = num1 / num2;
                        break;
                    default:
                        resultRoman = 10000;
                }
                //ограничиваем отрицательный результат решения
                if (resultRoman > 0) {
                    //в результат подставлем значения из массива Enum начиная с [0] ячейки
                    return String.valueOf(romanNumbers[resultRoman - 1]);
                }
                throw new Exception("В римской системе нет отрицательных числе");
            }
        }
        return result;
    }
}