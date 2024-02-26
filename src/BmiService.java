public class BmiService {
    public int calculate(int mass, double height){
        int bmi = (int)(mass/ Math.pow(height, 2));
        return bmi;

        //ИМТ= вес (кг) / рост (м)2.
    }
}
