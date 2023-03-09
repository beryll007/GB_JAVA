package homeworks;
    //Первый семинар.
    //        1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
    //        2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
    //        3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
    //        4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
    //        Пункты реализовать в методе main
    //        *Пункты реализовать в разных методах
    //        int i = new Random().nextInt(k); //это кидалка случайных чисел!)

    import java.util.Random;
    import java.util.Arrays;
    public class HomeWork001
    {
        public static void main(String[] args) 
        {
            int i = new Random().nextInt(2000);
            System.out.println("Random integer number is: " + i);
            int n = Integer.toBinaryString(i).length();
            System.out.println("Number of the most significant bit is: " + n);
            int[] myArray = new int[(Short.MAX_VALUE - i)];
            int counter = 0;
            for (int j = i; j < Short.MAX_VALUE; j++)
            {
                if (j % n == 0)
                {
                    myArray[j - i] = j;
                    counter ++;
                }
    
            }
    
            int[] m1 = new int[counter];
            int index = 0;
            for (int k = 0; k < myArray.length; k++) {
                if (myArray[k] != 0) {
                    m1[index] = myArray[k];
                    index++;
                }
            }
            System.out.println(counter + " numbers between " + i + " and " + Short.MAX_VALUE + " multiple " + n + " are saved in array m1");
    //        System.out.println(Arrays.toString(m1));
    
            int[] myArray2 = new int[(i - Short.MIN_VALUE)];
            int counter2 = 0;
            for (int j = Short.MIN_VALUE; j < i; j++)
            {
                if (j % n != 0)
                {
                    myArray2[j - Short.MIN_VALUE] = j;
                    counter2 ++;
                }
            }
    
            int[] m2 = new int[counter2];
            int index2 = 0;
            for (int k = 0; k < myArray2.length; k++) {
                if (myArray2[k] != 0) {
                    m2[index2] = myArray2[k];
                    index2++;
                }
            }
            System.out.println(counter2 + " numbers between " + Short.MIN_VALUE + " and " + i + " not multiple " + n + " are saved in array m2");
    //        System.out.println(Arrays.toString(m2));
    
        }
    }
